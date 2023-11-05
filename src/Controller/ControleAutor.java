package Controller;

import Model.AutorBEAN;
import Model.AutorDAO;
import java.util.ArrayList;

public class ControleAutor {
    
    public ControleAutor(){
        
    }

    public void inserirAutor(AutorBEAN autor) {
        AutorDAO.getInstance().create(autor);
    }
    
    public void editarAutor(AutorBEAN autor) {
        AutorDAO.getInstance().update(autor);
    }
    
    public void excluirAutor(AutorBEAN autor) {
    	AutorDAO.getInstance().delete(autor);
    }
    
    public void inativarAutor(AutorBEAN autor){
        AutorDAO.getInstance().inactive(autor);
    }
    
    public void ativarAutor(AutorBEAN autor){
        AutorDAO.getInstance().active(autor);
    }
    
    public ArrayList<AutorBEAN> consultaAutor(String nomeBusca) {
        return AutorDAO.getInstance().findAutorByName(nomeBusca);  
    }
    
    public ArrayList<AutorBEAN> consultaAutoresAtivos(String nomeBusca) {
        return AutorDAO.getInstance().findAutoresAtivos(nomeBusca);  
    }
    
    public ArrayList<AutorBEAN> consultaAutoresInativos(String nomeBusca) {
        return AutorDAO.getInstance().findAutoresInativos(nomeBusca);  
    }
    
    public AutorBEAN consultaAutorById(int id) {
        return AutorDAO.getInstance().findAutorById(id);  
    }
    
    public Boolean isExist(int id) {
        return AutorDAO.getInstance().isExist(id);
    }

    public ArrayList<AutorBEAN> listaAutores() {
        return AutorDAO.getInstance().findAllAutor();
    }  
    
    public ArrayList<AutorBEAN> listaAutoresAtivos() {
        return AutorDAO.getInstance().autoresAtivos();
    } 
    
    public String retornaNomeAutor(int idAutor){
        return AutorDAO.getInstance().retornaNomeAutor(idAutor);
    }
}
