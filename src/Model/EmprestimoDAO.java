package Model;

import Controller.ControleAmigo;
import Controller.ControleLivro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmprestimoDAO {
    private static EmprestimoDAO instance;

    private EmprestimoDAO() {
        MySQLDAO.getConnection();
    }

    public static EmprestimoDAO getInstance() {
        if (instance == null) {
            instance = new EmprestimoDAO();
        }
        return instance;
    }

    public void create(EmprestimoBEAN emprestimo, ArrayList<Integer> idLivros) {
        String query = "INSERT INTO EMPRESTIMOS (idAmigos, DESCRICAO, DATA, DATAFIM, STATUSEMPRESTIMO) VALUES (?,?,?,?,?)";
        MySQLDAO.executeQuery(query, emprestimo.getIDAmigos(), emprestimo.getDescricao(), emprestimo.getData(), emprestimo.getDataFim(), "Ativo");
        
        for (int i = 0; i < idLivros.size(); i++) {
            String query2 = "INSERT INTO LIVROEMPRESTIMO (idEmprestimo, idLivro) VALUES (?,?)";
            MySQLDAO.executeQuery(query2, findMaxIDEmprestimo(), idLivros.get(i));
        }
    }
   
    public void update(EmprestimoBEAN emprestimo, ArrayList<Integer> idLivros) {
        MySQLDAO.executeQuery("DELETE FROM LIVROEMPRESTIMO WHERE idEmprestimo = ?", emprestimo.getIDEmprestimo());
        
        for (int i = 0; i < idLivros.size(); i++) {
            String query1 = "INSERT INTO LIVROEMPRESTIMO (idEmprestimo, idLivro) VALUES (?,?)";
            MySQLDAO.executeQuery(query1, emprestimo.getIDEmprestimo(), idLivros.get(i));
        }
        
        String query = "UPDATE EMPRESTIMOS SET idAmigos=?, DESCRICAO=?, DATA=?, DATAFIM=?, STATUSEMPRESTIMO=? WHERE IDEMPRESTIMO =?";
        MySQLDAO.executeQuery(query, emprestimo.getIDAmigos(), emprestimo.getDescricao(), emprestimo.getData(), emprestimo.getDataFim(), emprestimo.getStatusEmprestimo(), emprestimo.getIDEmprestimo());
    }
    
    public void delete(EmprestimoBEAN emprestimo) {
        MySQLDAO.executeQuery("DELETE FROM EMPRESTIMOS WHERE IDEMPRESTIMO =?", emprestimo.getIDEmprestimo());
        MySQLDAO.executeQuery("DELETE FROM LIVROEMPRESTIMO WHERE idEmprestimo =?", emprestimo.getIDEmprestimo());
    }
    
    public void ativar(EmprestimoBEAN emprestimo) {
        MySQLDAO.executeQuery("UPDATE EMPRESTIMOS SET STATUSEMPRESTIMO = 'Ativo' WHERE IDEMPRESTIMO =?", emprestimo.getIDEmprestimo());
    }
    
    public void inativar(EmprestimoBEAN emprestimo) {
        MySQLDAO.executeQuery("UPDATE EMPRESTIMOS SET STATUSEMPRESTIMO = 'Inativo' WHERE IDEMPRESTIMO =?", emprestimo.getIDEmprestimo());
    }
    
    public ArrayList<EmprestimoBEAN> findAllEmprestimo() {
        return listaEmprestimos("SELECT * FROM EMPRESTIMOS ORDER BY IDEMPRESTIMO");
    }
       
    public ArrayList<EmprestimoBEAN> findEmprestimoByName(String nomeBusca) {
    	return consultaEmprestimo("SELECT * FROM EMPRESTIMOS WHERE IDEMPRESTIMO LIKE '%" + nomeBusca + "%' OR DESCRICAO LIKE '%" + nomeBusca + "%' OR IDEMPRESTIMO LIKE '%" + nomeBusca + "%' ORDER BY IDEMPRESTIMO");
    }
    
    public ArrayList<EmprestimoBEAN> emprestimosAtivos() {
        return listaEmprestimos("SELECT * FROM EMPRESTIMOS WHERE STATUSEMPRESTIMO = 'Ativo' ORDER BY IDEMPRESTIMO");
    }
    
    public ArrayList<EmprestimoBEAN> findEmprestimoAtivoByName(String nomeBusca) {
    	return consultaEmprestimo("SELECT * FROM EMPRESTIMOS WHERE IDEMPRESTIMO LIKE '%" + nomeBusca + "%' OR DESCRICAO LIKE '%" + nomeBusca + "%' AND STATUSEMPRESTIMO = 'Ativo' ORDER BY IDEMPRESTIMO");
    }
    
    public ArrayList<EmprestimoBEAN> findEmprestimoInativoByName(String nomeBusca) {
    	return consultaEmprestimo("SELECT * FROM EMPRESTIMOS WHERE IDEMPRESTIMO LIKE '%" + nomeBusca + "%' OR DESCRICAO LIKE '%" + nomeBusca + "%' AND STATUSEMPRESTIMO = 'Inativo' ORDER BY IDEMPRESTIMO");
    }
    
    public ArrayList<EmprestimoBEAN> listaEmprestimos(String query) {
        ArrayList<EmprestimoBEAN> lista = new ArrayList<EmprestimoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EmprestimoBEAN(rs.getInt("IDEMPRESTIMO"), rs.getInt("idAmigos"), rs.getString("DESCRICAO"), rs.getDate("DATA"), rs.getDate("DATAFIM"), rs.getString("STATUSEMPRESTIMO")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimo(String query) {
        ArrayList<EmprestimoBEAN> lista = new ArrayList<EmprestimoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EmprestimoBEAN(rs.getInt("IDEMPRESTIMO"), rs.getInt("idAmigos"), rs.getString("DESCRICAO"), rs.getDate("DATA"), rs.getDate("DATAFIM"), rs.getString("STATUSEMPRESTIMO")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<LivroBEAN> listaLivrosDoEmprestimo(int idEmprestimos) {
        ArrayList<LivroBEAN> listaLivros = new ArrayList<LivroBEAN>();
        ControleLivro livro = new ControleLivro();
        ResultSet rs;
        rs = MySQLDAO.getResultSet("SELECT * FROM LIVROEMPRESTIMO WHERE idEmprestimo = ?", idEmprestimos);
        try {
            while (rs.next()) {
                listaLivros.add(livro.consultaLivroById(rs.getInt("idLivro")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaLivros;
    }

    public int findMaxIDEmprestimo() {
        int result = 0;
        String query = "SELECT MAX(IDEMPRESTIMO) FROM EMPRESTIMOS";
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);

        try {
            if (rs.next()) {
                result = rs.getInt("MAX(IDEMPRESTIMO)");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM EMPRESTIMOS WHERE IDEMPRESTIMO = ?", id);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<EmprestimoBEAN> consultaEmprestimoFiltros(String nomeBusca, String ativo, String inativo) {
        ArrayList<EmprestimoBEAN> lista = new ArrayList<EmprestimoBEAN>();
        ResultSet rs = null;
        
        if (ativo == "" && inativo == "") {
            String query = "";
            rs = MySQLDAO.getResultSet("SELECT * FROM EMPRESTIMOS WHERE DESCRICAO LIKE '%" + nomeBusca + "%' AND STATUSEMPRESTIMO != 'Inativo' ORDER BY IDEMPRESTIMO");
        } else {
            rs = MySQLDAO.getResultSet("SELECT * FROM EMPRESTIMOS WHERE STATUSEMPRESTIMO IN (?, ?) AND DESCRICAO LIKE '%" + nomeBusca + "%'", ativo, inativo);
        }
        
        try {
            while (rs.next()) {
                lista.add(new EmprestimoBEAN(rs.getInt("IDEMPRESTIMO"), rs.getInt("idAmigos"), rs.getString("DESCRICAO"), rs.getDate("DATA"), rs.getDate("DATAFIM"), rs.getString("STATUSEMPRESTIMO")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
