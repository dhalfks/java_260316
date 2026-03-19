package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2~9단까지 출력
		// For03 구구단 예제 참고
		int dan = 2;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		// 2*1=2  2*2=4  .... 2*9=18
		// 3*1=3  3*2=6  .... 3*9=27
		// ...
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"  ");
			}
			System.out.println();
		}
		
		// i=1  j = 2~9
		// i=2  j = 2~9
		// i=3  j = 2~9
		
		/* 2*1=2  3*1=3  4*1=4 ...
		 * 2*2=4  3*2=6  4*2=8
		 * 2*3=6  3*3=9  4*3=12 
		 * ...
		 * */

	}

}
