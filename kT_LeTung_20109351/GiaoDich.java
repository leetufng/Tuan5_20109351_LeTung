package kT_LeTung_20109351;

import java.util.Calendar;

public abstract class GiaoDich {
    protected String maGD;
    protected Calendar ngayGD;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public Calendar getNgayGD() {
        return ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public void setNgayGD(Calendar ngayGD) {
        this.ngayGD = ngayGD;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public  double getThanhTien() {
		return 0;
	}

    public void tieuDeBGDDO() {
        // Implement this if needed
    }

    public void tieuDeGDNO() {
        // Implement this if needed
    }

    @Override
    public String toString() {
        return "Ma GD: " + maGD + ", Ngày GD: " + ngayGD.getTime() + ", Don gia: " + donGia + ", Dien Tich: " + dienTich;
    }
}