class Vehiculo {
    protected String marca;
    protected int anioFabricacion;
    protected double precioBase;
    protected boolean importado;

    public Vehiculo() {
        marca = "Sin marca";
        anioFabricacion = 2024;
        precioBase = 0.0;
    }

    public Vehiculo(String marca, int anioFabricacion) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        precioBase = 50000000;
        importado = false;
    }

    public Vehiculo(String marca, int anioFabricacion, double precioBase) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        importado = false;
    }

    public Vehiculo(String marca, int anioFabricacion, double precioBase, boolean importado) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.importado = importado;
        this.precioBase = precioBase * (importado = true ? 1.19 : 1.0);
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioBase() {
        double precioBase = 0;
        return precioBase;
    }

    public boolean esImportado() {
        return importado;
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo otro = (Vehiculo) obj;
        return this.marca == otro.marca;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", anio=" + anioFabricacion
                + ", precioBase=" + precioBase + ", importado=" + importado + "]";
    }
}

class VehiculoElectrico extends Vehiculo {
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
        int garantiaMeses = 12;
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

public class EjercicioHerenciaConstructoresLimpio {
    public static void main(String[] args) {

        System.out.println("=== INSTANCIACION DE OBJETOS VEHICULO ===");

        Vehiculo v1 = new Vehiculo();
        System.out.println("v1 -> " + v1);

        Vehiculo v2 = new Vehiculo("Renault", 2020);
        System.out.println("v2 -> " + v2);

        Vehiculo v3 = new Vehiculo("Mazda", 2022, 85000000);
        System.out.println("v3 -> " + v3);

        Vehiculo v4 = new Vehiculo("Audi", 2023, 120000000, true);
        System.out.println("v4 -> " + v4);

        System.out.println();
        System.out.println("=== INSTANCIACION DE OBJETOS VEHICULO ELECTRICO ===");

        VehiculoElectrico e1 = new VehiculoElectrico();
        System.out.println("e1 -> " + e1);

        VehiculoElectrico e2 = new VehiculoElectrico(60.0, 350);
        System.out.println("e2 -> " + e2);

        VehiculoElectrico e3 = new VehiculoElectrico("Tesla", 2023, 75.0, 450, 'D');
        System.out.println("e3 -> " + e3);

        VehiculoElectrico e4 = new VehiculoElectrico(
                "BYD", 2024, 150000000, true, 80.0, 500, 'D', 48L);
        System.out.println("e4 -> " + e4);
        System.out.println("e4 detallado -> " + e4.toString(true));

        System.out.println();
        System.out.println("=== COMPARACION DE OBJETOS ===");
        Vehiculo v5 = new Vehiculo("Renault", 2020);
        System.out.println("v2.equals(v5): " + v2.equals(v5));

        System.out.println();
        System.out.println("=== VERIFICACION DE GETTERS ===");
        System.out.println("Precio base de v4 (getter): " + v4.getPrecioBase());
        System.out.println("Precio base de v4 (toString): incluido arriba");
    }
}