
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SachGiaoKhoa extends Sach {
    private int lop;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String tenSach, String nhaXuatBan, int soLuong, int lop) {
        super(maSach, tenSach, nhaXuatBan, soLuong);
        this.lop = lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getLop() {
        return lop;
    }

    public void NhapSach() {
        super.NhapSach();
        System.out.print("Nhap lop cua sach: ");
        scanner.nextLine();
        lop = scanner.nextInt();
    }
    
    @Override
    public List<String> InSach() {
        return Arrays.asList(this.maSach, this.tenSach, this.tenNXB, String.valueOf(this.lop),String.valueOf(this.soluong));
    }
}