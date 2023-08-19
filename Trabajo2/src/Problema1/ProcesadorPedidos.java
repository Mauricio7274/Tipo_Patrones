package Problema1;

abstract class ProcesadorPedidos{
    public final void ProcesadorPedidos() {
        VerificacionInventario();
       Paso1();
        Facturacion();
        Paso2();
        AvisoConsumidor();
    }

    protected abstract void Paso1();
    protected abstract void Paso2();

    private void  VerificacionInventario() {

    }

    private void Facturacion() {

    }

    private void AvisoConsumidor() {

    }
}


