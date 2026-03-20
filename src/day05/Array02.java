package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5명의 점수를 입력받기 => 배열로 생성
		/* 1. 배열을 생성 5개
		 * 2. 점수를 입력받는다 (0~100)
		 * 3. 점수를 출력한다.
		 * 4. 점수의 합계와 평균을 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		double avg = 0;
		
		System.out.println("학생 성적 5명을 입력해주세요.");
		for(int i=0; i<arr.length; i++) {
			
			int score = scan.nextInt();
			
			while(score<0 || score>100) {
				System.out.println("점수의 범위가 벗어났습니다. ");
				System.out.println("다시 입력해주세요>");
				score = scan.nextInt();
			}
			System.out.println("점수입력완료!!");
			arr[i] = score;
			sum = sum + arr[i];   //sum += arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		avg = sum / (double)arr.length;
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		
		scan.close();
	

	}

}
