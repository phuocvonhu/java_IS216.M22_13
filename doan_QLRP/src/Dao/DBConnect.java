/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author minht
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
        

public class DBConnect {
//    public static Connection getConnectionSqlServer(String username, String password) {
//        Connection cons = null;
//        try {
//            String dbURL = "jdbc:sqlserver://localhost\\MSSQLSERVER01:1433;databaseName=quanlyrapphim";
//            cons = DriverManager.getConnection(dbURL, username, password);
//            if (cons != null) {
//                System.out.println("Connected");
//                DatabaseMetaData dm = (DatabaseMetaData) cons.getMetaData();
//                System.out.println("Driver name: " + dm.getDriverName());
//                System.out.println("Driver version: " + dm.getDriverVersion());
//                System.out.println("Product name: " + dm.getDatabaseProductName());
//                System.out.println("Product version: " + dm.getDatabaseProductVersion());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return cons;
//    }
    public static Connection getConnectionMySql(){
        Connection cons = null;
        try{
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/quanlyrapphim";
            cons = DriverManager.getConnection(url, username, password);
            if (cons != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = (DatabaseMetaData) cons.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        }
        catch(Exception ex){
           System.out.println(ex.getMessage());
        }
        return cons;
    }
}