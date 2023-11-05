package Controller;

import Model.AmigoBEAN;
import Model.LivroBEAN;
import Model.EmprestimoDAO;
import Model.EmprestimoBEAN;

import java.util.ArrayList;

public class ControleEmprestimo {
    
    public ControleEmprestimo(){
        
    }

    public void insertEmprestimo(EmprestimoBEAN emprestimo, ArrayList<Integer> idLivros) {
        EmprestimoDAO.getInstance().create(emprestimo, idLivros);
    }
    
    public void updateEmprestimo(EmprestimoBEAN emprestimo, ArrayList<Integer> idLivros) {
        EmprestimoDAO.getInstance().update(emprestimo, idLivros);
    }
    
    public void deleteEmprestimo(EmprestimoBEAN emprestimo) {
    	EmprestimoDAO.getInstance().delete(emprestimo);
    }
    
    public void ativarEmprestimo(EmprestimoBEAN emprestimo) {
    	EmprestimoDAO.getInstance().ativar(emprestimo);
    }
    
    public void inativarEmprestimo(EmprestimoBEAN emprestimo) {
    	EmprestimoDAO.getInstance().inativar(emprestimo);
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimo(String nomeBusca, String ativo, String inativo) {
        return EmprestimoDAO.getInstance().consultaEmprestimoFiltros(nomeBusca, ativo, inativo);  
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimoByName(String nomeBusca) {
        return EmprestimoDAO.getInstance().findEmprestimoByName(nomeBusca);  
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimoAtivoByName(String nomeBusca) {
        return EmprestimoDAO.getInstance().findEmprestimoAtivoByName(nomeBusca);  
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimoInativoByName(String nomeBusca) {
        return EmprestimoDAO.getInstance().findEmprestimoInativoByName(nomeBusca);  
    }
    
    public Boolean isExist(int id) {
        return EmprestimoDAO.getInstance().isExist(id);
    }

    public ArrayList<EmprestimoBEAN> listaEmprestimos() {
        return EmprestimoDAO.getInstance().findAllEmprestimo();
    }  
    
    public ArrayList<EmprestimoBEAN> listaEmprestimosAtivos() {
        return EmprestimoDAO.getInstance().emprestimosAtivos();
    } 
    
    public ArrayList<LivroBEAN> listaLivrosDoEmprestimo(int id) {
        return EmprestimoDAO.getInstance().listaLivrosDoEmprestimo(id);
    } 
}

