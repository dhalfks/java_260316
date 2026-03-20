package day05;

public class Array03 {

	public static void main(String[] args) {
		// 합계와 평균을 구해주세요
		// 최대값, 최소값 출력
		int arr[] = {52, 78, 59, 68, 2, 95, 36, 75, 48, 15, 86};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		System.out.println(sum / (double)arr.length);
		
		// 52 78
		int max = 0;
		int min = 100;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("max :"+max);
		System.out.println("min :"+min);
		
		// Math.max() / Math.min()
		
		max = 0; 
		min = 100;
		for(int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("Math.max :"+max);
		System.out.println("Math.min :"+min);
		
		
	}

}
