package Problema2;

public class Main {
    public static void main(String[] args) {
        PagoExterno PagoExterno = new PagoExterno();
        AdaptadorMetodo AdaptadorMetodo = new AdaptadorMetodo(PagoExterno);

        PlataformaPago plataformaPago = new PlataformaPago();
        plataformaPago.setMetodoProvisto(AdaptadorMetodo);
        plataformaPago.ProcesarPagoOrden();

    }
}

