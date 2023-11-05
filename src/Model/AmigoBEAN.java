package Model;

public class AmigoBEAN {
    private int idAmigo;
    private String nomeAmigo;
    private String cpfAmigo; 
    private String telefoneAmigo;
    private int statusAmigo;
    
    public AmigoBEAN(int idAmigo, String nomeAmigo, String cpfAmigo, String telefoneAmigo, int statusAmigo) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.cpfAmigo = cpfAmigo;
        this.telefoneAmigo = telefoneAmigo;
        this.statusAmigo = statusAmigo;        
    }
    
    public AmigoBEAN(int idAmigo, String nomeAmigo, String cpfAmigo, String telefoneAmigo) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.cpfAmigo = cpfAmigo;
        this.telefoneAmigo = telefoneAmigo;       
    }
    
    public AmigoBEAN(int idAmigo) {
        this.idAmigo = idAmigo;        
    }

    public int getIDAmigo() {
        return idAmigo;
    }
    public void setIDAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }
    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getCPFAmigo() {
        return cpfAmigo;
    }
    public void setCPFAmigo(String cpfAmigo) {
        this.cpfAmigo = cpfAmigo;
    }

    public String getTelefoneAmigo() {
        return telefoneAmigo;
    }
    public void setTelefoneAmigo(String telefoneAmigo) {
        this.telefoneAmigo = telefoneAmigo;
    }

    public int getStatusAmigo() {
        return statusAmigo;
    }
    public void setStatusAmigo(int statusAmigo) {
        this.statusAmigo = statusAmigo;
    }
    
    @Override
    public String toString(){
        return getNomeAmigo();
    }
}


    
