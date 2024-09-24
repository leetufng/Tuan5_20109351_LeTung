package kT_LeTung_20109351;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public int tongSoLuongGiaoDich() {
        return danhSachGiaoDich.size();
    }

    public double trungBinhThanhTienGiaoDichDat() {
        double tongTien = 0;
        int count = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichDat) {
                tongTien += gd.getThanhTien();
                count++;
            }
        }
        return count > 0 ? tongTien / count : 0;
    }

    public List<GiaoDich> giaoDichThang9Nam2013() {
        List<GiaoDich> ketQua = new ArrayList<>();
        Calendar thang9Nam2013 = Calendar.getInstance();
        thang9Nam2013.set(2013, Calendar.SEPTEMBER, 1);
        Calendar thang10Nam2013 = Calendar.getInstance();
        thang10Nam2013.set(2013, Calendar.OCTOBER, 1);

        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd.getNgayGD().after(thang9Nam2013) && gd.getNgayGD().before(thang10Nam2013)) {
                ketQua.add(gd);
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
        QuanLyGiaoDich ql = new QuanLyGiaoDich();

       
        Calendar ngayGD1 = Calendar.getInstance();
        ngayGD1.set(2013, Calendar.SEPTEMBER, 10);
        ql.themGiaoDich(new GiaoDichDat("GD001", ngayGD1, 1000, 100, "A"));

        Calendar ngayGD2 = Calendar.getInstance();
        ngayGD2.set(2013, Calendar.AUGUST, 15);
        ql.themGiaoDich(new GiaoDichDat("GD002", ngayGD2, 500, 50, "B"));

        Calendar ngayGD3 = Calendar.getInstance();
        ngayGD3.set(2013, Calendar.JULY, 5);
        ql.themGiaoDich(new GiaoDichNha("GD003", ngayGD3, 2000, 80, "cao cap", "123 Street"));

        // Output
        System.out.println("Tong so luong giao dich: " + ql.tongSoLuongGiaoDich());
        System.out.println("Trung binh thanh tien giao dich dat: " + ql.trungBinhThanhTienGiaoDichDat());
        System.out.println("Cac giao dich thang 9 nam 2013: " + ql.giaoDichThang9Nam2013().size());
    }
}