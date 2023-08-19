package Problema2;

public class PlataformaPago {
    private MetodoProvisto metodoProvisto;


    public void setMetodoProvisto(MetodoProvisto metodoProvisto) {
        this.metodoProvisto = metodoProvisto;
    }
    public void ProcesarPagoOrden() {
        // Lógica de procesamiento de pago
        metodoProvisto.ProcesoPago();
    }
}
