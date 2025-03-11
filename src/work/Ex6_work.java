package work;

import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값이 회문인지 판단
		
		// 입력 : ab1ba
		// ab1ba은(는) 회문임
		
		// 입력 : 123
		// 123은(는) 회문이 아님
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.next();
		
		String rev = "";  // 원문을 거꾸로 뒤집은 문자열을 저장할 공간.
		
		for(int i = str.length()-1; i >= 0; i--) { // 범위 조심.
			char ch = str.charAt(i);
			
			rev += str.charAt(i);

		} // for
		
		
		if( str.equals(rev) ) {
			System.out.println(str + "은(는) 회문임");
		}else {
			System.out.println(str + "은(는) 회문이 아님");
		} // if
		
		
	} // main

}
