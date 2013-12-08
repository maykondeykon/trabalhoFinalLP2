package classes;

import java.util.ArrayList;

public class Prova {

	private Materia materia;
	private int numQuestao;
	private ArrayList<Questao> questoes = new ArrayList<Questao>();
	private double notaMaxima;

	public Prova(Materia materia) {
		this.materia = materia;
		this.numQuestao = 0;
		this.notaMaxima = 10;
	}

	public void setQuestao(Questao questao) {
		questoes.add(questao);
		this.numQuestao++;
	}

	public void setNotaMax(double nota) {
		this.notaMaxima = nota;

	}

	public void listarQuestoes() {
		for (int i = 0,j = 1; i < questoes.size(); i++) {
			Questao q = questoes.get(i);
			System.out.println("Questão "+j+"\n"+q.toString());
			j++;
		}
	}

}
