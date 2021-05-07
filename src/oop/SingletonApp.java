package oop;

public class SingletonApp {
	public static void main(String[] args) {
		/*
		//new �����ڰ� �����ڸ� �ҷ��� �ν��Ͻ��� �����Ͽ� ���������� ���� 
		// => ���������� �̿��Ͽ� �ν��Ͻ��� �޼ҵ� ȣ�� 
		// => �ν��Ͻ��� �޼ҵ带 ���������� ȣ���ϰ��� �� ��� ���
		Singleton singleton = new Singleton();
		singleton.display();
		
		//new �����ڰ� �����ڸ� �ҷ��� �ν��Ͻ��� �����ϰ� �޼ҵ带 ���� ȣ��
		// => �ν��Ͻ� ���� �� �޼ҵ带 �ϳ��� ȣ���� ��� ��� 
		new Singleton().display(); //���������� �̿��Ͽ� �ν��Ͻ��� �ٷ� ȣ��(������ ���� �Ұ���) 
		*/
		
		/*
		//new �����ڷ� ������ �ν��Ͻ��� ���� �ٸ� �ν��Ͻ�
		// => �Ϲ����� Ŭ������ �ν��Ͻ��� ���� �� ���� ���� 
		Singleton singleton1= new Singleton();
		Singleton singleton2= new Singleton();//���������� ����� �ν��Ͻ��� �ٸ���.
		
		System.out.println("singleton1 = "+singleton1);
		System.out.println("singleton2 = "+singleton2);
		
		singleton1.display();
		singleton2.display();
		*/
		
		//�̱��� Ŭ�������� �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ带 ȣ���Ͽ� �ν��Ͻ� ��ȯ�޾� ���� 
		// => Ŭ������ �޸𸮿� ����� �� �̸� ������ �ν��Ͻ� ��ȯ - ���� �ν��Ͻ� ��ȯ
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println("singleton1 = "+singleton1);
		System.out.println("singleton2 = "+singleton2);	
		System.out.println("==================================================================");
		singleton1.display();
		singleton2.display();
		System.out.println("==================================================================");
		//�̱��� Ŭ������ �������� ���� �ν��Ͻ��� ��ȯ�޾� ���� �޼ҵ� ȣ���Ͽ� ���
		Singleton.getInstance().display();
		Singleton.getInstance().display();
		System.out.println("==================================================================");
	}
}
