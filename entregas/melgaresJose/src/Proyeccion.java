import assets.*;

class Proyeccion {
    Pelicula pelicula;
    Sala sala;
    FechaHora fechaHora;
    double precio;
    int entradasVendidas;

    public Proyeccion(Pelicula pelicula, Sala sala, FechaHora fechaHora, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.fechaHora = fechaHora;
        this.precio = precio;
        entradasVendidas = 0;
    }
    public Proyeccion(Pelicula pelicula, double precio) {
        this(pelicula, null, null, precio);
    }
    public Proyeccion(Proyeccion proyeccion) {
        this(
            proyeccion.pelicula,
            proyeccion.sala,
            proyeccion.fechaHora,
            proyeccion.precio
        );
    }

    public void cambiarFechaHora(FechaHora fechaHora) {
        this.fechaHora = fechaHora;
    }
    public void cambiarSala(Sala sala) {
        this.sala = sala;
    }

    public void venderEntradas(int entradas) {
        if(hayDisponibilidad()) {
            entradasVendidas = entradasVendidas + entradas;
        }
    }
    public void mostrarDisponibilidad() {
        Console consola = new Console();
        if(hayDisponibilidad()) {
            int asientosDisponibles = sala.obtenerAsientosDisponibles(entradasVendidas);
            consola.writeln("Hay " + asientosDisponibles + "asientos disponibles");
        }
        else {
            consola.writeln("No hay asientos disponibles...");
        }
    }
    public double calcularRecaudacion() {
        return precio * entradasVendidas;
    }
    
    private boolean hayDisponibilidad() {
        return !sala.estaLlena(entradasVendidas);
    }
}