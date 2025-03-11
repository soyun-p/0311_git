package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 키보드에서 아무 값이나 받아서, 소문자 a의 갯수 출력.
		
		// 입력 : lakjmoinoskdfn;aon;oineofnao
		// a의 갯수 : 3
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if( str.charAt(i) == 'a' ) {  // ch가 char 타입이기 때문에 equals() 사용 못함.
				cnt++;
				
				
				
			} // if
			
		} // for
		
		System.out.println("a의 갯수 : " + cnt);  // 결과는 한 줄만 나오니까 for문 밖에서 출력.
		
		
		
		
		
	} // main

}
