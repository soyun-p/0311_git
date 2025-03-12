package work;

import java.util.Scanner;

public class Ex8_work {
	public static void main(String[] args) {
		
		// 키보드에서 입력 받은 값을 암호화하여 출력하기
		
		// 입력 : abc123
		// 결과 : `~!wer
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		
		String result = "";
		
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-',
				           '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( ch >= 'a' && ch <= 'z' ) {
				result += abcCode[ch - 'a'];  
				// ch 자체가 해당 문자의 아스키 코드이므로, 시작점인'a'를 빼주면 해당 문자의 배열 인덱스와 같아지게 됨.
				// 예를 들어, ch가 a이고 abc코드의 0번째 인덱스에 저장되어 있는데, 
				// ch-a = 96-96이므로 0번 인덱스에 저장되어 있는 '`'를 result에 저장한다.
				
			}else if( ch >= '0' && ch <= '9' ) {
				result += numCode[ch - '0'];	
			}
			
		} // for	
	
		
		System.out.println(result);
		
		
		
		
		
	} // main

}
