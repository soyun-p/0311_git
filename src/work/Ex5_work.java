package work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		// 키보드에서 문장을 입력받고, 홀수 번 째 위치의 문자만 추출
		
		// 입력 : helloWorld
		// 결과 : elWrd
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.next();
		
		int i = 0;
		
		String res = "결과 : "; // 
		
		for(i = 0; i < str.length(); i++) {
			
			if( i % 2 == 0 ) {
				res += str.charAt(i);  // 짝수(화면상 홀수)번 째 문자를 res 옆에 붙여가는 실행문
				
	        } // if
			
		} // for
		
		System.out.print(res);
		
	} // main

}
