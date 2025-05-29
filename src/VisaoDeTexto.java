import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {
    private EstatisticasCampo estatisticas;

    public VisaoDeTexto(){
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        String detalhes = estatisticas.obterDetalhesPopulacao(campo);
        System.out.println("Passo " + passo + " - " + detalhes);
        
    }
    
    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    @Override
    public void reabilitarOpcoes() {
    }

    @Override
    public void definirCor(Class<?> tipoAnimal, Color cor) {
    }
}


