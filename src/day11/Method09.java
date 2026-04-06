package day11;

public class Method09 {
	
	public int fact(int num) {
		int result = 1; // 초기값이 0이면 모든 값은 0
		if(num < 0) {
			return 0;
		}
		if(num == 0 || num ==1 ) {
			return 1;
		}
		for(int i=2; i<=num; i++) {
			result *= i;
		}
		return result;
	}
	
	// 재귀 메서드로 변경
	public int factorial(int num) {
		if(num < 0) {
			return 0;
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		
		return num * factorial(num-1);
		// 5 * 4 * 3 * 2 * 1  => 종료
		// num * factorial(num-1 * factorial(num-1 * factorial(num-1, factorial(1))))
	}
	

	public static void main(String[] args) {
		/* 재귀메서드 : 메서드 안에 자신의 메서드를 호출 하는 메서드
		 * ! : 팩토리얼
		 * 1부터 자신의 수까지 곱해서 값을 리턴
		 * 0! => 1
		 * 1! => 1
		 * 2! => 1*2
		 * 3! => 1*2*3
		 * 4! => 1*2*3*4
		 * 5! => 1*2*3*4*5
		 * */
		
		Method09 m9 = new Method09();
		System.out.println(m9.fact(5));
		System.out.println(m9.factorial(5));
		
	}

}
