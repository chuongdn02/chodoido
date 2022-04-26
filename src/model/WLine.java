/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author macpro
 */
public class WLine {
    
String id, name, des,price,title;
    

    public WLine() {
    }

    public WLine(String id, String name, String price, String des, String title) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.price = price;
        this.title = title;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String tenSP) {
        this.name = name;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public String getdes() {
        return des;
    }

    public void setdes(String des) {
        this.des = des;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }
}

