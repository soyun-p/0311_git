package ex1_string;

public class Ex2_String_method {
	public static void main(String[] args) {
		
		// 메소드 : 어떤 작업을 수행하기 위한 명령문들의 집합.
		// 반복적으로 사용되는 코드를 줄이기 위한, 재활용성의 극대화를 위해 필요
		
		String name = "Hong Gil Dong";
		int len = name.length();  // 배열의 length와는 달리 () 사용.
		System.out.println("name의 길이 :" + len);
		
		int index = name.indexOf('o');
		System.out.println("맨 처음 o의 위치 : " + index);
		
		index = name.indexOf("Gil");
		System.out.println("문자열 Gil이 시작 위치 : " + index);
		
		index = name.lastIndexOf('o');
		System.out.println("마지막 o의 위치 : " + index);
		
		char ch = name.charAt(5);
		System.out.println("추출한 문자 : " + ch); // 5번째 위치한 문자 한 글자만.
		
		String str = name.substring(1, 7);
		System.out.println("잘라낸 문장 : " +  str);
		
		String fruit = "apple";
		if( fruit.equals( "apple" )) {
			System.out.println("값이 같다");	
		} // if
		
		if( fruit.equalsIgnoreCase("Apple")) {
			System.out.println("대소문자는 달라도 의미는 같아");	
		} // if
		
		
		String id = " user12";
		System.out.println(id.length());
		
		
		// trim() : 문자열 맨 앞뒤의 의미없는 공백 무시하는 메서드. 문자열 중간에 있는 공백은 무시 못함.
		String checkId = id.trim(); // 해당 메서드를 사용할 때만 임시로 공백 무시한 후 checkId에 저장.
		System.out.println(id.length());       // 7
		System.out.println(checkId.length());  // 6
		
		if( checkId.equals( "user12" )) {
			System.out.println("로그인 성공");
		} // if
		
		
		// parstInt() : 문자열 형식의 숫자("10")를 실제 정수 구조로 변경하는 함수(메서드)
		String number = "100";
		int num2 = Integer.parseInt( number );
		num2 += 10;
		System.out.println(num2);
		
		
		
		// 모든 자료형들은 부모 클래스(wrapper클래스)를 가지고 있다. Integer 클래스가 가지고 있는 기능을 int가 사용하는 것. 
		// 기본 자료형의 Wrapper 클래스 : 모두 풀네임과 대문자 이니셜.
		// int -> Integer
		// char -> Character
		// boolean -> Boolean
		// byte -> Byte
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
		
		
		
		
	} // main

}
