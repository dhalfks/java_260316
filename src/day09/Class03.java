package day09;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();  // 기본생성자로 생성
		c.setName("카니발");
		c.setYear(2026);
		
		c.power();
		c.print();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();


		
		
		//------------------------------------------
		System.out.println("---------");
		Car c2 = new Car("소나타", 2026); // 매개변수 생성자를 사용
		c2.print();
		c2.power();
		c2.print();

	}

}

class Car{
	// 속도, 시동, 이름, 연식
	
	// 멤버변수
	private String name;
	private int year; // String으로 해도 상관없음.
	private int speed; // 속도
	private boolean power; // 시동
	
	// 생성자 - 멤버변수 아래
	/* 객체를 생성할 때 (new) 초기값을 지정해주는 역할
	 * 기본생성자 : 컴파일러가 컴파일시 자동으로 제공
	 * - object = null / 숫자 = 0 / boolean = false
	 * - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * - 기본생성자를 직접 만들수도 있음. 
	 * - 생성자는 여러개 생성 가능 (생성자 오버로딩)
	 * - 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야 가능.
	 * - 생성자를 만들 때 꼭 기본생성자와 같이 생성함.
	 * public 클래스명(매개변수){
	 * 	멤버변수 값을 설정
	 * }
	 * - 생성자는 리턴타입이 없는 메서드와 같은형태
	 * - 이름은 반드시 클래스명을 따른다.
	 * */
	
	// 기본 생성자
	public Car() { }
	
	// 매개변수가 있는 생성자
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	// 메서드
	// 1. 시동을 켜고 끄는 메서드
	// 꺼짐 => 켜짐 / 켜짐 => 꺼짐
	public void power() {
		// 내 멤버변수 power를 
		// false => true / true => false
		// power를 호출하면 현재 power변수의 상태가 반대로 바뀜.
//		if(this.power) {  
//			this.power = false;
//		}else {
//			this.power = true;
//		}
		if(this.speed == 0) {
			this.power = !this.power;
		}else {
			System.out.println("ERROR!!");
		}
	}
	
	
	// 2. 출력 메서드
	// (OFF / ON) / speed
	public void print() {
//		if(this.power) {
//			System.out.println("ON / "+this.speed);
//		}else {
//			System.out.println("OFF / "+this.speed);
//		}
		
		System.out.println((this.power ? "ON" : "OFF")+ 
				" / "+this.speed);
			
	}
	
	// 3. speedUp (+20) - 액셀밟기
	public void speedUp() {
		if(this.power) {
			if(this.speed == 200) {
				this.speed = 200;
			}else {
				this.speed = this.speed + 20;  // this.speed += 20				
			}
			print();
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}
	
	 
	// 4. speedDown (-20) - 브레이크 밟기
	public void speedDown() {
		if(this.power) {
			if(this.speed == 0) {
				this.speed = 0;
			}else {
				this.speed -= 20;				
			}
			print();
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}
	
	
	// getter/setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeend(int speend) {
		this.speed = speend;
	}
	public boolean isPower() {
		return this.power;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}