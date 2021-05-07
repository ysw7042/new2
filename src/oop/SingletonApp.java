package oop;

public class SingletonApp {
	public static void main(String[] args) {
		/*
		//new 연산자가 생성자를 불러와 인스턴스를 생성하여 참조변수에 저장 
		// => 참조변수를 이용하여 인스턴스의 메소드 호출 
		// => 인스턴스의 메소드를 지속적으로 호출하고자 할 경우 사용
		Singleton singleton = new Singleton();
		singleton.display();
		
		//new 연산자가 생성자를 불러와 인스턴스를 생성하고 메소드를 직접 호출
		// => 인스턴스 생성 후 메소드를 하나만 호출할 경우 사용 
		new Singleton().display(); //참조변수를 이용하여 인스턴스를 바로 호출(지속적 참조 불가능) 
		*/
		
		//new 연산자로 생선된 인스턴스는 서로 다른 인스턴스
		// => 일반적인 클래스는 인스턴스를 여러 개 생성 가능 
		Singleton singleton1= new Singleton();
		Singleton singleton2= new Singleton();//참조변수에 저장된 인스턴스는 다르다.
		
		System.out.println("singleton1 = "+singleton1);
		System.out.println("singleton2 = "+singleton2);
		
		singleton1.display();
		singleton2.display();
	}
}
