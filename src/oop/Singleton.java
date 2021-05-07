package oop;

//�̱��� ������ ������ �����Ͽ� �ۼ��� Ŭ���� : �̱��� Ŭ����(Singleton Class) 
// => ���α׷��� �ν��Ͻ��� �ϳ��� �����ϱ� ���� Ŭ����
public class Singleton {
	//Ŭ������ �ν��Ͻ� ������ �����ϱ� ���� �ʵ� ���� 
	// => static �����ڸ� �̿��Ͽ� ���� �ʵ�� ���� 
	//�ý��� �ʵ� : Ŭ���� ���ο����� ���� ���� �����ϱ� ���� �ʵ� 
	// => Getter & Setter �޼ҵ� �̼��� 
	// => �ʵ��� �̸��� _�� ���۵ǵ��� �����ϴ� ���� ����
	//private  static Singleton _instance=new Singleton(); 
	private  static Singleton _instance; 
	
	//�����ڸ� ����ȭ ���� - Ŭ������ �ܺο��� �ν��Ͻ� ���� �Ұ��� 
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	//��������(Static Block) : Ŭ������ �޸�(Static)�� ����� �� �ڵ� ����� �����
	//�ۼ��ϴ� ���� - ���α׷��� �ѹ��� ���� 
	// => ���� �ʵ� �Ǵ� ���� �޼ҵ常 ��� ���� 
	//Ŭ������ �ν��Ͻ��� �����Ͽ� �ý��� �ʵ�(�����ʵ�)�� ����
	static {
		_instance=new Singleton();
	}
	
	//�ý��� �ʵ忡 ����� �ν��Ͻ��� ��ȯ�ϴ� ���� �޼ҵ� ����
	// => �޼ҵ带 ȣ���Ͽ� �ý��� �ʵ忡 ����� �ν��Ͻ� �����޾� ��� ����
	public static Singleton getInstance() {
		return _instance;
	}
	
	public void display() {
		System.out.println("Singleton Ŭ������ display() �޼ҵ� ȣ��");
	}
}
