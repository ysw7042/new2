package oop;

//this : 메소드에 숨겨져 있는 매개변수(키워드)
// => 메소드를 호출한 인스턴스의 정보를 저장하기 위한 참조변수
// => 인스턴스가 메소드를 호출한 경우 호출 인스턴스의 정보를 자동으로 전달받아 저장
// => 메소드의 명령에서 인스턴스의 필드 또는 메소드에 접근하기 위해 사용
// => this 매개변수를 표현하지 않아도 인스턴스 필드 또는 메소드에 접근 가능

//메소드에 this 매개변수가 존재한 이유
// => 필드는 인스턴스마다 메모리(Heap)에 따로 생성되지만 메소드는 인스턴스의 갯수에 상관없이 
//    메모리(Static)에 하나만 생성 - 프로토타입 클래스(Prototype Class)
// => 메소드에서 필드 또는 메소드에 접근할 경우 명확하게 인스턴스을 구분하여 필드 또는 
//    메소드에 접근하기 위해 this 필요

//this 매개변수를 사용하는 경우
//1.메소드에서 매개변수와 필드의 이름이 같은 경우 this를 이용하여 필드 표현
// => this가 없으면 매개변수로 처리
//2.생성자에서 다른 생성자를 호출하기 위해 this 사용
// => this로 생성자를 호출하는 명령 전에 다른 명령이 작성될 경우 에러 발생
//3.이벤트 처리 프로그램 또는 다중 스레드 프로그램의 메소드에서 인스턴스를 표현하여 처리

//회원정보(아이디,이름,이메일)를 저장하기 위한 클래스 : VO(Value Object) 클래스
public class Member {
	//필드(Field) 선언
	// => 인스턴스 생성시 필드에 기본값 자동 저장(숫자형:0, 논리형:false, 참조형:null)
	// => 인스턴스 생성시 필드에 저장된 기본값 변경 가능
	private String id="NoId";
	private String name="NoName";
	private String email="NoEmail";

	//생성자(Constructor) 선언
	// => 생성자를 선언하지 않으면 내부적으로 기본 생성자가 제공
	// => 생성자를 하나라도 선언하면 기본 생성자는 미제공

	//생성자(Constructor) - 인스턴스를 생성하기 위한 특별한 메소드
	// => 생성자 작성 규칙 - 반환형이 없으며 메소드명은 반드시 클래스명과 동일하게 작성
	// => 오버로드 선언 가능 : 매개변수가 다른 여러 개의 생성자 선언 가능
	// => 초기화 작업 구현 : 생성 인스턴스의 필드에 원하는 초기값이 저장되도록 명령 작성 
	
	//매개변수가 없는 생성자 - 기본 생성자와 동일한 형태
	// => 일반적으로 초기화 작업을 미구현
	// => 선언하지 않을 경우 상속 관련 문제가 발생 될 수 있으므로 선언하는 것을 권장
	//매개변수가 없는 생성자 자동 완성 : [Ctrl]+[Space] >> Constructor 선택 
	public Member() {
		// TODO Auto-generated constructor stub
		/*
		id="NoId";
		name="NoName";
		email="NoEmail";
		*/
		
		//Member(String,String,String) 생성자를 호출하여 초기화 작업
		//this("NoId","NoName","NoEmail");
	}
	
	//매개변수가 선언된 생성자
	// => 매개변수에 전달된 값을 필드에 저장 - 초기화 작업
	// => 필드에 원하는 값이 저장된 인스턴스를 생성하기 위해 생성자 작성 
	//매개변수가 선언된 생성자 자동 완성 : [Alt]+[Shift]+[S] >> 팝업메뉴 >> [O] >> 생성메뉴 >> 초기화 필드 선택 >> Generate
	public Member(String id) {
		this.id=id;
		//this(id,"NoName","NoEmail");
	}
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
		//this(id,name,"NoEmail");
	}
	
	
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//메소드(Method) 선언
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//필드값을 출력하는 메소드 >> 필드값 확인
	public void display() {
		//System.out.println("아이디 = "+id);
		System.out.println("아이디 = "+this.id);//호출한 인스턴스의 필드가 this에 저장되어있음
		System.out.println("이름 = "+name);
		System.out.println("이메일 = "+email);
	}
}








