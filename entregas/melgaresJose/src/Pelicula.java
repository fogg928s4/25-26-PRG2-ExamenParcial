import assets.*;

class Pelicula {   
    String titulo;
    String director;
    int duracion;
    int clasificacion;

    public Pelicula(String titulo, String director, int duracion, int clasificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }
    public Pelicula(String titulo, String director) {
        this(titulo, director, 0, 0);
    }
    public Pelicula(String titulo) {
        this(titulo, "");
    }

    public void mostrarInformacion() {
        Console consola = new Console();
        consola.write(formatearAString());
    }
    public boolean esMasLarga(Pelicula pelicula) {
        return duracion > pelicula.duracion;
    }
    public void cambiarClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    private String formatearAString() {
        String seccionTitulo = "Titulo: " + titulo;
        String seccionDirector = "Dirigida por: " + director;
        String seccionDuracion = "Duracion: " + duracion + "min";
        String seccionClasificacion = "Clasificación: " + clasificacion;

        return seccionTitulo + "\n" 
                + seccionDirector + "\n"
                + seccionDuracion + "\n" 
                + seccionClasificacion;
    }
}