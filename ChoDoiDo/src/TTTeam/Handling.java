/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTTeam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;

/**
 *
 * @author chuon
 */
public class Handling {

    public List<productdata> GetAllproductdata() {
        List<productdata> PrData = new ArrayList<productdata>();
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from productdata");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                productdata PrD = new productdata();

                PrD.setmaSP(result.getString("maSP"));
                PrD.settenSP(result.getString("tenSp"));
                PrD.setgia(result.getInt("gia"));
                PrD.sethinhthuc(result.getString("HinhThuc"));
                PrD.setnamsx(result.getInt("nam"));
                PrData.add(PrD);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PrData;
    }

    public List<WLproduct> GetAllWLproduct() {
        List<WLproduct> PrWData = new ArrayList<WLproduct>();
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from WLproduct");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                WLproduct PrD1 = new WLproduct();

                PrD1.setmaSP(result.getString("maSP"));
                PrD1.settenSP(result.getString("tenSp"));
                PrD1.setgia(result.getInt("gia"));
                PrD1.sethinhthuc(result.getString("HinhThuc"));
                PrD1.setnamsx(result.getInt("nam"));
                PrWData.add(PrD1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PrWData;
    }

    public List<AdminACC> GetAllAdminACC() {
        List<AdminACC> accounts = new ArrayList<AdminACC>();
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from AdminACC");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                AdminACC ADacc = new AdminACC();

                ADacc.setusername(result.getString("usernamer"));
                ADacc.setADPassword(result.getString("password"));

                accounts.add(ADacc);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<userACC> GetAlluserACC() {
        List<userACC> accounts = new ArrayList<userACC>();
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from userACC");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                userACC Uacc = new userACC();

                Uacc.setname(result.getString("name"));
                Uacc.setPassword(result.getString("password"));
                Uacc.setaddress(result.getString("address"));
                Uacc.setphone(result.getString("phone"));
                accounts.add(Uacc);
            }
            return accounts;
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public AdminACC SigninAdmin(String username) {
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from AdminACC");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                if (result.getString("username").equals(username)) {
                    AdminACC adacc = new AdminACC();
                    System.out.println(username);
                    adacc.setusername(result.getString("username"));
                    adacc.setADPassword(result.getString("password"));

                    return adacc;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public userACC SigninUSER(String phoneNumber) {
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from userACC");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                if (result.getString("phone").equals(phoneNumber)) {
                    userACC uacc = new userACC();
                    System.out.println(phoneNumber);
                    uacc.setphone(result.getString("phone"));
                    uacc.setPassword(result.getString("password"));

                    return uacc;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void SignupAccount(userACC account) {
        Connection conn = Connect.ConnectSQL();

        try {
            PreparedStatement ps = conn.prepareStatement("insert into userACC values (?,?,?,?)");
            ps.setString(1, account.getphone());
            ps.setString(2, account.getPassword());
            ps.setString(3, account.getname());
            ps.setString(4, account.getaddress());
            int result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Handling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
