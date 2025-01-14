package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "thong_ke_tinh_trang_ve") // Tên bảng trong cơ sở dữ liệu
public class ThongKeTinhTrangVe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID tự động tăng
    @Column(name = "id")
    private int id;

    @Column(name = "ma_ve_tau", nullable = false, length = 50) // Mã vé tàu
    private String maVeTau;

    @Column(name = "ma_loai_ve", nullable = false, length = 50) // Mã loại vé
    private String maLoaiVe;

    @Column(name = "ten_ga_di", nullable = false, length = 100) // Tên ga đi
    private String tenGaDi;

    @Column(name = "ten_ga_den", nullable = false, length = 100) // Tên ga đến
    private String tenGaDen;

    @Column(name = "ten_kh", nullable = false, length = 100) // Tên khách hàng
    private String tenKH;

    @Column(name = "sdt", nullable = false) // Số điện thoại
    private String sDT;

    @Column(name = "gio_khoi_hanh", nullable = false, length = 50) // Giờ khởi hành
    private String gioKH;

    @Column(name = "ngay_khoi_hanh", nullable = false, length = 50) // Ngày khởi hành
    private String ngayKhoiHang;

    @Column(name = "tinh_trang_ve", nullable = false, length = 50) // Tình trạng vé
    private String tinhTrangVe;

    // Constructors
    public ThongKeTinhTrangVe() {
    }

    public ThongKeTinhTrangVe(String maVeTau, String maLoaiVe, String tenGaDi, String tenGaDen, String tenKH, String sDT,
                              String gioKH, String ngayKhoiHang, String tinhTrangVe) {
        this.maVeTau = maVeTau;
        this.maLoaiVe = maLoaiVe;
        this.tenGaDi = tenGaDi;
        this.tenGaDen = tenGaDen;
        this.tenKH = tenKH;
        this.sDT = sDT;
        this.gioKH = gioKH;
        this.ngayKhoiHang = ngayKhoiHang;
        this.tinhTrangVe = tinhTrangVe;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaVeTau() {
        return maVeTau;
    }

    public void setMaVeTau(String maVeTau) {
        this.maVeTau = maVeTau;
    }

    public String getMaLoaiVe() {
        return maLoaiVe;
    }

    public void setMaLoaiVe(String maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public String getTenGaDi() {
        return tenGaDi;
    }

    public void setTenGaDi(String tenGaDi) {
        this.tenGaDi = tenGaDi;
    }

    public String getTenGaDen() {
        return tenGaDen;
    }

    public void setTenGaDen(String tenGaDen) {
        this.tenGaDen = tenGaDen;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getGioKH() {
        return gioKH;
    }

    public void setGioKH(String gioKH) {
        this.gioKH = gioKH;
    }

    public String getNgayKhoiHang() {
        return ngayKhoiHang;
    }

    public void setNgayKhoiHang(String ngayKhoiHang) {
        this.ngayKhoiHang = ngayKhoiHang;
    }

    public String getTinhTrangVe() {
        return tinhTrangVe;
    }

    public void setTinhTrangVe(String tinhTrangVe) {
        this.tinhTrangVe = tinhTrangVe;
    }

    @Override
    public String toString() {
        return "ThongKeTinhTrangVe{" +
                "id=" + id +
                ", maVeTau='" + maVeTau + '\'' +
                ", maLoaiVe='" + maLoaiVe + '\'' +
                ", tenGaDi='" + tenGaDi + '\'' +
                ", tenGaDen='" + tenGaDen + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", sDT='" + sDT + '\'' +
                ", gioKH='" + gioKH + '\'' +
                ", ngayKhoiHang='" + ngayKhoiHang + '\'' +
                ", tinhTrangVe='" + tinhTrangVe + '\'' +
                '}';
    }
}
