public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva;

    Publicacion(String id, String autor){
        this.id= id;
        this.autor= autor;
        this.likes=0;
    }

    public void validarAutor(String autor){
        if (autor.length() > 20) {
            System.err.println("El nombre del autor no púede exceder los 20 caracteres");
        }
        else if (autor.isEmpty()){
            System.err.println("El nombre no puede ser vacio.");
        }
        else{
            this.autor= autor;
        }  
    }
    public String getAutor(){
        return this.autor;
    }

    public void darLikes(){
        //this.likes= this.likes +1;
        this.likes +=1;
    }

    public int verLikes(){
        return this.likes;
    }

}
