package Model;

import java.util.Date;

public class EmprestimoBEAN {
    private int idEmprestimo;
    private int idAmigos;
    private String descricao;
    private Date data = new Date();
    private Date datafim = new Date();
    private String statusEmprestimo;

    public EmprestimoBEAN(int idEmprestimo, int idAmigos, String descricao, Date data, Date datafim, String statusEmprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigos = idAmigos;
        this.descricao = descricao;
        this.data = data;
        this.datafim = datafim;
        this.statusEmprestimo = statusEmprestimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public EmprestimoBEAN(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    
    public int getIDEmprestimo() {
        return idEmprestimo;
    }
    public void setIDEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataFim() {
        return datafim;
    }
    public void setDataFim(Date datafim) {
        this.datafim = datafim;
    }

    public int getIDAmigos() {
        return idAmigos;
    }
    public void setIDAmigos(int idAmigos) {
        this.idAmigos = idAmigos;
    }
    
    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }
    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
}
