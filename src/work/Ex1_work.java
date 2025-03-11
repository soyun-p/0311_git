package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 문장을 한 글자씩 쪼개서 출력.
		
		// 값 : JAVA
		
		// J
		// A
	    // V
		// A
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 : ");
		String num = sc.next();
		
		for(int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			System.out.println(ch);
			
		} // for
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
