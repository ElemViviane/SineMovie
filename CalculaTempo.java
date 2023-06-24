package br.com.alura.screenmatch2.calculos;
import br.com.alura.modelos.Título;

public class CalculadoradeTempo {
	private int  tempoTotal;
		
	public int getTempoTotal() {
	  return tempoTotal;

}

    public void calculaTempo(Título t) {
    	tempoTotal += t.getDuracaoEmMinutos();
    }
}
