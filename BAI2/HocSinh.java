/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author ADMIN
 */
public class HocSinh {
    public String hoTen;
    public String lop;
    public float diemtoan;
    public float diemLy;
    public float diemHoa;
    float DiemTrungBinh(){
        return (diemtoan+diemLy+diemHoa)/3;
    }
    
}
