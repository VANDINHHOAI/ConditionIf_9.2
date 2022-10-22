package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		if (n % 3 == 0 || n % 5 == 0) {
			System.out.println(n);
		}else {
			System.out.println("n khong chia het cho 3 hoac chia het cho 5");
		}
	}

}
