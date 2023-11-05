package Controller;

import Model.AmigoBEAN;
import Model.AmigoDAO;
import java.util.ArrayList;

public class ControleAmigo {
    public ControleAmigo(){
        
    }

    public void insertAmigo(AmigoBEAN amigo) {
        AmigoDAO.getInstance().create(amigo);
    }
    
    public void updateAmigo(AmigoBEAN amigo) {
        AmigoDAO.getInstance().update(amigo);
    }
    
    public void deleteAmigo(AmigoBEAN amigo) {
    	AmigoDAO.getInstance().delete(amigo);
    }
    
    public void ativarAmigo(AmigoBEAN amigo) {
    	AmigoDAO.getInstance().ativar(amigo);
    }
    
    public void inativarAmigo(AmigoBEAN amigo) {
    	AmigoDAO.getInstance().inativar(amigo);
    }
    
    public ArrayList<AmigoBEAN> consultaAmigo(String nomeBusca) {
        return AmigoDAO.getInstance().findAmigoByName(nomeBusca);  
    }
    
    public ArrayList<AmigoBEAN> consultaAmigosAtivos(String nomeBusca) {
        return AmigoDAO.getInstance().findAmigosAtivos(nomeBusca);  
    }
    
    public ArrayList<AmigoBEAN> consultaAmigosInativos(String nomeBusca) {
        return AmigoDAO.getInstance().findAmigosInativos(nomeBusca);  
    }
    
    public String consultaAmigoById(int idBusca) {
        return AmigoDAO.getInstance().nomeAmigo(idBusca);  
    } 
    
    public Boolean isExist(int id) {
        return AmigoDAO.getInstance().isExist(id);
    }

    public ArrayList<AmigoBEAN> listaAmigos() {
        return AmigoDAO.getInstance().findAllAmigo();
    }  
    
    public ArrayList<AmigoBEAN> listaAmigosAtivos(){
        return AmigoDAO.getInstance().amigosAtivos();
    }
}
