package classes;

public class Principal {

	public static void main(String[] args) {
		Materia matematica = new Materia("Matemática");
		Materia portugues = new Materia("Português");
		
		Questao q1 = new Questao(matematica, "Some 1+1.");
		Questao q2 = new Questao(matematica, "Some 2+2.");
		Questao q3 = new Questao(portugues, "Marque a forma correta");
		
		Prova prova = new Prova(matematica);
		Prova prova2 = new Prova(portugues);
		
		prova.addQuestao(q1);
		prova.addQuestao(q2);
		
		prova2.addQuestao(q3);
		
		
		prova.listarQuestoes();
		prova2.listarQuestoes();

	}

}
