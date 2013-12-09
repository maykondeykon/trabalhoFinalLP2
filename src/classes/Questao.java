package classes;


public class Questao {
	
	private String descricao;
	private Materia materia;
	
	public Questao(Materia materia,String descricao ){
		
		this.materia = materia;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {

		return "Matéria: "+this.getMateria().getMateria()+":\n"+this.descricao;
	}

	public Materia getMateria() {
		return materia;
	}

	

}
