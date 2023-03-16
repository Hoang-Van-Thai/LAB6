/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author ADMIN
 */
public class HocSinhChuyenToan extends HocSinh{
    @Override
    public float DiemTrungBinh(){
        return (2*diemtoan+diemLy+diemHoa)/4;
    }
}
