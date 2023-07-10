
public class PrintExample {

	public static void main(String[] args) {
		
		System.out.printf("ch = [%c]\n", 'A');
		System.out.printf("ch = [%10c]\n", 'A');
		System.out.printf("ch = [%-10c]\n", 'A');
		
		System.out.printf("str = [%s]\n", "Hello");
		System.out.printf("str = [%10s]\n", "Hello");
		System.out.printf("str = [%-10s]\n", "Hello");
		
	}
	
	
	public static void main5(String[] args) { // 소수를 뽑을때는 f
		System.out.printf("real = [%f]\n", 10.769);
		System.out.printf("real = [%20f]\n", 10.769);
		System.out.printf("real = [%-20f]\n", 10.769);
		System.out.printf("real = [%020f]\n", 10.769);
		System.out.printf("real = [%+20f]\n", 10.769);
		System.out.printf("real = [%20.2f]\n", 10.769); // 소수점 자리수 (반올림됨)
		
	}
	
	public static void main4(String[] args) { // 정수를 뽑을때는 d
		System.out.printf("num = [%d]\n", 99); // printf는 틀을 갖춰서 나오는것
		System.out.printf("num = [%10d]\n", 99);  // 오른쪽정렬
		System.out.printf("num = [%-10d]\n", 99); // 왼쪽정렬(음수를 나타내는것이 아님)
		System.out.printf("num = [%010d]\n", 99); // 나머지 빈공간을 0으로 채운다
		System.out.printf("num = [%+10d]\n", 99); // +기호를 나타냄
		
	}
	
	public static void main3(String[] args) {
		System.out.print("hello\n");
		System.out.println("hello");
		System.out.print("hello\n");
		
		System.out.println("Program End...");
		
	}
		public static void main2(String[] args) {
			
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		
		System.out.print(result);
		System.out.println(result);
		System.out.print(result);

	}

}
