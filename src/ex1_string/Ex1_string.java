package ex1_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
		
		// String 클래스 : 객체. 자바의 가장 대표적인 클래스 중 하나.
		
		// 1) 객체 생성 방법이 두 가지 (암시적, 명시적)
		int n;
		char c;  // 변수
		
		// 앞글자가 대문자로 만들어진 변수는 '객체'라고 한다. 그러나 String은 변수라고도 한다.
		String s1 = "abc";
		String s2 = "abc";
		
		// 변수 s1, s2는 스택 메모리에, "abc"라는 값은 힙 메모리에 저장됨.(힙 메모리에 할당 받는 것은 거의다 객체라고 봐도 무방.)
		// 이때 s1, s2에 저장된 "abc"는 동일한 형태의 값이기 때문에 같은 저장 공간 주소를 공유한다. => 암시적 객체 생성
		
		
		// 명시적 객체 생성. new를 명시하면 무조건 메모리에 새로운 저장 공간을 할당받는다.
		// 따라서 저장된 값이 s1, s2와 같아도, 저장공간의 주소는 다르다.
		String s3 = new String("abc");  // 명시적 객체 생성 : new를 통해 새로운 주소 할당 받는다.
		
		// 
		Scanner sc = new Scanner(System.in); 
		System.out.print("s4 : ");
		String s4 = sc.next();
		
		
		
		// 변수가 아닌 객체들끼리 == 로 비교하면, 저장된 값이 아니라 저장공간의 주소를 비교.
		if( s1 == s4) { 
			System.out.println("주소가 같습니다.");		
		}else {
			System.out.println("주소가 다릅니다.");
		}
		
		
		// String 끼리 저장된 값 비교
		if( s1.equals(s4) ) {
			System.out.println("값이 같습니다.");
			
		}else {
			System.out.println("값이 다릅니다.");
		}
		
		
		
		
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		String greet = "hi";
		greet += "hello";     // greet = greet + "hi"
		System.out.println( greet );  // hihello 출력.
		
		// greet이 원래 가지고 있던 주소에 새로운 값을 더하는게 아니라, 기존 주소를 버리고, hihello라는 새로운 값의 저장공간 주소를 새로 할당받는다.
		// 이는 한 번 만들어진 문자열의 내용은 변경할 수 없기 때문이다.
		
		// 이때 기존의 잊어버린 주소는 쓸모없이 방치되어 있기 때문에 메모리가 낭비된다.
		// 따라서 힙 메모리 내에서 계속해서 돌고 있던 가비지 컬렉터(GC)에서 삭제 처리한다.(자바의 장점)
		// c언어는 수동으로 지움. 대신 쌓이는 속도보다 지우는 속도가 높아서 메모리 용량 부족으로 인한 프로그램 튕김이 적다.
		
		
		String str1 = "hong";
		String str2 = "hong";
		str1 = "gil dong";
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
