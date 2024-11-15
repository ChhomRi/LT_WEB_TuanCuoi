/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;

/**
 *
 * @author DELL
 */
public class TaiKhoanDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public TaiKhoan checkLogin(String tendanghap, String mkdangnhap) {
        TaiKhoan kq = null;
        String sql = "select * from taikhoan where tendangnhap=? and mkdangnhap=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tendanghap);
            ps.setString(2, mkdangnhap);
            rs = ps.executeQuery();
            if (rs.next()) {
                kq = new TaiKhoan(rs.getString(1), rs.getString(2));

            }
        } catch (Exception ex) {
            System.out.println("Loi: " + ex.toString());

        }
        return kq;

    }

    public boolean changePassword(TaiKhoan tk) {
        String sql = "update taikhoan set mkdangnhap=? where tendangnhap=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tk.getMkdangnhap());
            ps.setString(2, tk.getTendangnhap());
            int kq = ps.executeUpdate();
            if (kq > 0) {
                return true;

            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return false;
    }

    public static void main(String[] args) {
        TaiKhoanDAO tkDAO = new TaiKhoanDAO();
        TaiKhoan tk = tkDAO.checkLogin("ntthuy", "ntthuy90");
        if (tk != null) {
            System.out.println("thanh cong");
        }
        else{
            System.out.println("that bai");
        }
    }
}

