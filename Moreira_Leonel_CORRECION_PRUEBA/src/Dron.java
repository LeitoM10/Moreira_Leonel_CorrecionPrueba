public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.distanciaKm = distanciaKm;
        this.pesoPaquete = pesoPaquete;
        this.horasVuelo = horasVuelo;
        this.costoBase = costoBase;
    }

    public String getCodigo() { return codigo; }
    public String getModelo() { return modelo; }
    public double getDistanciaKm() { return distanciaKm; }
    public double getPesoPaquete() { return pesoPaquete; }
    public double getHorasVuelo() { return horasVuelo; }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm > 0)
            this.distanciaKm = distanciaKm;
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0)
            this.pesoPaquete = pesoPaquete;
    }

    public void setHorasVuelo(double horasVuelo) {
        if (horasVuelo > 0)
            this.horasVuelo = horasVuelo;
    }

    public abstract double calcularCostoEntrega();
    public abstract boolean validarDatos();

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Peso: " + pesoPaquete + " kg");
        System.out.println("Horas: " + horasVuelo);
    }
}