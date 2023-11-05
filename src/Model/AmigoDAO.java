package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AmigoDAO {
    private static AmigoDAO instance;

    public AmigoDAO() {
        MySQLDAO.getConnection();
    }

    public static AmigoDAO getInstance() {
        if (instance == null) {
            instance = new AmigoDAO();
        }
        return instance;
    }

    public void create(AmigoBEAN amigo) {
        String query = "INSERT INTO AMIGOS (NOMEAMIGO, CPFAMIGO, TELEFONEAMIGO, STATUSAMIGO) VALUES (?,?,?,?)";
        MySQLDAO.executeQuery(query, amigo.getNomeAmigo(), amigo.getCPFAmigo(), amigo.getTelefoneAmigo(), 1);
    }
    
    public void update(AmigoBEAN amigo) {
        String query = "UPDATE AMIGOS SET NOMEAMIGO=?, CPFAMIGO=?, TELEFONEAMIGO=? WHERE IDAMIGO =?";
        MySQLDAO.executeQuery(query, amigo.getNomeAmigo(), amigo.getCPFAmigo(), amigo.getTelefoneAmigo(), amigo.getIDAmigo());
    }
    
    public void delete(AmigoBEAN amigo) {
        MySQLDAO.executeQuery("DELETE FROM AMIGOS WHERE IDAMIGO =?", amigo.getIDAmigo());
    }
    
    public void ativar(AmigoBEAN amigo) {
        MySQLDAO.executeQuery("UPDATE AMIGOS SET STATUSAMIGO = 1 WHERE IDAMIGO =?", amigo.getIDAmigo());
    }
    
    public void inativar(AmigoBEAN amigo) {
        MySQLDAO.executeQuery("UPDATE AMIGOS SET STATUSAMIGO = 0 WHERE IDAMIGO =?", amigo.getIDAmigo());
    }
    
    public ArrayList<AmigoBEAN> findAllAmigo() {
        return listaAmigos("SELECT * FROM AMIGOS ORDER BY IDAMIGO");
    }
       
    public ArrayList<AmigoBEAN> findAmigoByName(String nomeBusca) {
    	return consultaAmigo("SELECT * FROM AMIGOS WHERE NOMEAMIGO LIKE '%" + nomeBusca + "%'");
    }  
    
    public ArrayList<AmigoBEAN> amigosAtivos() {
        return listaAmigos("SELECT * FROM AMIGOS WHERE STATUSAMIGO = 1 ORDER BY IDAMIGO");
    }
    
    public ArrayList<AmigoBEAN> findAmigosAtivos(String nomeBusca) {
    	return consultaAmigo("SELECT * FROM AMIGOS WHERE STATUSAMIGO = 1 AND NOMEAMIGO LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<AmigoBEAN> findAmigosInativos(String nomeBusca) {
    	return consultaAmigo("SELECT * FROM AMIGOS WHERE STATUSAMIGO = 0 AND NOMEAMIGO LIKE '%" + nomeBusca + "%'");
    }
    
    public ArrayList<AmigoBEAN> listaAmigos(String query) {
        ArrayList<AmigoBEAN> lista = new ArrayList<AmigoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AmigoBEAN(rs.getInt("IDAMIGO"), rs.getString("NOMEAMIGO"), rs.getString("CPFAMIGO"), rs.getString("TELEFONEAMIGO"), rs.getInt("STATUSAMIGO")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<AmigoBEAN> consultaAmigo(String query) {
        ArrayList<AmigoBEAN> lista = new ArrayList<AmigoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AmigoBEAN(rs.getInt("IDAMIGO"), rs.getString("NOMEAMIGO"), rs.getString("CPFAMIGO"), rs.getString("TELEFONEAMIGO"), rs.getInt("STATUSAMIGO")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public String nomeAmigo(int idBusca) {
        String result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT NOMEAMIGO FROM AMIGOS WHERE IDAMIGO = " + idBusca);
        try {
            while (rs.next()) {
                result = rs.getString("NOMEAMIGO");
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
        rs = MySQLDAO.getResultSet("SELECT * FROM AMIGOS WHERE IDAMIGO =?", id);
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
