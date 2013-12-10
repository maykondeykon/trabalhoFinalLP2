package classes;

public class Questao {

	private String descricao;
	private Materia materia;

	public Questao(Materia materia, String descricao) {
		this.materia = materia;
		this.descricao = descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public Materia getMateria() {
		return materia;
	}

}
