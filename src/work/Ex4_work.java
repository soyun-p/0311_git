package work;

public class Ex4_work {
	public static void main(String[] args) {
		
		// 변수 question에 O, X값을 넣는다.
		// ooxxo 라면 1 + 2 + 0 + 0 + 1의 결과인 4.
		// oxxooxooo 라면 1 + 1 + 2 + 1 + 2 + 3의 결과인 10 출력.
		
		
		String question = "ooxxo";
		
		int sum = 0; // 결과 값
		int cnt = 0; // O의 갯수만큼 증가
		
		for(int i = 0; i < question.length(); i++) {
			char ch = question.charAt(i);
			
			if( ch == 'O' ) {
				cnt++;
				sum += cnt;  // O를 만난만큼 cnt가 증가되기 때문에 이를 sum에 누적해서 더한다.
			} else {
				cnt = 0;   // X를 만나면 다시 0으로 초기화. x를 만났을 때에는 다시 1부터 더하기 때문.
			}
			
		} // for
		
		System.out.println(sum);
		
		
		
		// String str --> null  : 비워진 상태
		// String str = "";     : 채운 상태로 메모리 할당
		
		// 메모리 자체가 다름.
		
		
		
		
	} // main

}
