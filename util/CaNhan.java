package util;

/**
 * CaNhan
 */
public abstract class CaNhan {

  // attributes
  protected String hoTen;
  protected int tuoi;
  protected String diaChi;
  protected String sdt;

  // contructor
  public CaNhan() {
    this.hoTen = "";
    this.tuoi = 0;
    this.diaChi = "";
    this.sdt = "";
  }
  public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.sdt = sdt;
  }

  // methods
  public abstract String hienThiTT();
}