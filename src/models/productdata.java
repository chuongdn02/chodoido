/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author chuon
 */
public class productdata {

    String maSP, tenSP, hinhthuc;
    int gia, namsx;

    public productdata() {
    }

    public productdata(String maSP, String tenSP, int gia, String hinhthuc, int namsx) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.hinhthuc = hinhthuc;
        this.namsx = namsx;
    }

    public String getmaSP() {
        return maSP;
    }

    public void setmaSP(String maSP) {
        this.maSP = maSP;
    }

    public String gettenSP() {
        return tenSP;
    }

    public void settenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getgia() {
        return gia;
    }

    public void setgia(int gia) {
        this.gia = gia;
    }

    public String gethinhthuc() {
        return hinhthuc;
    }

    public void sethinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public int getnamsx() {
        return namsx;
    }

    public void setnamsx(int namsx) {
        this.namsx = namsx;
    }
}
