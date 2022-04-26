/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author macpro
 */
public class admin {
String id,pass;
    public admin() {
    }
    public admin(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }
}
