package work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		// 키보드에서 값을 입력받고, 입력받은 값이 모두 숫자로만 이루어져 있다면, "정수입니다."를, 그렇지 않다면 "문자가 섞여 있습니다." 출력
		
		// 입력 : 12345
		// 정수입니다.
		
		// 입력 : 123o
		// 문자가 있습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		
		int i = 0;
		
		for(i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( ch < '0' || ch > '9' ) {
				break;		
			} // if
			
			
		} // for 
		
		if( i != str.length() ) {
			System.out.println("문자가 섞여 있습니다.");
			
		}else {
			System.out.println("정수입니다.");
		}
		

		
		
		
		
		
		
		
	} // main

}
