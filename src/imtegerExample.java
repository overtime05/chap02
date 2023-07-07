
public class imtegerExample {

	public static void main(String[] args) {
		// 4byte를 표현
		int max = 0b01111111_11111111_11111111_11111111;
		int min = 0b10000000_00000000_00000000_00000000;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		//overtflore, underflore를 조심해야한다.
		
		max = max + 1;
		System.out.println("max=" + max);
	}

}
