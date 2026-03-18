package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지의 랜덤수 하나를 컴퓨터가 생성 => user 모름
		// 유저가 맞추는 게임
		// ex) 컴퓨터가 랜덤수를 생성했습니다.  (23)
		// 입력> 10 up! 
		// 입력> 20 up!
		// 입력> 30 down!
		// 입력> 25 down!
		// 입력> 23 정답!
		
		// 랜덤수 > 유저수  up!
		// 랜덤수 < 유저수  down!
		// 랜덤수 == 유저수 정답
		
		// 횟수 제한  5회 안에 정답을 맞춰야 함.
		
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*50)+1;
		int userNum = 0;
		int count=0;
		
		while(true) {
			System.out.println("입력>");
			userNum = scan.nextInt(); // 사용자 입력
			count++;
			
			if(random > userNum) {
				System.out.println("UP!");
			}else if(random < userNum) {
				System.out.println("Down!");
			}else {
				System.out.println("정답");
				break;
			}
			
			if(count == 5) {
				System.out.println("횟수초과 종료!!");
				System.out.println("정답은 "+random+"입니다.");
				break;
			}
		}
		
		System.out.println("게임종료!!");
		
		
		scan.close();
		
	}

}
