package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV("LG");
		tv.power();
		tv.chUp();
		tv.pick();
		tv.chUp();
		tv.pick();
		tv.chUp();
		tv.pick();
		tv.chDown();
		tv.pick();
		tv.chDown();
		tv.chDown();
		tv.pick();
		tv.chDown();
		tv.pick();
		tv.chDown();
		tv.chDown();
		tv.chDown();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.favorList();
		
		/* 선호채널 등록
		 * 5개까지 등록가능
		 * 1. 선호채널 등록메서드
		 * - 현재 채널을 선호채널 배열에 넣기
		 * 2. 선호채널 리스트 보기 
		 * - 등록된 선호채널을 리스트로 출력
		 * */
		System.out.println("🧩🔮🎲🎰✈💥");
	}

}

class TV{
	// 멤버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor = new int[5];
	private int index; // 배열의 번지 역할
	
	// 생성자 
	// 기본생성자
	public TV() {
		ch = 3;
		vol = 3;
	}
	
	// 매개변수 생성자 brand만 받기
	public TV(String brand) {
		this(); // 생성자 호출 : 첫줄에서만 가능
		this.brand = brand;
	}
	
	// 메서드
	//pick() : 선호채널로 등록
	public void pick() {
		// index 번지에 현재 채널을 넣는다.
		boolean check = false;
		if(this.power) {
			if(favor.length == index) {
				index = 0;
			}
			for(int i=0; i<favor.length; i++) {
				if(favor[i] == ch) {
					check = true;
				}
			}
			if(!check) {
				favor[index] = ch;
				index++;									
			}
			System.out.println(ch+"번 선호채널 등록!!");
		}
	}
	
	// favorList() : 선호채널 출력
	public void favorList() {
		// 배열을 리스트 형태로 출력
		System.out.println("--선호채널 목록--");
		if(favor[0]==0) {
			System.out.println("선호채널이 등록되지 않았습니다.");
			return;
		}
		for(int i=0; i<favor.length; i++) {
			System.out.print(i+1+". ");
			if(favor[i] == 0) {
				System.out.println("💥");
			}else {
				System.out.println(favor[i]);
			}
		}
	}
	
	// power on / off
	public void power() {
		this.power = !this.power;
		if(this.power) {
			System.out.println("전원이 켜집니다.");
		}else {
			System.out.println("전원이 꺼집니다.");
		}
	}
	
	//chUp (1~10까지 순환구조) 
	public void chUp() {
		if(this.power) {
			ch++;
			if(ch > 10) {
				ch=1;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	//chDown (1~10까지 순환구조)
	public void chDown() {
		if(power) {
			ch--;
			if(ch<1) {
				ch=10;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	//volUp (0~20까지)
	public void volUp() {
		if(power) {
			vol++;
			if(vol>10) {
				vol = 10;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	// volDown (0~20까지)
	public void volDown() {
		if(power) {
			vol--;
			if(vol<=0) {
				System.out.println("음소거");
				vol=0;
				return;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	// toString
	@Override
	public String toString() {
		return "TV [brand=" + brand + ", power=" + power + ", ch=" + ch + ", vol=" + vol + "]";
	}

	//getter/setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}
		
}