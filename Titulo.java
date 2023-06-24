package br.com.alura.modelos;

public class Título implements Comparable<Título>{
	
	private String nome;
	private boolean incluidoNoPlano;
	private double SomaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int anoDeLancamento;
	private int duracaoEmMinutos;
	

	public Título(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {	
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getDuracaoEmMinutos(){	
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {
		if(this.incluidoNoPlano ==  true) {
			System.out.println("Incluido no plano");
		}else {
			System.out.println("Não está incluído no plano");
		}
		System.out.println("Nome: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	
		
	}

	public void avalia(double nota) {
		SomaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
		return SomaDasAvaliacoes/totalDeAvaliacoes;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " (" + getAnoDeLancamento() + ")";
	}

	@Override
	public int compareTo(Título outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}


}
