package day12;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("뽀삐", "개과");
		d.printInfo();
		d.howl();
		d.eating("고기");
		
		// Animal a = new Animal(); // 추상클래스는 객체 생성 불가능
		
		Cat c = new Cat("냥냥이", "고양이과");
		c.printInfo();
		c.howl();
		c.eating("츄르");
	}

}

class Cat extends Animal{
	private String eat;
	
	// 생성자
	public Cat(String name, String category) {
		// 상속받은 멤버변수의 접근제어자가 protected 일경우 this.멤버변수 사용가능
		this.name = name;
		this.category = category;
	}

	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println("-"+name+"의 울음소리 야옹~!!");
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		this.eat = eat;
		System.out.println("-"+name+"은 "+eat+"를 좋아해요.");
	}
	
	
}

class Dog extends Animal{
	private String eat;
	
	// 생성자
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println("-"+name+"의 울음소리 멍멍~!!");
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		this.eat = eat;
		System.out.println("-"+name+"은 "+eat+"를 좋아해요.");
	}
	
}

// abstract : 상속 용도로 사용
abstract class Animal{
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println("이름:"+name+"("+category+")");
	}
	
	// 추상메서드
	abstract void howl();
	abstract void eating(String eat);
	
}