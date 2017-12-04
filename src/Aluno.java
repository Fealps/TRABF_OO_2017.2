import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import exceptionpac.BlankException;

public class Aluno {

	private String nome;
	private String matricula;
	static private ArrayList<Aluno> alunos = new ArrayList<>();

	
	  public Aluno(String nome, String matricula) { 
		  this.setNome(nome) ;
		  this.setMatricula(matricula);
	  }
	 
	
	  static void cadastrar(Aluno a) {
		
		/*
		Scanner in = new Scanner(System.in);
		
		String n = 
				JOptionPane.showInputDialog("Informe o seu nome ");
		a.setNome(n);
		
		String m = 
				JOptionPane.showInputDialog("Informe a sua matricula ");
		a.setMatricula(m);
		
		alunos.add(a);*/
		
		
		alunos.add(a);
		
		String message = 
				String.format("O aluno %s com a matrícula %s"
						+ " foi matriculado com sucesso ", a.getNome(),a.getMatricula());
		
		JOptionPane.showMessageDialog(null, message,"Cadastro de alunos", JOptionPane.PLAIN_MESSAGE);
	System.out.printf("O aluno %s com a matrícula %s"
	+ " foi matriculado com sucesso ", a.getNome(),a.getMatricula());
	}

	static Aluno pesquisar(String n) {

		Aluno resposta = null;

		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (n.equals(aluno.nome)) {
				System.out.println("o aluno " + n + ",da matricula " + aluno.getMatricula() + " esta na posiçao " + i);
				break;
			} else {
				System.out.println("Esse aluno nao existe!!");
			}
		}

		return resposta;

	}

	static void excluir(Aluno a) {

		alunos.remove(a);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equals("")) {
			try {
				throw new BlankException("O nome não pode ser em branco!");
			} catch (BlankException e) {
				nome = JOptionPane.showInputDialog("Informe o nome novamente: ");
				setNome(nome);
				e.printStackTrace();
			}
		}

		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.equals(""))
			try {
				throw new BlankException("A matrícula não pode estar vazia");
			} catch (BlankException e) {
				matricula = JOptionPane.showInputDialog("Informe a matrícula novamente");
				setMatricula(matricula);
				e.printStackTrace();
			}
	}

	/*
	 * public static Aluno getAlunos() { return alunos; }
	 * 
	 * public static void setAlunos(Aluno alunos) { Aluno.alunos = alunos; }
	 */
}
