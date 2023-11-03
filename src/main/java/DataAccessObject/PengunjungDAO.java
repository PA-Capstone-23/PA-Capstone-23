/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import Databases.database;
import javax.swing.JOptionPane;
import model.Pengunjung;
import Interface.DaftarKunjungan;
import java.util.ArrayList;
import java.util.List;
public class PengunjungDAO extends Pengunjung {
    ArrayList<String[]> arrayPengunjung = new ArrayList();
    public boolean create() {
        boolean isOperationSuccess = false;
        
        try{
            this.openConnection();
            
            String checkUsername = "SELECT * FROM pengunjung WHERE username = ?";
            this.preparedStatement = this.connection.prepareStatement(checkUsername);
            this.preparedStatement.setString(1,this.username);
            this.resultSet = this.preparedStatement.executeQuery();
            if (this.resultSet.next()){
                JOptionPane.showMessageDialog(null, "Username yang anda masukan telah ada, masukan username lain");
            }else{
                String queryZero = "SELECT COUNT(*) FROM pengunjung";
                this.preparedStatement  = this.connection.prepareStatement(queryZero);
    //            String result;
    //            this.resultSet result = this.statement.executeQuery();
                this.resultSet.next();
                int rowCount = this.resultSet.getInt(1);
                if (rowCount == 0){
                        String sql = "INSERT INTO pengunjung (id_pengunjung, nama_pengunjung, username, password) VALUES (?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setInt(1, 1);
                        this.preparedStatement.setString(2, this.namaPengunjung);
                        this.preparedStatement.setString(3, this.username);
                        this.preparedStatement.setString(4, this.password);

                        int result = this.preparedStatement.executeUpdate();

                        isOperationSuccess = result > 0;
    //                java.sql.Connection conn = (Connection) database.openConnection();
                }else {
                        String getMaxIdQuery = "SELECT id_napi FROM pengunjung ORDER BY id_pengunjung DESC LIMIT 1";
                        this.preparedStatement = this.connection.prepareStatement(getMaxIdQuery);
    //                    ResultSet maxIdResult = maxIdStatement.executeQuery();
                        int newId;
                        this.resultSet.next();
                        newId = this.resultSet.getInt("id_pengunjung") + 1;
                        String sql = "INSERT INTO pengunjung (id_pengunjung, nama_pengunjung, username, password) VALUES (?, ?, ?, ?)";
                        this.preparedStatement = this.connection.prepareStatement(sql);
                        this.preparedStatement.setInt(1, newId);
                        this.preparedStatement.setString(2, this.namaPengunjung);
                        this.preparedStatement.setString(3, this.username);
                        this.preparedStatement.setString(4, this.password);

                        int result = this.preparedStatement.executeUpdate();

                        isOperationSuccess = result > 0;
                }
            }
        }catch (SQLException ex){
//            System.err.println("gagal koneksi"+ex.getMessage());
            this.displayErrors(ex);
        }finally{
            this.closeConnection();
        }
        return isOperationSuccess;
    }
    public boolean login(){
        boolean isOperationSuccess = false;
        try{
            this.openConnection();
            this.preparedStatement = this.connection.prepareStatement("SELECT * FROM pengunjung WHERE username = ? AND password = ?");
            this.preparedStatement.setString(1, this.username);
            this.preparedStatement.setString(2, this.password);
            this.resultSet = this.preparedStatement.executeQuery();
            if (this.resultSet.next()){
                if (username.equals(resultSet.getString("username"))
                        && password.equals(resultSet.getString("password"))) {
                        JOptionPane.showMessageDialog(null, "Login berhasil");
                        DaftarKunjungan Kj2 = new DaftarKunjungan();
                        Kj2.setVisible(true);
                        isOperationSuccess = true;
//                        this.dispose();
                }
            }
        }catch(SQLException ex){
            this.displayErrors(ex);
        }finally{
            this.closeConnection();
        }
        return isOperationSuccess;
    }
    public boolean regis(){
        boolean isOperationSuccess = false;
        try{
            this.openConnection();
//            this.rs = this.st.executeQuery("SELECT * FROM pengunjung");
            this.preparedStatement = this.connection.prepareStatement("SELECT * FROM pengunjung WHERE username = ?");
//            PreparedStatement preparedStatementCheck = conn.prepareStatement(checkUsernameQuery);
            this.preparedStatement.setString(1, this.username);
            this.resultSet = this.preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Username yang anda masukan telah ada, masukan username lain");
            } else {
                JOptionPane.showMessageDialog(null, "Username yang anda masukan tersedia");
            }
            String queryZero = "SELECT COUNT(*) FROM pengunjung";
            this.preparedStatement = this.connection.prepareStatement(queryZero);
            this.resultSet = this.preparedStatement.executeQuery();
            this.resultSet.next();
            int rowCount = this.resultSet.getInt(1);
            if (rowCount == 0){
                    String sql = "INSERT INTO pengunjung (id_pengunjung, nama_pengunjung, username, password) VALUES (?, ?, ?, ?)";
                    this.preparedStatement = this.connection.prepareStatement(sql);
                    preparedStatement.setInt(1, 1);
                    preparedStatement.setString(2, this.namaPengunjung);
                    preparedStatement.setString(3, this.username);
                    preparedStatement.setString(4, this.password);
                    int result1 = preparedStatement.executeUpdate();
                    
                    isOperationSuccess = result1 > 0;
//                    JOptionPane.showMessageDialog(null, "Akun anda berhasil dibuat");
//                this.setVisible(false);
//                new Login().setVisible(true);  
                    DaftarKunjungan Kj1 = new DaftarKunjungan();
                    Kj1.setVisible(true);
//                this.dispose();
            }else{
                String getMaxIdQuery = "SELECT id_pengunjung FROM pengunjung ORDER BY id_pengunjung DESC LIMIT 1";
                this.preparedStatement = this.connection.prepareStatement(getMaxIdQuery);
                this.resultSet = this.preparedStatement.executeQuery();
//                int newId;
                this.resultSet.next();
                int newId = this.resultSet.getInt("id_pengunjung") + 1;
                String sql = "INSERT INTO pengunjung (id_pengunjung, nama_pengunjung, username, password) VALUES (?, ?, ?, ?)";
                this.preparedStatement = this.connection.prepareStatement(sql);
                preparedStatement.setInt(1, newId);
                preparedStatement.setString(2, this.namaPengunjung);
                preparedStatement.setString(3, this.username);
                preparedStatement.setString(4, this.password);
                int result2 = preparedStatement.executeUpdate();
                isOperationSuccess = result2 > 0;
//                JOptionPane.showMessageDialog(null, "Akun anda berhasil dibuat");
//                this.setVisible(false);
//                new Login().setVisible(true);  
                DaftarKunjungan Kj1 = new DaftarKunjungan();
                Kj1.setVisible(true);
//                this.dispose();
            }
        }catch(SQLException ex){
            this.displayErrors(ex);
        }finally{
            this.closeConnection();
        }
        return isOperationSuccess;
    }
    public ArrayList<String[]> readPengunjung() throws SQLException {
        this.openConnection();
        String query = "SELECT * FROM pengunjung";
        this.statement = this.connection.createStatement();
        ResultSet rs = this.statement.executeQuery(query);
        while (rs.next()) {            
            String idPengunjung = rs.getString("Id_pengunjung");
            String nama = rs.getString("nama_pengunjung");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String[] data = {idPengunjung, nama, username, password};   
            arrayPengunjung.add(data);
        }return arrayPengunjung;
    }
//    public List<Object[]> tabel() {
//        List<Object[]> dataList = new ArrayList<>();
//        try {
//            this.openConnection();
//            this.preparedStatement = this.connection.prepareStatement("SELECT * FROM pengunjung");
//            
//            this.resultSet = this.preparedStatement.executeQuery();
//            while (this.resultSet.next()) {
//                Object[] data = {
//                    this.resultSet.getInt("id_pengunjung"),
//                    this.resultSet.getString("nama_pengunjung"),
//                    this.resultSet.getString("username"),
//                    this.resultSet.getString("password"),
//                };
//                dataList.add(data);
//            }
//        } catch (SQLException ex) {
//            this.displayErrors(ex);
//        } finally {
//            this.closeConnection();
//        }
//        return dataList;
//    }
//    public boolean find(int idNapi){
//        boolean isOperationSuccess = false;
//        
//        try{
//            this.openConnection();
//            this.preparedStatement = this.connection.prepareStatement("SELECT * FROM narapidana WHERE id_napi = ?");
//            this.preparedStatement.setInt(1, idNapi);
//            this.resultSet = this.preparedStatement.executeQuery();
//            
//            if (this.resultSet.next()){
//                Narapidana.idNapi = idNapi;
//                Narapidana.namaNapi = this.resultSet.getString("nama_napi");
//                Narapidana.umur = this.resultSet.getInt("umur");
//                Narapidana.namaNapi = this.resultSet.getString("nama_napi");
//                Narapidana.jenisKelamin = this.resultSet.getString("jenis_kelamin");
//                Narapidana.tglMasuk = this.resultSet.getString("tgl_masuk");
//                Narapidana.tglKeluar = this.resultSet.getString("tgl_keluar");
//                Narapidana.masaTahanan = this.resultSet.getInt("masa_tahanan");
//                
//                isOperationSuccess = true;
//            }
//        }catch(SQLException ex){
//            this.displayErrors(ex);
//        }finally{
//            this.closeConnection();
//        }return isOperationSuccess;
//    }   
//    public boolean updateUmur(){
//        boolean isOperationSuccess = false;
//        try{
//            this.openConnection();
//            String sql = "UPDATE narapidana" + "SET umur = ?    " + "WHERE id_napi = ?";
//            this.preparedStatement = this.connection.prepareStatement(sql);
//            this.preparedStatement.setInt(1,Narapidana.umur);
//            int result = this.preparedStatement.executeUpdate();
//            
//            isOperationSuccess = result > 0;    
//        }catch(SQLException ex){
//            this.displayErrors(ex);
//        }finally{
//            this.closeConnection();
//        }return isOperationSuccess; 
//    }
//        public boolean updateMasaTahanan(){
//        boolean isOperationSuccess = false;
//        try{
//            this.openConnection();
//            String sql = "UPDATE narapidana" + "SET masa_tahanan= ?    " + "WHERE id_napi = ?";
//            this.preparedStatement = this.connection.prepareStatement(sql);
//            this.preparedStatement.setInt(1,Narapidana.masaTahanan);
//            int result = this.preparedStatement.executeUpdate();
//            
//            isOperationSuccess = result > 0;    
//        }catch(SQLException ex){
//            this.displayErrors(ex);
//        }finally{
//            this.closeConnection();
//        }return isOperationSuccess; 
//    }
//        public boolean delete(){
//        boolean isOperationSuccess = false;
//        try{
//            this.openConnection();
//            String sql = "DELETE FROM narapidana WHERE id_napi = ?";
//            this.preparedStatement = this.connection.prepareStatement(sql);
//            this.preparedStatement.setInt(1,Narapidana.idNapi);
//            int result = this.preparedStatement.executeUpdate();
//            
//            isOperationSuccess = result > 0;    
//        }catch(SQLException ex){
//            this.displayErrors(ex);
//        }finally{
//            this.closeConnection();
//        }return isOperationSuccess; 
//    }
}
