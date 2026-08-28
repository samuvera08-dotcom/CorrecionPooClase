
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