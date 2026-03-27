package day09;

public class Class02 {

	public static void main(String[] args) {
		// Test2 객체 생성 => 출력
		// x, y  값 저장 후 => 출력
		
		// 메서드 호출시 객체명.메서드명()
		// toString()
		//System.out.println(객체명); => toString() 찾아서 출력
		Test2 t2 = new Test2();
		t2.setX(50);
		t2.setY(100);
		
		// toString()을 일반 메서드처럼 호출도 가능
		System.out.println(t2.toString());
		
		// 클래스 내부에 toString() 메서드가 없으면 주소가 출력
		System.out.println(t2);
		
	}

}
// default 접근제어자는 나 + 패키지
// 패키지별로 같은 이름의 클래스명을 가질 수 없음.
class Test2{
	private int x;
	private int y;
	
	// toString() => print() 메서드를 String으로 리턴하는 형식
	// (x,y) => String으로 리턴하는 메서드
	// 멤버변수의 값을 전부 나열해서 String으로 리턴
	// 클래스명 [ 멤버변수=값, 멤버변수=값 ]
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	
	// private의 멤버변수를 다른 클래스에서 사용하기 위해서는
	// getter/setter 메서드가 필요
	// getter : 외부에서 내 멤버변수에 접근하기 위해서 필요 (저장은 안됨.)
	// 리턴 필요
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// setter : 외부에서 내 멤버변수의 값을 변경하기 위해 필요 (저장)
	// 매개변수가 필요
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}