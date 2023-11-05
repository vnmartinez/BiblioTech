package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditoraDAO {
    private static EditoraDAO instance;

    public EditoraDAO() {
        MySQLDAO.getConnection();
    }

    public static EditoraDAO getInstance() {
        if (instance == null) {
            instance = new EditoraDAO();
        }
        return instance;
    }

    public long create(EditoraBEAN editora) {
        String query = "INSERT INTO EDITORA (NOMEEDITORA, STATUSEDITORA) VALUES (?,?)";
        return MySQLDAO.executeQuery(query, editora.getNomeEditora() , 1);
    }
    
    public void update(EditoraBEAN editora) {
        String query = "UPDATE EDITORA SET NOMEEDITORA=? WHERE IDEDITORA=?";
        MySQLDAO.executeQuery(query, editora.getNomeEditora(), editora.getIDEditora());
    }
    
    public void inactive(EditoraBEAN editora) {
        MySQLDAO.executeQuery("UPDATE EDITORA SET STATUSEDITORA = 0 WHERE IDEDITORA =?", editora.getIDEditora());
    }
    
    public void active(EditoraBEAN editora) {
        MySQLDAO.executeQuery("UPDATE EDITORA SET STATUSEDITORA = 1 WHERE IDEDITORA =?", editora.getIDEditora());
    }
    
    public void delete(EditoraBEAN editora) {
        MySQLDAO.executeQuery("DELETE FROM EDITORA WHERE IDEDITORA =?", editora.getIDEditora());
    }
     
    public ArrayList<EditoraBEAN> findAllEditoras() {
        return listarEditoras("SELECT * FROM EDITORA ORDER BY NOMEEDITORA");
    }
    
    public ArrayList<EditoraBEAN> findEditoraByName(String nomeBusca) {
    	return consultarEditora("SELECT * FROM EDITORA WHERE NOMEEDITORA LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<EditoraBEAN> editorasAtivas() {
        return listarEditoras("SELECT * FROM EDITORA WHERE STATUSEDITORA = 1");
    }
        
    public ArrayList<EditoraBEAN> findEditoraAtiva(String nomeBusca) {
    	return consultarEditora("SELECT * FROM EDITORA WHERE STATUSEDITORA = 1 AND NOMEEDITORA LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<EditoraBEAN> findEditoraInativa(String nomeBusca) {
    	return consultarEditora("SELECT * FROM EDITORA WHERE STATUSEDITORA = 0 AND NOMEEDITORA LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<EditoraBEAN> listarEditoras(String query) {
        ArrayList<EditoraBEAN> lista = new ArrayList<EditoraBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("IDEDITORA"), rs.getString("NOMEEDITORA"), rs.getInt("STATUSEDITORA")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<EditoraBEAN> consultarEditora(String query) {
        ArrayList<EditoraBEAN> lista = new ArrayList<EditoraBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("IDEDITORA"), rs.getString("NOMEEDITORA"), rs.getInt("STATUSEDITORA")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public String nomeEditora(int idBusca) {
        String result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT NOMEEDITORA FROM EDITORA WHERE IDEDITORA = " + idBusca);
        try {
            while (rs.next()) {
                result = rs.getString("NOMEEDITORA");
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
        rs = MySQLDAO.getResultSet("SELECT * FROM EDITORA WHERE IDDITORA = ?", id);
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