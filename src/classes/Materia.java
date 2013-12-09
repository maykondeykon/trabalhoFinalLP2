package classes;

public class Materia {
	
	private String nome;
	
	public Materia(String nome){
		this.nome = nome;
	}

	public String getMateria() {
		return nome;
	}
	
	public boolean equals(Materia materia) {
		
		return this.nome.equals(materia.getMateria());
	}

}
