/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        NhanVien nhanvien=new NhanVien();
        nhanvien.xuatThongTin();
        nhanvien =new NhanVienFullTime("a",1, 2);
        nhanvien.xuatThongTin();
        nhanvien=new NhanVienPartTime("b", 50);
        nhanvien.xuatThongTin();
    }
}
