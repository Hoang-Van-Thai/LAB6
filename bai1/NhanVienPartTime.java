/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class NhanVienPartTime extends NhanVien{
    public int gioLamViec;

    public NhanVienPartTime(String ten,int gioLamViec) {
        this.ten=ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan Vien PartTime";
    }
    @Override
    void tinhLuong(){
        
    }
    
}
