package Model;

public class LivroBEAN {
    private int idLivro;
    private String titulo;
    private String statusLivro;
    private int idEditora;
    private int idAutor;

    public LivroBEAN(int idLivro, String titulo, String statusLivro, int idEditora, int idAutor) {
        this.idLivro = idLivro;
        this.titulo = titulo;

        this.statusLivro = statusLivro;
        this.idEditora = idEditora;
        this.idAutor = idAutor; 
    }
    
    public LivroBEAN(int idLivro) {
        this.idLivro = idLivro;
    }
    
    public int getIDLivro() {
        return idLivro;
    }

    public void setIDLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(String statusLivro) {
        this.statusLivro = statusLivro;
    }

    public int getIDEditora() {
        return idEditora;
    }

    public void setIDEditora(int idEditora) {
        this.idEditora = idEditora;
    }    
    
    public int getidAutor (){
        return idAutor;
    }
    
    public void setidAutor(int idAutor){
       this.idAutor = idAutor;
    }
}
