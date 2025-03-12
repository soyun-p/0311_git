package work;

import java.util.Scanner;

public class Ex9_work {
	public static void main(String[] args) {
		
		// 배우이름 : lee
		// [lee]
		// 레드
		// 광해
		// 지아이조
		
		// 배우이름 : aaa
		// 해당 배우의 정보가 없습니다.
		
	
		String[][] actor = { { "[song]", "박쥐", "기생충", "관상" },
				             { "[jeong]" , "놈놈놈", "서울의 봄", "비트" },
				             { "[lee]", "레드", "광해", "지아이조" } }; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배우이름 : ");
		String name = sc.next();
		
		int cnt = 0; // 배우를 한 명도 못 찾았을 경우의 수를 세는 변수
		
		out:for(int i = 0; i < actor.length; i++) {
			
			if( actor[i][0].equalsIgnoreCase("[" + name + "]") ) { // 대괄호 없이도 
				
				for(int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
					
				} // for inner if
				
			}else {
				// 아래와 같은 조건을 해놓지 않으면, for문에서 name과 배열안의 배우 이름을 대조했을 때, 
				// 같지 않을 때마마 "해당 배우의 정보가 없습니다."를 출력하기 때문에 
				// cnt 값이 배우 숫자(actor[i].length)만큼 증가했을 때에만 출력하도록 한다.
				
				cnt++;  // name과 배열 안의 배우 이름을 대조하고, 해당 배우가 아니라면 cnt 증가
				
				if( cnt == actor[i].length ) { 
					System.out.println("해당 배우의 정보가 없습니다.");
				} // if
					
			} // if-else

			
		} // for outer
		
		
		
		
		
		
	} // main

}
