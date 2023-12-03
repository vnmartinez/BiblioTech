package Model;

import Controller.ControleAutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {
    private static LivroDAO instance;

    private LivroDAO() {
        MySQLDAO.getConnection();
    }

    public static LivroDAO getInstance() {
        if (instance == null) {
            instance = new LivroDAO();
        }
        return instance;
    }

    public void create(LivroBEAN livro) {
        String query = "INSERT INTO LIVROS (TITULO, STATUSLIVRO, IDEDITORA, IDAUTOR) VALUES (?,?,?,?)";
        MySQLDAO.executeQuery(query, livro.getTitulo(), "Ativo", livro.getIDEditora(), livro.getidAutor());
    }
   
    public void update(LivroBEAN livro) {      
        String query = "UPDATE LIVROS SET TITULO=?, STATUSLIVRO=?, IDEDITORA=?, IDAUTOR = ? WHERE IDLIVRO =?";
        MySQLDAO.executeQuery(query, livro.getTitulo(), livro.getStatusLivro(), livro.getIDEditora(), livro.getidAutor(), livro.getIDLivro());
    }
    
    public void delete(LivroBEAN livro) {
        MySQLDAO.executeQuery("DELETE FROM LIVROS WHERE IDLIVRO =?", livro.getIDLivro());
    }
    
    public void ativar(LivroBEAN livro) {
        MySQLDAO.executeQuery("UPDATE LIVROS SET STATUSLIVRO = 'Ativo' WHERE IDLIVRO =?", livro.getIDLivro());
    }
    
    public void inativar(LivroBEAN livro) {
        MySQLDAO.executeQuery("UPDATE LIVROS SET STATUSLIVRO = 'Inativo' WHERE IDLIVRO =?", livro.getIDLivro());
    }
    
    public ArrayList<LivroBEAN> findAllLivro() {
        return listaLivros("SELECT * FROM LIVROS ORDER BY IDLIVRO");
    }
       
    public ArrayList<LivroBEAN> findLivroByName(String nomeBusca) {
    	return consultaLivro("SELECT * FROM LIVROS WHERE TITULO LIKE '%" + nomeBusca + "%' ORDER BY IDLIVRO");
    }
    
    public ArrayList<LivroBEAN> livrosAtivos() {
        return listaLivros("SELECT * FROM LIVROS WHERE STATUSLIVRO = 'ATIVO' ORDER BY IDLIVRO");
    }
    
    public ArrayList<LivroBEAN> findLivroAtivoByName(String nomeBusca) {
    	return consultaLivro("SELECT * FROM LIVROS WHERE STATUSLIVRO = 'Ativo' AND TITULO LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<LivroBEAN> findLivroInativoByName(String nomeBusca) {
    	return consultaLivro("SELECT * FROM LIVROS WHERE STATUSLIVRO = 'Inativo' AND TITULO LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<LivroBEAN> listaLivros(String query) {
        ArrayList<LivroBEAN> lista = new ArrayList<LivroBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new LivroBEAN(rs.getInt("IDLIVRO"), rs.getString("TITULO"), rs.getString("STATUSLIVRO"), rs.getInt("IDEDITORA"),rs.getInt("IDAUTOR")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<LivroBEAN> consultaLivro(String query) {
        ArrayList<LivroBEAN> lista = new ArrayList<LivroBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new LivroBEAN(rs.getInt("IDLIVRO"), rs.getString("TITULO") ,rs.getString("STATUSLIVRO"), rs.getInt("IDEDITORA"),rs.getInt("IDAUTOR")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<LivroBEAN> consultaLivroFiltros(String nomeBusca, String ativo, String inativo) {
        ArrayList<LivroBEAN> lista = new ArrayList<LivroBEAN>();
        ResultSet rs = null;
        
        if (ativo == "" && inativo == "") {
            String query = "";
            rs = MySQLDAO.getResultSet("SELECT * FROM LIVROS WHERE TITULO LIKE '%" + nomeBusca + "%' AND STATUSLIVRO != 'Inativo'");
        } else {
            rs = MySQLDAO.getResultSet("SELECT * FROM LIVROS WHERE STATUSLIVRO IN (?, ?) AND TITULO LIKE '%" + nomeBusca + "%'", ativo, inativo);
        }
        
        try {
            while (rs.next()) {
                lista.add(new LivroBEAN(rs.getInt("IDLIVRO"), rs.getString("TITULO") ,rs.getString("STATUSLIVRO"), rs.getInt("IDEDITORA"),rs.getInt("IDAUTOR")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<AutorBEAN> listaAutoresDoLivro(int idLivro) {
        ArrayList<AutorBEAN> listaAutores = new ArrayList<AutorBEAN>();
        ControleAutor autor = new ControleAutor();
        ResultSet rs;
        rs = MySQLDAO.getResultSet("SELECT * FROM LIVROS_HAS_AUTORES WHERE LIVROS_IDLIVROS = ?", idLivro);
        try {
            while (rs.next()) {
                listaAutores.add(autor.consultaAutorById(rs.getInt("AUTORES_IDAUTORES")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAutores;
    }

    public int findMaxIDLivro() {
        int result = 0;
        String query = "SELECT MAX(IDLIVRO) FROM LIVROS";
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);

        try {
            if (rs.next()) {
                result = rs.getInt("MAX(IDLIVRO)");
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
        rs = MySQLDAO.getResultSet("SELECT * FROM LIVROS WHERE IDLIVRO = ?", id);
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
    
    public LivroBEAN findLivroById(int id) {
        LivroBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM LIVROS WHERE IDLIVRO = ?", id);
        try {
            if (rs.next()) {
                result = new LivroBEAN(rs.getInt("IDLIVRO"), rs.getString("TITULO") ,rs.getString("STATUSLIVRO"), rs.getInt("idEditora"), rs.getInt("idAutor"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
