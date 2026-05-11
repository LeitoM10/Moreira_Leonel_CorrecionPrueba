public class DronLiviano extends Dron {

    public DronLiviano(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 3.0);
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.50);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 5 && getHorasVuelo() <= 2;
    }
}