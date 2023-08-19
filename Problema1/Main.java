package Problema1;

public class Main {
    public static void main(String[] args) {
        ProcesadorPedidos ProcesoElectronico = new ProcesoElectronico();
        ProcesadorPedidos ProcesoRopa = new ProcesoRopa();
        ProcesadorPedidos ProcesoAlimentos = new ProcesoAlimentos();

        ProcesoElectronico.ProcesadorPedidos();
        ProcesoRopa.ProcesadorPedidos();
        ProcesoAlimentos.ProcesadorPedidos();
    }
}
