/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
public class Databases{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL     = "jdbc:mysql://localhost:3306/tracsales";
    private static final String USERNAME  = "root";
    private static final String PASSWORD = "";

//    public static void main(String[] args) throws Exception {
//        // TODO code application logic here
//        System.out.println("Omambia Is the pyther....");
//        getConnection();
//    }
    
    public static Connection getConnection() throws Exception{
        try{
            Class.forName(DRIVER).newInstance();
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Connected");
            return con;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return null;
        
    }
    
    public static Statement getStatement() throws Exception{
        try{
           Statement stmt = getConnection().createStatement();
           return stmt;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return null;
    }
    
    public static ResultSet query(String query) throws Exception {
        try{
            ResultSet _data = getStatement().executeQuery(query);
            return _data;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    
   
    
    
}
