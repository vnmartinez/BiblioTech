package Controller;

import Model.EditoraBEAN;
import Model.EditoraDAO;
import java.util.ArrayList;

public class ControleEditora {
    
    public ControleEditora(){
        
    }
    
    public void inserirEditora(EditoraBEAN editora) {
        EditoraDAO.getInstance().create(editora);
    }
    
    public void editarEditora(EditoraBEAN editora) {
    	EditoraDAO.getInstance().update(editora);
    }
    
    public void excluirEditora(EditoraBEAN editora) {
    	EditoraDAO.getInstance().delete(editora);
    }
    
    public void inativarEditora(EditoraBEAN editora){
        EditoraDAO.getInstance().inactive(editora);
    }
    
    public void ativarEditora(EditoraBEAN editora){
        EditoraDAO.getInstance().active(editora);
    }
    
    public ArrayList<EditoraBEAN> consultaEditora(String nomeBusca) {
        return EditoraDAO.getInstance().findEditoraByName(nomeBusca);  
    } 
    
    public ArrayList<EditoraBEAN> consultaEditoraAtiva(String nomeBusca) {
        return EditoraDAO.getInstance().findEditoraAtiva(nomeBusca);  
    }
    
    public ArrayList<EditoraBEAN> consultaEditoraInativa(String nomeBusca) {
        return EditoraDAO.getInstance().findEditoraInativa(nomeBusca);  
    }
    
    public String consultaEditoraById(int idBusca) {
        return EditoraDAO.getInstance().nomeEditora(idBusca);  
    } 
    
    public Boolean isExist(int id) {
        return EditoraDAO.getInstance().isExist(id);
    }

    public ArrayList<EditoraBEAN> listaEditoras() {
        return EditoraDAO.getInstance().findAllEditoras(); 
    } 
    
    public ArrayList<EditoraBEAN> listaEditorasAtivas() {
        return EditoraDAO.getInstance().editorasAtivas();
    } 
}
