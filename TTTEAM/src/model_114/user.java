/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_114;

/**
 *
 * @author macpro
 */
public class user {

    private String phone, pass, name, add, sex;

    public user() {
    }

    public user(String phone, String pass, String name, String add, String sex) {
        this.pass = pass;
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.sex = sex;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getadd() {
        return add;
    }

    public void setadd(String sex) {
        this.sex = sex;
    }

    public String getsex() {
        return sex;
    }

    public void setsex(String sex) {
        this.sex = sex;
    }

}
