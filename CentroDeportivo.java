public class CentroDeportivo {
    private String nombre;
    private String tipo;
    private String categoria;
    private int precio = 5;
    private double horasdisponibles = 12;
    private double horasreservadas = 0;

    /**Constructores y Desctructores*/

    public CentroDeportivo() {
    }

    public CentroDeportivo(String nombre, String tipo, String categoria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public CentroDeportivo(String nombre, String tipo, String categoria, int precio, double horasdisponibles, double horasreservadas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
        this.horasdisponibles = horasdisponibles;
        this.horasreservadas = horasreservadas;
    }


    /**Metodos propios de JAVA*/

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getHorasdisponibles() {
        return horasdisponibles;
    }

    public void setHorasdisponibles(double horasdisponibles) {
        this.horasdisponibles = horasdisponibles;
    }

    public double getHorasreservadas() {
        return horasreservadas;
    }

    public void setHorasreservadas(double horasreservadas) {
        this.horasreservadas = horasreservadas;
    }

    /**Metodos propios*/

    public void detalle(){
        System.out.println("Tu Nombre es              : " + this.nombre);
        System.out.println("Tu Tipo   es              : " + this.tipo);
        System.out.println("Tu Categoria es           :"  + this.categoria);
        System.out.println("El Precio por hora es     :" + this.precio);
        System.out.println("Las Horas Disponibles son :" + this.horasdisponibles);
        System.out.println("Las Horas Reservadas  son :" + this.horasreservadas);
    }
}

