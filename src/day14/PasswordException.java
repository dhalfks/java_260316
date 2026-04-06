package day14;

public class PasswordException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* 사용자 정의 Exception 생성할 때 조건
	 * IllegalArgumentException : 매개변수가 잘못 사용되었을 때 발생하는 익셉션
	 * 사용자 지정 exception 정의시 발생 시키고자 하는 익셉션을 상속받아 사용함.
	 * */
	public PasswordException(String message) {
		super(message);
	}

}
