package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutorDAO {
    private static AutorDAO instance;

    public AutorDAO() {
        MySQLDAO.getConnection();
    }

    public static AutorDAO getInstance() {
        if (instance == null) {
            instance = new AutorDAO();
        }
        return instance;
    }

    public long create(AutorBEAN autor) {
        String query = "INSERT INTO AUTOR (NOMEAUTOR, STATUSAUTOR) VALUES (?,?)";
        return MySQLDAO.executeQuery(query, autor.getNomeAutor(), 1);
    }
    
    public void update(AutorBEAN autor) {
        String query = "UPDATE AUTOR SET NOMEAUTOR=? WHERE IDAUTOR =?";
        MySQLDAO.executeQuery(query, autor.getNomeAutor(), autor.getIDAutor());
    }
    
    public void inactive(AutorBEAN autor) {
        MySQLDAO.executeQuery("UPDATE AUTOR SET STATUSAUTOR = '0' WHERE IDAUTOR =?", autor.getIDAutor());
    }
    
    public void active(AutorBEAN autor) {
        MySQLDAO.executeQuery("UPDATE AUTOR SET STATUSAUTOR = '1' WHERE IDAUTOR =?", autor.getIDAutor());
    }
    
    public void delete(AutorBEAN autor) {
        MySQLDAO.executeQuery("DELETE FROM AUTOR WHERE IDAUTOR =?", autor.getIDAutor());
    }
    
    public ArrayList<AutorBEAN> findAllAutor() {
        return listaAutores("SELECT * FROM AUTOR ORDER BY IDAUTOR");
    }
    
   public ArrayList<AutorBEAN> findAutorByName(String nomeBusca) {
    	return consultaAutor("SELECT * FROM AUTOR WHERE NOMEAUTOR LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<AutorBEAN> autoresAtivos() {
        return listaAutores("SELECT * FROM AUTOR WHERE STATUSAUTOR = 1 ORDER BY IDAUTOR");
    }
    
    public ArrayList<AutorBEAN> findAutoresAtivos(String nomeBusca) {
    	return consultaAutor("SELECT * FROM AUTOR WHERE STATUSAUTOR = 1 AND NOMEAUTOR LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<AutorBEAN> findAutoresInativos(String nomeBusca) {
    	return consultaAutor("SELECT * FROM AUTOR WHERE STATUSAUTOR = 0 AND NOMEAUTOR LIKE '%" + nomeBusca + "%'");
    }
    
    public String retornaNomeAutor(int idAutor){
        String result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT NOMEAUTOR FROM AUTOR WHERE IDAUTOR = " + idAutor);
        try {
            while (rs.next()) {
                result = rs.getString("NOMEAUTOR");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<AutorBEAN> listaAutores(String query) {
        ArrayList<AutorBEAN> lista = new ArrayList<AutorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("IDAUTOR"), rs.getString("NOMEAUTOR"), rs.getInt("STATUSAUTOR")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<AutorBEAN> consultaAutor(String query) {
        ArrayList<AutorBEAN> lista = new ArrayList<AutorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("IDAUTOR"), rs.getString("NOMEAUTOR"), rs.getInt("STATUSAUTOR")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public AutorBEAN findAutorById(int id) {
        AutorBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM AUTOR WHERE IDAUTOR = ?", id);
        try {
            if (rs.next()) {
                result = new AutorBEAN(rs.getInt("IDAUTOR"), rs.getString("NOMEAUTOR"), rs.getInt("STATUSAUTOR"));

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
        rs = MySQLDAO.getResultSet("SELECT * FROM AUTOR WHERE IDAUTOR = ?", id);
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
}
