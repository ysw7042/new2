package inheritance;

//ȸ������(���̵�,�̸�)�� �����ϱ� ���� Ŭ���� 
public class Member {
	private String id;
	private String name;
	
	//[Ctral]+[Space] >> Constructor ����(����)
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//[Alt]+[Shift]+[S] >> [O] >> �ʵ� ���� >> Generate
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//[Alt]+[Shift]+[S] >> [R] >> �ʵ� ���� >> Generate
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
		System.out.println("���̵� = "+id);
		System.out.println("�̸� = "+name);
	}
}
