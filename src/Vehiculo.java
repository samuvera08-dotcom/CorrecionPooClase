
public class Vehiculo {

    protected String marca;
    protected int anioFabricacion;
    protected double precioBase;
    protected boolean importado;

    public Vehiculo() {

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
            this.precioBase = precioBase * (importado ? 1.19 : 1.0);
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


}


}
