
public class VariableScope {

	public static void main(String[] args) {
		int num = 100;
		
		{
			int num2 = 200;
			
			System.out.println(num);
			System.out.println(num2); // 변수의 스코프(유효(사용범위)) {} 스코프(블록)가 포함된 범위만 인식된다.
		}
		
		System.out.println(num);
//		System.out.println(num2); // (x)
		
	}

}
