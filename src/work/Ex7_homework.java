package work;

import java.util.Scanner;

public class Ex7_homework {
	public static void main(String[] args) {
		
		// 홀수 마방진 만들기 : 홀수 라인만큼의 마방진  #2차원 배열
		
		// 맨 위 라인 가운데 칸에 1. 
		// 마지막에 숫자가 규칙에 따라 다 들어가게 되면 한 줄 당 합이 동일.(9칸 마방진-> 15)
		// 해당 칸의 위+오른쪽에 다음 숫자 입력. 그러나 윗 칸이 없는 경우 해당 줄의 마지막 칸으로 이동. 오른쪽으로 이동할 때도 마찬가지.
		
		// 마방진 크기 : 3
		
		// 08 01 06
		// 03 05 07 
		// 04 09 02
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마방진 크기 : ");
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		arr[0][(size/2)+1] = 1;
		
		
				
				 
				
	
		
		
		
		
		
		
	} // main

}
