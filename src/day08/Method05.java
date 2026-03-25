package day08;

public class Method05 {
	
	/* 최대공약수 
	 * 매개변수: 두 정수 => int num1, int num2
	 * 리턴타입: 최대공약수 => int
	 * 메서드명: gcd
	 * 
	 * */
	public int gcd(int num1, int num2) {
		int g = 0; 
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2%i == 0) {
				g = i;				
			}
		}
		return g;
	}
	
	
	/* 최소공배수
	 * 매개변수: 두 정수 => int num1, int num2
	 * 리턴타입: 최소공배수 => int
	 * 메서드명: lcm
	 * */
	public int lcm(int num1, int num2) {
//		for(int i=num1; ; i=i+num1) {
//			// 10 20 30 40 ...
//			if(i % num1 == 0 && i % num2 == 0) {
//				return i;
//			}
//		}
		//return 0; for문에서 조건에 안맞는 경우 생길수있는 return 포함.
		
		// 최소공배수는 두 수를 곱해서 최대공약수로 나누면
		if(num1==0 || num2==0) {
			return 0;  // 미리 오류 방지
		}
		return (num1*num2) / gcd(num1, num2);
		
	}

	public static void main(String[] args) {
		// 최대공약수와 최소공배수 출력 메서드
		int num1 = 16;
		int num2 = 20;
		
		Method05 m5 = new Method05();
		int gcd = m5.gcd(num1, num2); // 최대공약수 리턴
		System.out.println(gcd);
		
		System.out.println(m5.lcm(num1, num2));

	}

}
