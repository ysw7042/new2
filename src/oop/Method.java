package oop;

//������ ������ Ŭ���� - �ν��Ͻ�(��ü) ������ ���� Ŭ����
public class Method {
	//Ŭ������ �����ϸ� Ŭ���� ���ο��� �Ű������� ���� ������(Default Constructor)�� 
	//����� ������ ó��
	
	//�޼ҵ� ����
	void displayOne() {
		System.out.println("Method Ŭ������ displayOne() �޼ҵ� ȣ��");
	}
	
	void displayTwo() {
		System.out.println("Method Ŭ������ displayTwo() �޼ҵ� ȣ��");
	}
	
	void printOne() {
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 ������ �������� �հ� = "+tot);
	}
	
	//�޼ҵ� ȣ��� ���ް��� �Ű������� ����Ǹ� �޼ҵ忡�� ��� ����
	void printTwo(int num) {
		//�Ű������� ���޵Ǿ� ����� ���� ���� ��ȿ�� �˻�
		if(num<=0) {//���������� ���� �Ű������� ���޵� ���
			System.out.println("[����]�Ű��������� 0���� ū ���� ���޵Ǿ�� �˴ϴ�.");
			return;//�޼ҵ� ���� ����
		}
		
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+" ������ �������� �հ� = "+tot);
	}
	
	void printThree(int num1, int num2) {
		/*
		if(num1>num2) {
			System.out.println("[����]ù��° �Ű������� ���޵� ���� �ι�° �Ű������� ���޵� ������ �۾ƾ� �˴ϴ�.");
			return;
		}
		*/
		
		if(num1>num2) {//ġȯ
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;//tot=tot+i
		}
		System.out.println(num1+"~"+num2+" ������ �������� �հ� = "+tot);
	}
	
	//�޼ҵ� ȣ��� �������� ��ȯ�ϴ� �޼ҵ�
	int returnTot(int num1, int num2) {
		if(num1>num2) {//ġȯ
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		
		//������ ����� ���� �޼ҵ� ����� ��ȯ
		// => �޼ҵ��� ��ȯ���� ���� �ڷ����� ���� ��ȯ
		return tot;
	}
	
	//�Ű������� ���޵� �������� Ȧ���� ��� false, ¦���� ��� true�� ��ȯ�ϴ� �޼ҵ�
	boolean isOddEven(int num) {
		if(num%2!=0) {
			return false;
		}
		return true;
	}
	
	//�Ű������� ��ü�� ���޹ްų� ��ü ��ȯ ���� 
	String nameHello(String name) {
		return name+"��, �ȳ��ϼ���.";
	}
	
	//�迭�� ��ȯ�ϴ� �޼ҵ� - �迭�� ��� ��Ұ��� ��ȯ�� �� �ִ�.
	int[] returnArray(){
		/*
		int[] array= {10,20,30,40,50};
		return array;
		*/
		
		return new int[]{10,20,30,40,50}; //�迭�� �ƴ϶� ���� ������ ��
		
		
	}
		//3���� �Ű������� �������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	int sumOne(int num1, int num2, int num3) {
			return num1+num2+num3;
	}
	
	//�Ű������� �迭�� ���޹޾� �迭 ��Ұ��� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	int sumTwo(int[] num) {//�迭�� ����� ������ ������ ���� �ʴ�.
		int tot=0;
		for(int temp:num) {
			tot+=temp;
		}
		return tot;
	}
	
	//�Ű����� ���� ��ȣ(...)�� ����� �Ű������� ������ ��� ���� 0�� �̻� ���޹޾� 
	//�迭 �������� ��� ����
	int sumThree(int...num) {//���� 0�� �̻� ���ϴ� ���� ��ŭ ������ �� �ִ�.
		int tot=0;
		for(int temp:num) {
			tot+=temp;
		}
		return tot;
	}
}













