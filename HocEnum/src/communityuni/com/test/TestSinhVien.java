package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		ArrayList<SinhVien>dsSV = new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "Tèo", 6));
		dsSV.add(new SinhVien(2, "Tý", 4));
		dsSV.add(new SinhVien(3, "Con", 5));
		dsSV.add(new SinhVien(4, "Cú", 10));
		System.out.println("Danh sách sinh viên");
		for(SinhVien sv : dsSV)
			System.out.println(sv);

	}

}
