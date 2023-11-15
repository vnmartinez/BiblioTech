package Model;

public class AutorBEAN {
    private int idAutor;
    private String nomeAutor;
    private int statusAutor;
    
    public AutorBEAN(int idAutor, String nomeAutor, int statusAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
        this.statusAutor = statusAutor;
    }
    
    public AutorBEAN(int idAutor, String nomeAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
    }
    
    public AutorBEAN(int idAutor) {
        this.idAutor = idAutor;
    }
    
    public int getIDAutor() {
        return idAutor;
    }
    public void setIDAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getStatusAutor() {
        return statusAutor;
    }
    public void setStatusAutor(int stautsAutor) {
        this.statusAutor = statusAutor;
    }
    
    @Override
    public String toString(){
        return getNomeAutor();
    }
}
