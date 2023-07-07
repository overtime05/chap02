import javax.print.attribute.SetOfIntegerSyntax;

public class VariableExample {
	
	/*
	 * Type - Primitive (8EA)
	 * 			1. 수치
	 * 				- 정수
	 * 					byte
	 * 					short
	 * 					char
	 * 					int
	 * 					long
	 * 				- 실수
	 * 					float - 4byte
	 * 					double - 8byte 
	 * 			2. 논리
	 * 				-boolean
	 * 
	 * 		- Reference (위의 8개를 제외한 모든것은 Reference타입이다.)
	 * 
	 */

	public static void main(String[] args) {
		int num = 100; // 변수 : 메모리 공간의 이름

		num = num + 100;
		
		System.out.println(num);
		
		//Primitive 타입 / 변수 선언문
		// 정수
		
		byte b; // 1byte	-128 ~ 127 (256개)
		short s; //2byte		
		char c; //2byte
		int i; //4byte
		long l; //8byte
		// 실수
		float f; // 4byte
		double d; // 8byte
		//논리
		boolean tf; // 1byte
		
		b = 100;
		
		
	}

}
