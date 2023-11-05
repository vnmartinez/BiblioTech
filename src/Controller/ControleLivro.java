package Controller;

import Model.AutorBEAN;
import Model.LivroBEAN;
import Model.LivroDAO;

import java.util.ArrayList;

public class ControleLivro {
    
    public ControleLivro(){
        
    }

    public void insertLivro(LivroBEAN livro, int idAutor, int idEditora) {
        LivroDAO.getInstance().create(livro);
    }
    
    public void updateLivro(LivroBEAN livro) {
        LivroDAO.getInstance().update(livro);
    }
    
    public void deleteLivro(LivroBEAN livro) {
    	LivroDAO.getInstance().delete(livro);
    }
    
    public void ativarLivro(LivroBEAN livro) {
    	LivroDAO.getInstance().ativar(livro);
    }
    
    public void inativarLivro(LivroBEAN livro) {
    	LivroDAO.getInstance().inativar(livro);
    }
    
    public ArrayList<LivroBEAN> consultaLivro(String nomeBusca, String ativo, String inativo) {
        return LivroDAO.getInstance().consultaLivroFiltros(nomeBusca, ativo, inativo);  
    }
    
    public LivroBEAN consultaLivroById(int id) {
        return LivroDAO.getInstance().findLivroById(id);  
    }
    
    public ArrayList<LivroBEAN> consultaLivroByName(String nomeBusca) {
        return LivroDAO.getInstance().findLivroByName(nomeBusca);  
    }
    
    public ArrayList<LivroBEAN> consultaLivroAtivoByName(String nomeBusca) {
        return LivroDAO.getInstance().findLivroAtivoByName(nomeBusca);  
    }
    
    public ArrayList<LivroBEAN> consultaLivroInativoByName(String nomeBusca) {
        return LivroDAO.getInstance().findLivroInativoByName(nomeBusca);  
    }
    
    public Boolean isExist(int id) {
        return LivroDAO.getInstance().isExist(id);
    }

    public ArrayList<LivroBEAN> listaLivros() {
        return LivroDAO.getInstance().findAllLivro();
    }  
    
    public ArrayList<LivroBEAN> listaLivrosAtivos() {
        return LivroDAO.getInstance().livrosAtivos();
    } 
    
    public ArrayList<AutorBEAN> listaAutoresDoLivro(int id) {
        return LivroDAO.getInstance().listaAutoresDoLivro(id);
    }  
}

