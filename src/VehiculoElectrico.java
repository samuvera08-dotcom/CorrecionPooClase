public class VehiculoElectrico extends Vehiculo {
    private double capacidadBateriaKWh;
    private int autonomiaKm;
    private char tipoCargador;
    private long garantiaMeses;

    public VehiculoElectrico() {
        capacidadBateriaKWh = 40.0;
        autonomiaKm = 300;
        tipoCargador = 'A';
        garantiaMeses = 36;
    }

    public VehiculoElectrico(double capacidadBateriaKWh, int autonomiaKm) {
        this.capacidadBateriaKWh = capacidadBateriaKWh;
        this.autonomiaKm = autonomiaKm;
        tipoCargador = 'A';
        garantiaMeses = 24;
    }

    public VehiculoElectrico(String marca, int anioFabricacion, double capacidadBateriaKWh,
                             int autonomiaKm, char tipoCargador) {
        super(marca, anioFabricacion);
        this.capacidadBateriaKWh = capacidadBateriaKWh;
        this.autonomiaKm = (int) capacidadBateriaKWh;
        this.tipoCargador = tipoCargador;
        garantiaMeses = 36;
    }

    public VehiculoElectrico(String marca, int anioFabricacion, double precioBase,
                             boolean importado, double capacidadBateriaKWh,
                             int autonomiaKm, char tipoCargador, long garantiaMeses) {
        super(marca, anioFabricacion, precioBase, importado);
        this.capacidadBateriaKWh = capacidadBateriaKWh;
        this.autonomiaKm = autonomiaKm;
        this.tipoCargador = tipoCargador;
        this.garantiaMeses = garantiaMeses;
    }

    public double getCapacidadBateriaKWh() {
        return capacidadBateriaKWh;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public String toString(boolean detallado) {
        return super.toString() + " | bateria=" + capacidadBateriaKWh
                + "kWh, autonomia=" + autonomiaKm + "km, cargador=" + tipoCargador
                + ", garantia=" + garantiaMeses + " meses";
    }
}