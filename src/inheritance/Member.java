package inheritance;

//회원정보(아이디,이름)를 저장하기 위한 클래스 
public class Member {
	private String id;
	private String name;
	
	//[Ctral]+[Space] >> Constructor 선택(엔터)
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//[Alt]+[Shift]+[S] >> [O] >> 필드 선택 >> Generate
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//[Alt]+[Shift]+[S] >> [R] >> 필드 선택 >> Generate
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
	

	public void display() {
		System.out.println("아이디 = "+id);
		System.out.println("이름 = "+name);
	}
}
