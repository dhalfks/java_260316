package day08;

public class MethodEx02 {
	
	/* 1. 배열을 매개변수로 받아 출력하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : void
	 * */
	public void print(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("============================");
	}
	
	/* 2. 배열을 매개변수로 받아 오름차순으로 정렬하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : void
	 * */
	public void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j] ) {
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 3. 배열을 매개변수로 받아 합계, 평균, 최대, 최소값을 출력하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : void
	 * */
	public void totalPrint(int arr[]) {
		int sum =0;
		double avg = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		avg = sum / (double)arr.length;
		System.out.println("합계:"+sum +" / 평균:"+avg);
		System.out.println("최대:"+max +" / 최소:"+min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {78,85,49,68,59,63,26,59,98,84,75,43,52};
		
		// 메서드 생성
		/* 1. 배열을 매개변수로 받아 출력하는 메서드
		 * 2. 배열을 매개변수로 받아 오름차순으로 정렬하는 메서드
		 * 3. 배열을 매개변수로 받아 합계, 평균, 최대, 최소값을 출력하는 메서드
		 * */
		MethodEx02 m2 = new MethodEx02();
		m2.print(arr);
		m2.sortArray(arr); // 정렬만
		m2.print(arr);
		
		m2.totalPrint(arr);
		
	}

}
