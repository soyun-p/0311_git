package work;

import java.util.Scanner;

public class Ex7_homework_mabangjin {
	public static void main(String[] args) {
		
		// 홀수 마방진 만들기 : 홀수 라인만큼의 마방진  #2차원 배열
		
		// 맨 위 라인 가운데 칸에 1. 
		// 마지막에 숫자가 규칙에 따라 다 들어가게 되면 한 줄 당 합이 동일.(9칸 마방진-> 15)
		// 해당 칸의 (위+오른쪽)에 다음 숫자 입력. 그러나 윗 칸이 없는 경우 해당 줄의 마지막 칸으로 이동. 오른쪽으로 이동할 때도 마찬가지.
		
		// 마방진 크기 : 3
		
		// 08 01 06
		// 03 05 07 
		// 04 09 02
		
	
		Scanner sc = new Scanner(System.in);
		
		// 마방진 크기 입력
		System.out.print("마방진 크기 : ");
		int size = sc.nextInt();
		
		
		// 입력한 크기로 배열 선언 및 생성
		int[][] arr = new int[size][size];
		
		
		int num = 1;  // 시작수(마방진 위에 출력될 숫자)
		int y = 0;    // 행
		int x = 0;    // 열
		
		
		// 항상 (0행, 가운데 열)에 1 저장.
		x = size / 2;  
		
		
		// 마방진 조건()대로 이동한 숫자들을 배열에 저장
		while( num <= size * size ) {  // num이 마방진 크기보다 커질 때까지 반복. 즉, 1부터 시작해서 마방진 크기만큼 반복.
			
			arr[y][x] = num; // arr[0][size/2] = 1 로 시작.
			
			
			if( num % size == 0 ) { // num이 size의 배수일 때 
				y++;                // y(행) 증가 : 위쪽 이동
			}else {  // 그 외는 y(행)는 감소, x(열)은 증가
				y--;
				x++;
			}
			
			
			if( y < 0 ) 
				y = size - 1;   // 만약 y가 0보다 작아지면 size에서 1을 뺀 값만큼의 행으로 이동.
			
			if( x >= size )
				x = 0;          // 만약 x가 size보다 크거나 같다면 0으로 초기화

			num++;
			
		} // while
		
		
		// 위에서 만들어진 마방진 arr배열 출력
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
				
			} // for inner
			
			System.out.println();
			
		} // for outer
		
		
		
		
		
				
				 
				
	
		
		
		
		
		
		
	} // main

}
