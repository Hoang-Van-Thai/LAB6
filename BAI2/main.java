/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        HocSinh hocsinh=new HocSinh();
        System.out.println(hocsinh.DiemTrungBinh());
        hocsinh=new HocSinhChuyenToan();
        System.out.println(hocsinh.DiemTrungBinh());
    }
    
}
