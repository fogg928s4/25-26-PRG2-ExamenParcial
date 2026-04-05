import assets.*;

class Sala {
    int numero;
    int capacidad;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    public Sala(int capacidad) {
        this(1, capacidad);
    }

    public void cambiarCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void mostrarInformacion() {
        Console consola = new Console();
        consola.write(formatearInfo());
    }
    
    public boolean estaLlena(int asientosVendidos) {
        return asientosVendidos < capacidad;
    }

    private String formatearInfo() {
        return "Sala N° " + numero + "\n"
            + "Capacidad: " + capacidad + " personas"; 
    }
}