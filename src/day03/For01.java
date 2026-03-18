package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * - for, while은 동작 방식이 같음. 
		 * => 조건에 따라 조건이 맞지 않으면 한번도 실행이 안될 수도 있음.(조건 먼저 비교)
		 * 
		 * do~while문 : 먼저 실행하고, 조건을 나중에 비교함. 무조건 1번은 실행됨.
		 * 
		 * for(1초기화; 258조건식; 47증감식){
		 * 	36실행문;
		 * }
		 * - 초기화 : 실행문을 반복하기 위한 변수를 초기화 (처음 1번만 실행) : 생략가능
		 * - 조건식 : 반복을 결정하는 기능(true = 반복) : 생략가능
		 * - 증감식 : 조건식에서 사용하는 변수를 증가 / 감소시켜 반복 횟수를 결정 : 생략가능
		 * */
		
		for(int i=0; i<=5; i++) {
			System.out.println(i);
			System.out.println("Hello~!!");
		}
		System.out.println("---------");
		
		// 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // 줄바꿈
		
		// 1~10까지 중 짝수만 출력
		// 2부터 2씩증가
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// 1~10까지의 합계(i변수의 값을 누적)
		int sum = 0; 
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println(sum); // 55
		
		// 1~10까지의 짝수합계
		sum=0; // 변수를 다시 쓰기 위한 초기화 
		// i++  : 1증가 i = i + 1
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
				sum = sum + i;  // sum += i
			}
		}
		System.out.println();
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		

	}

}
