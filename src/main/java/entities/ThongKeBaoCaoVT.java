package entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "thong_ke_bao_cao_vt") // Tên bảng trong cơ sở dữ liệu
public class ThongKeBaoCaoVT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng ID
    @Column(name = "id")
    private int id;

    @Column(name = "ma_chuyen_tau", nullable = false, length = 50) // Cột mã chuyến tàu
    private String maChuyenTau;

    @Column(name = "dia_chi_ga", nullable = false, length = 100) // Cột địa chỉ ga
    private String diaChiGa;

    @Column(name = "trang_thai_hd", nullable = false, length = 50) // Cột trạng thái hoạt động
    private String trangThaiHD;



    // Constructors
    public ThongKeBaoCaoVT() {
    }

    public ThongKeBaoCaoVT(String maChuyenTau, String diaChiGa, String trangThaiHD) {
        this.maChuyenTau = maChuyenTau;
        this.diaChiGa = diaChiGa;
        this.trangThaiHD = trangThaiHD;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaChuyenTau() {
        return maChuyenTau;
    }

    public void setMaChuyenTau(String maChuyenTau) {
        this.maChuyenTau = maChuyenTau;
    }

    public String getDiaChiGa() {
        return diaChiGa;
    }

    public void setDiaChiGa(String diaChiGa) {
        this.diaChiGa = diaChiGa;
    }

    public String getTrangThaiHD() {
        return trangThaiHD;
    }

    public void setTrangThaiHD(String trangThaiHD) {
        this.trangThaiHD = trangThaiHD;
    }

    @Override
    public String toString() {
        return "ThongKeBaoCaoVT{" +
                "id=" + id +
                ", maChuyenTau='" + maChuyenTau + '\'' +
                ", diaChiGa='" + diaChiGa + '\'' +
                ", trangThaiHD='" + trangThaiHD + '\'' +
                '}';
    }
}
