package hoanghothaibao;
import java.util.Scanner;

public class bao107739 {
	public static String gioiTinh(boolean gt) {
		return gt ? "Nam":"Nu";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println(" ........ Please input your information.......");
		
		System.out.print(" nhap gioi tinh (true) cho NAM va( false )cho NU:");
		boolean gioiTinh1 = sc.nextBoolean();
		System.out.print(gioiTinh(gioiTinh1));
		
		System.out.println(" moi nhap HO TEN:");
		String ten =new Scanner ( System.in).nextLine();
		
		System.out.println(" Ma sinh vien:");
		int msv = new Scanner ( System.in).nextInt();
		
		System.out.println(" moi nhap ngay sinh:");
		String ngaySinh =new Scanner ( System.in).nextLine();
		
		System.out.println(" moi nhap TUOI :");
		Short tuoi = new Scanner ( System.in).nextShort();
		
		System.out.println(" moi nhap LOP: ");
		String lop =new Scanner ( System.in).nextLine();
		
		System.out.println(" moi nhap KHOA :");
		String khoa =new Scanner ( System.in).nextLine();	
		
		System.out.println(" moi nhap ADDRESS: ");
		String address =new Scanner ( System.in).nextLine();	
		
		
		System.out.println("........END....... ");
	}
	

}
