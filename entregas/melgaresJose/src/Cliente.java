class Cliente {
    public static void main(String[] args) {
        Pelicula elPadrino = new Pelicula("El Padrino", "Francis Ford Coppola", 175, 18);
        Pelicula elPadrino2 = new Pelicula("El Padrino II", "Francis Ford Coppola", 202, 18);
        Pelicula elPadrino3 = new Pelicula("El Padrino III", "Francis Ford Coppola", 162, 18);

        Sala sala1 = new Sala(1, 100);
        Sala sala2 = new Sala(2, 150);
        Sala sala3 = new Sala(3, 200);

        Proyeccion proyeccion1 = new Proyeccion(pelicula1, sala1, "2024-07-01 19:00");
        Proyeccion proyeccion2 = new Proyeccion(pelicula2, sala2, "2024-07-01 21:00");
        Proyeccion proyeccion3 = new Proyeccion(pelicula3, sala3, "2024-07-01 23:00");

        Pelicula[] repertorio = { pelicula1, pelicula2, pelicula3};
        Sala[] salas = { sala1, sala2, sala3};
        Proyeccion[] proyecciones = { proyeccion1, proyeccion2, proyeccion3};

        Cine cine = new Cine(repertorio, salas, proyecciones, "Cinepolis Multiplaza");

        cine.exhibiciones[0].mostrarInformacion();
    }   
}