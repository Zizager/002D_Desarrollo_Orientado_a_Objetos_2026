public class Instagram {
    public static void main(String[] args) {
        System.out.println("***Iniciando Sistema***");

        crearPublicacion();
    }

    static void crearPublicacion(){
        Publicacion publicacion_sebita = new Publicacion("1", "@Sebita1234");

        Publicacion publicacion_barbarita = new Publicacion("2", "@Barbarita1234");

        Publicacion publicacion_alexander = new Publicacion("3", "@Alexander1234");

        System.out.println("Los autores son:");
        System.out.println(publicacion_sebita.getAutor());
        System.out.println(publicacion_barbarita.getAutor());
        System.out.println(publicacion_alexander.getAutor());

        for (int contador = 0; contador < 1000; contador++) {
            publicacion_alexander.darLikes();
        }

        System.out.println("Los likes de " +publicacion_sebita.getAutor() + " son " + publicacion_sebita.verLikes());
        System.out.println("Los likes de " +publicacion_barbarita.getAutor() + " son " + publicacion_barbarita.verLikes());
        System.out.println("Los likes de " +publicacion_alexander.getAutor() + " son " + publicacion_alexander.verLikes());
    }
}
