package oop;

public class Overload {
	public void dispalyInt(int param) {
		System.out.println("정수값 = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = "+param);
	}
	
	//메소드 오버로드(Method Overload) 선언 : 하나의 클래스에서 동일한 기능을 제공하는 	
	//메소드가 매개변수에 의해 여러 개 선언해야 될 경우 매소드명을 같게 선언하는 방법
	// => 매개변수의 갯수 또는 자료형을 같지 않도록 선언
	// => 접근 지정자 또는 반환형은 오버로드 선언과 무관하다. 
	public void dispaly(int param) {
		System.out.println("정수값 = "+param);
	}
	
	/*
	public int dispaly(int param) {
		System.out.println("정수값 = "+param);
	} 
	*/
	
	public void display(boolean param) {
		System.out.println("논리값 = "+param);
	}
	
	public void display(String param) {
		System.out.println("문자열 = "+param);
	}
	
}
