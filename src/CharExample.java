
public class CharExample {

	public static void main(String[] args) {
		
		//문자 하나를 표현할때는 ' 싱글따옴표를 사용한다
		//캐릭터 타입은 정수를 가지고 있다.
		char c1 = 'A';  // 2byte -> utf-16이라서 2byte이다.
		char c2 = 65;	
		char c3 = 0b01000001;
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	 char c4 = '가';
			 
		System.out.println("c4=" + c4);
	 
		int ga = c4;
		System.out.println("ga=" + ga);

		int hit = '힣';
		System.out.println("hit=" + hit);
	}

}
