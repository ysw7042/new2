package oop;

//������(Modifier) : Ŭ����, �ʵ�, �޼ҵ� ����� Ư���� ����� �����ϱ� ���� Ű����
// => ���� ������(private, package, protected, public)
// => static, final, abstract

//static : �ν��Ͻ��� ������� Ŭ������ �����ϱ� ���� �ʵ�, �޼ҵ带 ������ �� ����ϴ� ������
// => Ư���� ��� Ŭ������ ���� ����

//�л�����(�й�,�̸�,����,����,����)�� �����ϱ� ���� Ŭ����
public class Student {
	//�ν��Ͻ� �ʵ�(Instance Field) : �ν��Ͻ� ������ ��������� �ʵ�
	// => �ν��Ͻ��� �����Ͽ� ��� 
	private int num;
	private String name;
	private int kor, eng, tot;
	
	//���� �ʵ�(Static Field) : Ŭ���� ���� ��������� �ʵ�
	// => �ν��Ͻ��� ������ ������� ������ �ϳ��� �����Ǵ� �ʵ�
	// => �����ڿ��� �ʱ�ȭ���� �ʰ� �ʵ� ����� ���� �ʱ�ȭ
	// => ��� �ν��Ͻ����� ��� ���� : ���� - �޸� ���� �� �ʵ尪 ���� ����
	// => Ŭ������ �����Ͽ� ���
	private static int total=0;
	
	//������(Constructor) : �ν��Ͻ��� ����� �ִ� Ư���� �޼ҵ�
	// => �ν��Ͻ� �ʵ忡 �⺻���� �ƴ� �ʱⰪ�� �����ϱ� ���� ����
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//������ ����Ͽ� �����ϴ� ��� - �޼ҵ� ȣ��
		// => �ڵ��� �ߺ��� �ּ�ȭ�Ͽ� ���������� ȿ���� ����
		//tot=kor+eng;
		calcTot();
	}

	//�ν��Ͻ� �޼ҵ�(Instance Method) : this �Ű������� �ִ� �޼ҵ�
	// => this�� �̿��Ͽ� �ν��Ͻ� �ʵ忡 �����Ͽ� ��� ����
	// => Ŭ������ �̿��Ͽ� ���� �ʵ忡 �����Ͽ� ��� ����
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		calcTot();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calcTot();
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	//���� �޼ҵ�(Static Method) : this �Ű������� ���� �޼ҵ�
	// => this �Ű������� �����Ƿ� �ν��Ͻ� �ʵ忡�� ���� �Ұ���
	// => ���� �ʵ�� �����Ͽ� ��� ����
	// => Ŭ������ �̿��Ͽ� ���� �޼ҵ� ȣ�� ���� : ���� ���� �޼ҵ� ȣ��
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Student.total = total;
	}
	
	//������ ����ϴ� �޼ҵ�
	/*
	public void calcTot() {
		tot=kor+eng;
	}
	*/

	//�ý��� �޼ҵ� : Ŭ���� ���ο����� ȣ��Ǵ� �޼ҵ�
	private void calcTot() {
		tot=kor+eng;
	}
	
	//�ʵ尪�� ����ϴ� �޼ҵ� - �ʵ尪 Ȯ��
	public void display() {
		System.out.print(name+"["+num+"]�� ���� >> ");
		System.out.println("���� = "+kor+", ���� = "+eng+", ���� = "+tot);
	}
}











