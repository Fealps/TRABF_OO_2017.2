import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Turma {

	private String disciplina;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Turma> turmas = new ArrayList<>();

	
	public Turma(String disciplina) {
		
		this.setDisciplina(disciplina);
	
	}

	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public boolean matricular(Aluno a) {
		boolean resposta = false;
		resposta = alunos.add(a);
		return resposta;
	}

	public boolean desmatricular(Aluno a) {
		boolean resposta = false;
		resposta = alunos.remove(a);
		return resposta;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
		JOptionPane.showMessageDialog(null,disciplina+" cadastrada com sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE);

	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void cadastrar(Turma t) {
		this.turmas.add(t);
		System.out.println("Turma cadastrada com sucesso");
	}
	
	
	

	

}
