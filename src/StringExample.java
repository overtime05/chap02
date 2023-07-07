
public class StringExample {

	public static void main(String[] args) {
		char c1 = ' ';  //스페이스바 공백은 가능하나 아무것도 없는것은 불가
		char c2 = '\'';
		String str1 = "";  // empty string 아무것도 없는것도 가능
		String str2 = "Hello";
		String str3 = "\"Hello\""; // c2설정후 옆에처럼 입력하면 "" 표기가능
		String str4 = "Hello\n World\\"; // 엔터명령어는 \n이다.
		
		System.out.println(c2);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

}
