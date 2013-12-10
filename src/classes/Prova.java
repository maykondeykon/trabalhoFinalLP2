package classes;

import java.util.ArrayList;

public class Prova {

	private Materia materia;
	private int qtdQuestoes;
	private ArrayList<Questao> questoes = new ArrayList<Questao>();
	private double notaMaxima;

	public ArrayList<Questao> getQuestoes() {
		return questoes;
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
		if (!this.materia.equals(questao.getMateria())) {
			throw new IllegalArgumentException("Questão '"
					+ questao.getDescricao() + "' não corresponde à matéria "
					+ this.materia.getNomeMateria());
		} else {
			questoes.add(questao);
			this.qtdQuestoes++;
		}

	}

	public void setNotaMax(double nota) {
		this.notaMaxima = nota;

	}

	public void listarQuestoes() {
		System.out.println("\nProva de: " + this.materia.getNomeMateria());
		for (int i = 0, j = 1; i < questoes.size(); i++) {
			Questao q = questoes.get(i);
			System.out.println("Questão " + j + ":\n  " + q.getDescricao());
			j++;
		}
	}

	public void removeQuestao(Questao questao) {
		this.questoes.remove(questao);
		this.qtdQuestoes--;
	}

	public int getQtdQuestoes() {
		return qtdQuestoes;
	}

}
