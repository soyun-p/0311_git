package work;

import java.util.Scanner;

public class Ex3_work_check {
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
			// ch => str의 각 문자들의 아스키 코드 자체. 
		    // 따라서 문자열 중 0~9 사이의 아스키 코드에 해당되는 문자가 없는 자리가 있으면
			// 바로 for문을 나온다.
				break;		
			} // if
			
			
		} // for 
		
		// i가 str의 길이와 같다면 중간에 나온 적이 없으므로 전부 다 정수이고, 
		// 같지 않다면 중간에 for문을 그만두고 나온 것이기 때문에 문자가 섞여 있는 것이다.
		if( i != str.length() ) {
			System.out.println("문자가 섞여 있습니다.");
			
		}else {
			System.out.println("정수입니다.");
		}
		

		
		
		
		
		
		
		
	} // main

}
