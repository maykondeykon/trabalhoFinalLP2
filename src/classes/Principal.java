package classes;

public class Principal {

	public static void main(String[] args) {
		Materia matematica = new Materia("Matemática");
		Materia portugues = new Materia("Português");
		
		Questao q1 = new Questao(matematica, "Some 1+1.");
		Questao q2 = new Questao(matematica, "Some 2+2.");
		Questao q3 = new Questao(portugues, "Marque a forma correta");
		
		Prova prova1 = new Prova(matematica);
		Prova prova2 = new Prova(portugues);
		
		prova1.addQuestao(q1);
		prova1.addQuestao(q2);
		
		prova2.addQuestao(q3);
		
		
		prova1.listarQuestoes();
		//prova2.listarQuestoes();
		
		q1.setDescricao("Raiz quadrada de 9");
		prova1.listarQuestoes();
		
		prova1.removeQuestao(q2);
		prova1.listarQuestoes();
		System.out.println(prova1.getQtdQuestoes());

	}

}
