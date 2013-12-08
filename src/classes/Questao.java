package classes;


public class Questao {
	
	static int cont = 0;
	private int numero;
	private String descricao;
	private Materia materia;
	
	public Questao(Materia materia,String descricao ){
		
		this.materia = materia;
		this.descricao = descricao;
		//this.numero = ++cont;
	}
	
	@Override
	public String toString() {

		//return "Matéria: "+this.materia.getMateria()+"\nQuestão "+numero+":\n"+this.descricao;
		return "Matéria: "+this.materia.getMateria()+":\n"+this.descricao;
	}

}
