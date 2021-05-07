package oop;

public class MemberApp {
	public static void main(String[] args) {
		//new 연산자로 기본 생성자(매개변수가 없는 생성자)를 호출하여 인스턴스 생성
		// => new 연산자가 사용한 생성자가 없는 경우 에러 발생 - 인스턴스 생성 불가능
		// => 인스턴스의 필드에는 기본값이 자동 저장
		Member member1=new Member();//생성자는 new 연산자로만 불러올수 있다. ex)new Member 
		
		//Getter 메소드를 호출하여 인스턴스의 필드값을 반환받아 출력
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이름 = "+member1.getName());
		System.out.println("이메일 = "+member1.getEmail());
		System.out.println("==========================================================");
		//Setter 메소드를 호출하여 매개변수에 전달된 값을 이용하여 인스턴스의 필드값 변경
		member1.setId("aaa");
		member1.setName("홍길동");
		member1.setEmail("aaa@daum.net");
		
		/*
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이름 = "+member1.getName());
		System.out.println("이메일 = "+member1.getEmail());
		*/
		member1.display();
		System.out.println("==========================================================");
		//생성자가 선언된 매개변수를 이용하여 인스턴스 생성
		// => 매개변수에 전달된 값이 필드에 저장
		Member member2=new Member("bbb");
		member2.display();
		System.out.println("==========================================================");
		Member member3=new Member("ccc", "임꺽정");
		member3.display();
		System.out.println("==========================================================");
		Member member4=new Member("ddd", "전우치", "ddd@naver.com");
		member4.display();
		System.out.println("==========================================================");
	}
}
