/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author macpro
 */
public class connection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/ChoDoiDo";
        final String user = "root";
        final String password = "huynhtrung02";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);    
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return null;
    }
    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        
        if(connection != null){
            System.out.println("thanh cong");
        }else{
            System.out.println("that bai");
        }
    }
}
