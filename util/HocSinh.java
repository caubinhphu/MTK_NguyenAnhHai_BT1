package util;

public class HocSinh extends CaNhan {
  // attributes
  private String lop;
  private String nangKhieu;

  // contructor
  public HocSinh() {
    super();
    this.lop = "";
    this.nangKhieu = "";
  }
  public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
    super(hoTen, tuoi, diaChi, sdt);
    this.lop = lop;
    this.nangKhieu = nangKhieu;
  }

  // methods
  // hien thi thong tin
  @Override
  public String hienThiTT() {
    String thongTin = "";
    thongTin = "ho ten: " + this.hoTen + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
      + ", sdt: " + this.sdt + ", lop: " + this.lop + ", nang khieu: " + this.nangKhieu;

    System.out.println(thongTin);
    return thongTin;
  }
}