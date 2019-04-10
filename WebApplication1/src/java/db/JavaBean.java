/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
/**
 *
 * @author Tibi
 */
public class JavaBean {
    String error;
    Connection con;
    public JavaBean(){
    
    }
    
    public void connect() throws ClassNotFoundException, SQLException, Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica?useSSL=false", "root", "parola");
            System.out.println("conectat");
        } catch (ClassNotFoundException cnfe) {
            error = "ClassNotFoundException: Nu s-a gasit driverul bazei de date.";
            throw new ClassNotFoundException(error);
        } catch (SQLException cnfe) {
            error = "SQLException: Nu se poate conecta la baza de date.";
            throw new SQLException(error);
        } catch (Exception e) {
            error = "Exception: A aparut o exceptie neprevazuta in timp ce se stabilea legatura la baza de date.";
            throw new Exception(error);
        }
    } 
    public void disconnect() throws SQLException {
        try {
            if (con != null) {
                con.close();
                System.out.println("S-a inchis conexiunea la BD");
            }
        } catch (SQLException sqle) {
            error = ("SQLException: Nu se poate inchide conexiunea la baza de date.");
            throw new SQLException(error);
        }
    } 
    public void adaugaPacient(String nume, String prenume, String sex, int varsta, String email, String adresa) throws SQLException, Exception {
        if (con != null) {
            try {
                Statement stmt;
                stmt = con.createStatement();
                stmt.executeUpdate("insert into pacient(nume, prenume, sex , varsta, email, adresa ) values('" + nume + "','"
                        + prenume + "', '" + sex + "', '" + varsta +"', '" + email + "','" + adresa +"');");
                
            } catch (SQLException sqle) {
                error = "ExceptieSQL: Reactualizare nereusita; este posibil sa existe duplicate.";
                throw new SQLException(error);
            }
        } else {
            error = "Exceptie: Conexiunea cu baza de date a fost pierduta.";
            throw new Exception(error);
        }
    }
    public void adaugaAnalize(int idpacient, int glucoza, int colesterol, int ld1, int hdl, int trigliceride, int fibrogen,
                              int hemoglobina, int tsh, int dhea, int psa, int homocisteina, int proteina,
                              int testosteron, int estradiol) throws SQLException, Exception {
        if (con != null) {
            try {
                Statement stmt;
                stmt = con.createStatement();
                stmt.executeUpdate("insert into analize(idpacient, glucoza, colesterol, ldl, hdl, trigliceride, fibrogen, hemoglobina, tsh, dhea"
                        + ",psa, homocisteina, proteina, testosteron, estradiol) values('" + idpacient + "','" + glucoza + "','"
                        + colesterol + "', '" + ld1 + "', '" + hdl +"', '" + trigliceride + "','" + fibrogen + "','" +
                        hemoglobina + "', '" + tsh + "', '" + dhea +"', '" + psa + "','" + homocisteina + "','" +
                        proteina + "', '" + testosteron + "', '" + estradiol + "');");
                
            } catch (SQLException sqle) {
                error = "ExceptieSQL: Reactualizare nereusita; este posibil sa existe duplicate.";
                throw new SQLException(error);
            }
        } else {
            error = "Exceptie: Conexiunea cu baza de date a fost pierduta.";
            throw new Exception(error);
        }
    }
    public ResultSet vedeTabela(String tabel) throws SQLException, Exception {
        ResultSet rs = null;
        try {
            String queryString = ("SELECT * FROM `clinica`.`" + tabel + "`;");
            Statement stmt = con.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY*/);
            rs = stmt.executeQuery(queryString);
        } catch (SQLException sqle) {
            error = "SQLException: Interogarea nu a fost posibila.";
            throw new SQLException(error);
        } catch (Exception e) {
            error = "A aparut o exceptie in timp ce se extrageau datele.";
            throw new Exception(error);
        }
        return rs;
    }
    public ResultSet ExtractLastIndexPacient() throws SQLException, Exception {
        ResultSet rs = null;
        try {
            String queryString = ("select * from `pacient` where `idpacient` = (select max(`idpacient`) from `pacient`);");
            Statement stmt = con.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY*/);
            rs = stmt.executeQuery(queryString);
        } catch (SQLException sqle) {
            error = "SQLException: Interogarea nu a fost posibila.";
            throw new SQLException(error);
        } catch (Exception e) {
            error = "A aparut o exceptie in timp ce se extrageau datele.";
            throw new Exception(error);
        }
         
        return rs;
    } 
}
