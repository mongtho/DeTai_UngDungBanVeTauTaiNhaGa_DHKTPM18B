package entities;

import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "thong_ke_doanh_thu")
//@Getter
//@Setter
@NoArgsConstructor
public class ThongKeDoanhThu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ma_hd", nullable = false, length = 50)
    private String maHD;

    @Column(name = "ma_ve_tau", nullable = false, length = 50)
    private String maVeTau;

    @Column(name = "don_gia_ban_ve", nullable = false)
    private float donGiaBanVe;

    @Column(name = "so_luong_ve", nullable = false)
    private int soLuongVe;

    @Column(name = "dich_vu", length = 100)
    private String dichVu;

    @Column(name = "don_gia_dich_vu", nullable = true)
    private float donGiaDichVu;

    @Column(name = "so_luong_dich_vu", nullable = true)
    private int soLuongDichVu;

    public ThongKeDoanhThu(String maHD, String maVeTau, float donGiaBanVe, int soLuongVe, String dichVu, float donGiaDichVu, int soLuongDichVu) {
        this.maHD = maHD;
        this.maVeTau = maVeTau;
        this.donGiaBanVe = donGiaBanVe;
        this.soLuongVe = soLuongVe;
        this.dichVu = dichVu;
        this.donGiaDichVu = donGiaDichVu;
        this.soLuongDichVu = soLuongDichVu;
    }

    @Override
    public String toString() {
        return "ThongKeDoanhThu{" +
                "id=" + id +
                ", maHD='" + maHD + '\'' +
                ", maVeTau='" + maVeTau + '\'' +
                ", donGiaBanVe=" + donGiaBanVe +
                ", soLuongVe=" + soLuongVe +
                ", dichVu='" + dichVu + '\'' +
                ", donGiaDichVu=" + donGiaDichVu +
                ", soLuongDichVu=" + soLuongDichVu +
                '}';
    }
}
