/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class NhanVienFullTime extends NhanVien {
    public int loaiChucVu;
    public int ngayLamThem;

    public NhanVienFullTime(String ten,int loaiChucVu, int ngayLamThem) {
        this.ten=ten;
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
    @Override
    public String loaiNhanVien(){
        return "NhanVienFullTime";
    }
    @Override
    public void tinhLuong(){
        
    }
    
}
