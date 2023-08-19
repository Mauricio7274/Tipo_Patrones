package Trabajo2;

public class AdaptadorDeMetodo implements MetodoProvisto {
    private ProcesoExterno MetodoProvisto;

    public AdaptadorDeMetodo(ProcesoExterno MetodoProvisto) {
        this.MetodoProvisto = MetodoProvisto;
    }

    @Override
    public void ProcesoDePago() {
        MetodoProvisto.performProcesoExterno();
    }
}

