/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    public String ten;
    public long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }
    public String loaiNhanVien(){
        return "Nhan vien";
    }
    void tinhLuong(){
    }
    void xuatThongTin(){
        System.out.println("ten: "+ten+"luong: "+luong+"loai nhan vien: "+loaiNhanVien());
    }
    
    
    
}
