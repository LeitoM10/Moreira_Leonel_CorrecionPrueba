public class DronEmergencia extends Dron {

    private double recargoUrgencia = 5.0;

    public DronEmergencia(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, 8.0);
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 10 && getHorasVuelo() <= 3;
    }
}