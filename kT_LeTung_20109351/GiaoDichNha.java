package kT_LeTung_20109351;
import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public double getThanhTien() {
        if (loaiNha.equals("cao cap")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loai nha: " + loaiNha + ", Dia chi: " + diaChi + ", Thanh tien: " + getThanhTien();
    }
}
