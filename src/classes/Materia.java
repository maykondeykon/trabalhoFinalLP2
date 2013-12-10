package classes;

public class Materia {

	private String nome;

	public Materia(String nome) {
		this.nome = nome;
	}

	public String getNomeMateria() {
		return nome;
	}

	public boolean equals(Materia materia) {
		return this.nome.equals(materia.getNomeMateria());
	}

}
