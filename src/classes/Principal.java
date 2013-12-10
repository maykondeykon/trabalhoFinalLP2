package classes;

public class Principal {

	public static void main(String[] args) {
		// criando mátérias
		Materia matematica = new Materia("Matemática");
		Materia portugues = new Materia("Português");

		// criando questões
		Questao q1 = new Questao(matematica, "Some 1+1.");
		Questao q2 = new Questao(matematica, "Some 2+2.");
		Questao q3 = new Questao(portugues, "Marque a forma correta");

		// criando provas
		Prova prova1 = new Prova(matematica);
		Prova prova2 = new Prova(portugues);

		// adicionando questões à prova
		try {
			prova1.addQuestao(q1);
			prova1.addQuestao(q2);
			prova2.addQuestao(q3);
			prova2.addQuestao(q1);//lança exceção

		} catch (IllegalArgumentException e) {
			//caso a questão não seja da matéria da prova, lança uma exceção
			System.out.println(e.getMessage());
		}

		// lista questões da prova
		prova1.listarQuestoes();
		prova2.listarQuestoes();

		// edita questão
		q1.setDescricao("Raiz quadrada de 9");

		prova1.listarQuestoes();

		// remove questão
		prova1.removeQuestao(q2);
		
		//seta nota máxima
		prova1.setNotaMax(6);

		prova1.listarQuestoes();

		// lista quantidade de questões e nota máxima
		System.out.println(
				"Quantidade de questões: " + prova1.getQtdQuestoes()+
				"\nNota máxima: "+prova1.getNotaMaxima()
				);

	}

}
