package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 존재하지 않는다면
		// 일치하는 항목이 없습니다. => 출력
		
		String[] fileName = {
				"이것이자바다.java","java의정석.java", "array.txt",
				"array.java","String.txt","StringMethod.jpg",
				"ArrayMethod.png", "method.jpg","javaMethod.png"
		};
		
		// 대소문자 구분없이 검색 (소문자로 검색)
		Scanner scan = new Scanner(System.in);
		// 1. 검색어 입력받기
		System.out.println("검색어 입력>");
		String search = scan.next().toLowerCase(); // 소문자로 변환해서 입력
		
		// 2. 배열에 검색어가 있는지 확인 
		// 문자열 속에 단어가 포함되어 있는지 확인 => contains
		
		// 검색어를 포함하는 파일이 존재하지 않는다면
		int count=0;
		
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].toLowerCase().contains(search)) {
				count++;
				System.out.println(fileName[i]);
			}
		}
		
		if(count==0) {
			System.out.println("일치하는 항목이 없습니다.");
		}else {
			System.out.println("---------");
			System.out.println("검색결과 : "+count+"개");
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
