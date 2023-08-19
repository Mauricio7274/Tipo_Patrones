package Trabajo2;

public class main {
    public static void main(String[] args) {
        ProcesoExterno   ProcesoExterno = new ProcesoExterno();
   AdaptadorDeMetodo AdaptadorDeMetodo = new AdaptadorDeMetodo (ProcesoExterno);

        Plataforma_de_pago Plataforma_de_pago = new Plataforma_de_pago();
        Plataforma_de_pago.setMetodoProvisto (AdaptadorDeMetodo);
        Plataforma_de_pago.ProcesoDePago();

}
}

