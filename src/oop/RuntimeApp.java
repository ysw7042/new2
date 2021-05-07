package oop;

//Runtime : Java 프로그램을 실행하는 JVM(Java Virtual Machine) 관련 정보를 저장하는 클래스 
// => 생성자가 은닉화 선언되어 new 연산자로 인스턴스 생성 불가능 
// => getRuntime() 정적 메소드를 호출하여 인스턴스를 반환받아 사용 
// => 프로그램에 인스턴스를 하나만 제공하는 클래스 - 싱글톤 클래스
public class RuntimeApp {
	public static void main(String[] args) {
		//Runtime runtime = new Runtime();
		
		//Runtime.getRuntime() : Runtime 인스턴스를 반환하는 메소드
		// => 메소드를 여러번 호출해도 같은 인스턴스 반환 
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		
		
		System.out.println("runtime1 = "+runtime1);
		System.out.println("runtime2 = "+runtime2);
		System.out.println("=====================================================");
		//인스턴스를 반환받아 참조변수에 저장하지 않고 직접 메소드 호출
		//Runtime.totalMemory() : JVM 프로그램이 사용할 수 있는 전체 메모리 크기를 반환하는 메소드
		//Runtime.freeMemory() : JVM 프로그램이 사용할 수 있는 남은 메모리 크기를 반환하는 메소드
		System.out.println("청소 전 JVM 사용 메모리 크기 = "+(Runtime.getRuntime().totalMemory()
				-Runtime.getRuntime().freeMemory())+"Byte");
		
		//Runtime.gc() : Garbage Collector 프로그램을 실행하는 메소드
		// => System.gc() 메소드 호출과 동일한 기능 제공
		//Runtime.getRuntime().gc();		
		System.gc();
		
		System.out.println("청소 전 JVM 사용 메모리 크기 = "+(Runtime.getRuntime().totalMemory()
				-Runtime.getRuntime().freeMemory())+"Byte");
		System.out.println("=====================================================");		
	}
}
