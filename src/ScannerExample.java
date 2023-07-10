import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 나이는 >>"); // 터미널에서 입력값을 가지고 옴
		int age = scan.nextInt(); // 숫자문자를 가지고옴 숫자랑 다름
		
		System.out.printf("10년 후 당신의 나이는 %d살 입니다.\n", age+10);
	
		byte byteValue = 10;
		char charValue = 'A';
		
		
	}

}
