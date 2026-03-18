package day03;

public class For02 {

	public static void main(String[] args) {
		// 1~100까지의 합계 출력 5050
		int s=0;
		
		// 지역변수는 반드시 초기화를 해주어야 사용가능. 
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;   // sum = sum + i
		}
		System.out.println(sum);

	}

}
