package Model;

public class EditoraBEAN{
    private int idEditora;
    private String nomeEditora;
    private int statusEditora;

    public EditoraBEAN(int idEditora, String nomeEditora, int statusEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
        this.statusEditora = statusEditora;
    }

    public EditoraBEAN(int idEditora, String nomeEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
    }
    
    public EditoraBEAN(int idEditora) {
        this.idEditora = idEditora;
    }

    public int getIDEditora() {
        return idEditora;
    }
    public void setIDEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getStatusEditora() {
        return statusEditora;
    }
    public void setStatusEditora(int statusEditora) {
        this.statusEditora = statusEditora;
    }  
    
    @Override
    public String toString(){
        return getNomeEditora();
    }
}

