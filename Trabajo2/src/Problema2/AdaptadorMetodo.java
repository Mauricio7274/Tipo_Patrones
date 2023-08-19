package Problema2;

public class AdaptadorMetodo implements MetodoProvisto {
    private PagoExterno MetodoProvisto;

    public AdaptadorMetodo(PagoExterno MetodoProvisto) {
        this.MetodoProvisto = MetodoProvisto;
    }

    @Override
    public void ProcesoPago() {
        MetodoProvisto.performPagoExterno();
    }
}

