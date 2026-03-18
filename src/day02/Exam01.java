package day02;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학 점수를 변수로 선언 => 값을 저장
		 * 합계와 평균을 출력
		 * 평균에 소수점은 표시
		 * 조건선택연산자를 이용하여
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 * */
		
		int kor = 500;
		int eng = 96;
		int math = 75;
		
		int sum = kor + eng + math;
		
		System.out.println(sum);
		
		double avg = sum / (double)3; // 정수 / 정수 => 정수 (소수점을 버린 실수)
		
		System.out.println(avg);
		System.out.printf("%.2f %n", avg);
		
		System.out.println(avg >= 80 ? "합격":"불합격");
		
		String pass = avg>=80 ? "합격":"불합격";
		
		System.out.println(pass);
		
		// 합격여부를 if문으로 변경
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("-------------");
		
		// 평균이 80이상이면 합격, 60이상이면 통과, 60미만이면 불합격
		if(avg >= 80) {
			System.out.println("합격");
		}else if(avg>=60) {
			System.out.println("통과");
		}else {
			System.out.println("불합격");
		}
		
		// 평균 100 <=  avg <=0  
		// 평균이 100보다 크거나, 0보다 작으면 오류
		// 평균이 80이상이면 합격, 60이상이면 통과, 60미만이면 불합격
		System.out.println("-------------");
		
		if(avg > 100 || avg < 0) {
			System.out.println("오류");
		}else if(avg >= 80) {
			System.out.println("합격");
		}else if(avg>=60) {
			System.out.println("통과");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("-----------");
		if(avg > 100 || avg <0) {
			System.out.println("오류");
		}else {
			if(avg >= 80) {
				System.out.println("합격");
			}else if(avg>=60) {
				System.out.println("통과");
			}else {
				System.out.println("불합격");
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
