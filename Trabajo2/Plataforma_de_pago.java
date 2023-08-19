package Trabajo2;

public class Plataforma_de_pago{
    private MetodoProvisto MetodoProvisto;



    public void setMetodoProvisto(MetodoProvisto MetodoDePago) {
        this.MetodoProvisto = MetodoProvisto;
    }
    public void ProcesoDePago() {

        MetodoProvisto.ProcesoDePago();
    }
}
