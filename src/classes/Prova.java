package classes;

import java.util.ArrayList;

public class Prova {

	private Materia materia;
	private int qtdQuestoes;
	private ArrayList<Questao> questoes = new ArrayList<Questao>();
	private double notaMaxima;

	public int getQtdQuestoes() {
		return qtdQuestoes;
	}

	public double getNotaMaxima() {
		return notaMaxima;
	}

	public Prova(Materia materia) {
		this.materia = materia;
		this.qtdQuestoes = questoes.size();
		this.notaMaxima = 10;
	}

	public void addQuestao(Questao questao) {

		if (!materia.equals(questao.getMateria())) {
			System.out.println("matérias não correspondem");//criar exceção para tratar
		} else {
			questoes.add(questao);
			this.qtdQuestoes++;
		}

	}

	public void setNotaMax(double nota) {
		this.notaMaxima = nota;

	}

	public void listarQuestoes() {
		for (int i = 0, j = 1; i < questoes.size(); i++) {
			Questao q = questoes.get(i);
			System.out.println("Questão " + j + "\n" + q.toString());
			j++;
		}
	}

}
