/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handle;

import connect.connection;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author macpro
 */
public class Handling {

    public List<product> GetAllproduct() {
        List<product> PrData = new ArrayList<product>();
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from product");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                product PrD = new product();

                PrD.setid(result.getString("id"));
                PrD.setname(result.getString("name"));
                PrD.setprice(result.getString("price"));
                PrD.setdes(result.getString("des"));
                PrD.settitle(result.getString("title"));
                PrData.add(PrD);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PrData;
    }

    public List<WLine> GetAllWLine() {
        List<WLine> PrWData = new ArrayList<WLine>();
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from WLine");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                WLine PrD1 = new WLine();

                PrD1.setid(result.getString("id"));
                PrD1.setname(result.getString("name"));
                PrD1.setprice(result.getString("price"));
                PrD1.setdes(result.getString("des"));
                PrD1.settitle(result.getString("title"));
                PrWData.add(PrD1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PrWData;
    }

    public List<admin> GetAlladmin() {
        List<admin> accounts = new ArrayList<admin>();
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from admin");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                admin ADacc = new admin();

                ADacc.setid(result.getString("id"));
                ADacc.setpass(result.getString("pass"));

                accounts.add(ADacc);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<user> GetAlluser() {
        List<user> accounts = new ArrayList<user>();
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from user");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                user Uacc = new user();

                Uacc.setname(result.getString("name"));
                Uacc.setphone(result.getString("phone"));
                Uacc.setpass(result.getString("pass"));
                Uacc.setsex(result.getString("sex"));
                Uacc.setadd(result.getString("add"));
                accounts.add(Uacc);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public admin Signinadmin(String id) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from admin");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                if (result.getString("id").equals(id)) {
                    admin adacc = new admin();
                    System.out.println(id);
                    adacc.setid(result.getString("id"));
                    adacc.setpass(result.getString("password"));

                    return adacc;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public user SigninUSER(String phone) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from user");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                if (result.getString("phone").equals(phone)) {
                    user uacc = new user();
                    System.out.println(phone);
                    uacc.setphone(result.getString("phone"));
                    uacc.setpass(result.getString("pass"));

                    return uacc;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void SignupAccount(user account) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("insert into user values (?,?,?,?,?)");
            ps.setString(1, account.getphone());
            ps.setString(2, account.getpass());
            ps.setString(3, account.getname());
            ps.setString(4, account.getadd());
            ps.setString(5, account.getsex());
            int result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddNewProductData(product PrD) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("insert into product values (?,?,?,?,?)");
            ps.setString(1, PrD.getid());
            ps.setString(2, PrD.getname());
            ps.setString(3, PrD.getprice());
            ps.setString(4,PrD.gettitle());
            ps.setString(5, PrD.getdes());

            int result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteWLine(String id) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("delete from WLine where id = ?");
            ps.setString(1, id);

            int result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ShowtData(product PrD) {
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from product, user");
            ResultSet result = ps.executeQuery();
            product PrD3 = new product();
            user u = new user();

                PrD3.setid(result.getString("id"));
                PrD3.setname(result.getString("name"));
                PrD3.setprice(result.getString("price"));
                PrD3.setdes(result.getString("des"));
                PrD3.settitle(result.getString("title"));
                u.setname(result.getString("name"));
                u.setphone(result.getString("phone"));
                u.setsex(result.getString("sex"));
                u.setadd(result.getString("add"));
                
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<product> GetResultSearch(String searchType, String  valueSearch) {
        List<product> PrData = new ArrayList<>();
        Connection conn = connection.getJDBCConnection();

        try {
            PreparedStatement ps = null;
            switch(searchType) {
            case "id" : 
                 ps = conn.prepareStatement("select * from product where id = ?");
                ps.setObject(1, valueSearch);  
                break;
             
            case "name" : 
                 ps = conn.prepareStatement("select * from product where name = ?");
                ps.setObject(1, valueSearch);  
                break;
            }

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                product PrD = new product();
                PrD.setid(result.getString("id"));            
                PrD.setname(result.getString("name"));
                PrD.setprice(result.getString("price"));
                PrD.settitle(result.getString("title"));
                PrD.setdes(result.getString("des"));
                
                
                PrData.add(PrD);
            }
            return PrData;
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
