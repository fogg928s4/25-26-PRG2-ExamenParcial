class Cine {
    Pelicula[] repertorio;
    Sala[] salas;
    Proyeccion[] exhibiciones;
    String nombre; 
    
    public Cine(Pelicula[] peliculas, Sala[] salas, Proyeccion[] proyecciones, String nombre) {
        repertorio = peliculas;
        this.salas = salas;
        exhibiciones = proyecciones;
        this.nombre = nombre;
    }
    public Cine(Sala[] salas, String nombre) {
        this(null, salas, null, nombre);
    }
    public Cine(String nombre) {
        this(null, nombre);
    }
}
