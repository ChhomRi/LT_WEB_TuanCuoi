/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class TaiKhoan {
    private String tendangnhap;
    private String mkdangnhap;

    public TaiKhoan(String tendangnhap, String mkdangnhap) {
        this.tendangnhap = tendangnhap;
        this.mkdangnhap = mkdangnhap;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMkdangnhap() {
        return mkdangnhap;
    }

    public void setMkdangnhap(String mkdangnhap) {
        this.mkdangnhap = mkdangnhap;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tendangnhap=" + tendangnhap + ", mkdangnhap=" + mkdangnhap + '}';
    }

    public void setMatkhau(String newpass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
