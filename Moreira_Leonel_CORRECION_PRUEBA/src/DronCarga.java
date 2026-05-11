public class DronCarga extends Dron {

    private double costoPorKg = 1.20;

    public DronCarga(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 6.0);
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getPesoPaquete() * costoPorKg * 0.70);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 30 && getHorasVuelo() <= 5;
    }
}