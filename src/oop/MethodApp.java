package oop;

//������ ������ Ŭ���� - ���α׷� : ���ø����̼�(Application)
// => ����ũž ���ø����̼��� �ݵ�� main() �޼ҵ� ����
public class MethodApp {
	//JVM�� ���� �ڵ� ȣ��Ǵ� �޼ҵ�
	public static void main(String[] args) {
		//��ü(�ν��Ͻ�:Instance)�� �����Ͽ� ���������� ����
		//����) (��Ű����.)Ŭ������ ��������=new Ŭ������();
		// => ���� ��Ű���� Ŭ������ ��Ű�� ǥ�� ���� Ŭ������ ǥ���Ͽ� ��� ���� 
		// => new Ŭ������() : new �����ڷ� Ŭ������ ������(Constructor)�� ȣ���Ͽ� ��ü ����
		// => Ŭ������ �������� : Ŭ������ ������ ��ü�� ������ �����ϱ� ���� �������� ����
		// => ���������� �̿��Ͽ� ����� ��ü�� �ʵ� �Ǵ� �޼ҵ忡 �����Ͽ� ���
		Method method=new Method();
		System.out.println("method = "+method);
		System.out.println("=========================================================");
		//�޼ҵ� ȣ�� ����) ��������.�޼ҵ��(��,��,...)
		// => ���������� ����� ��ü(�ν��Ͻ�)�� �޼ҵ� ȣ��
		//�޼ҵ�� �޼ҵ��� �Ű������� ���޵� ���� ���� ȣ��
		// => �޼ҵ�� �Ǵ� �Ű������� ���� �߸� ���޵� ��� �޼ҵ� ȣ�� �Ұ���
		//�޼ҵ带 ȣ���ϸ� ������(���α׷��� �帧)�� �޼ҵ�� �̵��Ͽ� �޼ҵ��� ��� ���� �� ��ȯ
		method.displayOne(); 
		method.displayTwo();
		method.displayOne();
		System.out.println("=========================================================");
		method.printOne(); //�޼ҵ�� �ݺ������� ����� �����ϴ�.
		method.printOne();
		System.out.println("=========================================================");
		//�޼ҵ��� �Ű������� �������� ���� ���޵Ǿ߸� �޼ҵ� ȣ�� ���� 
		method.printTwo(50);
		method.printTwo(80);
		
		method.printTwo(-30);
		System.out.println("=========================================================");
		method.printThree(55, 80);	
		method.printThree(2, 49);
		
		method.printThree(77, 33);
		System.out.println("=========================================================");
		//�޼ҵ� ȣ��� ��ȯ�Ǵ� ������� ������ ����
		// => ��ȯ�Ǵ� ������� ���������� ����ϰ��� �� ��� ������ ����
		int total=method.returnTot(36, 79);
		//�Է� �� ��� ����� ���α׷����� �ۼ� - �޼ҵ忡���� ����� ��� ���ۼ�
		System.out.println("�޼ҵ� ȣ�� ��� = "+total);
		
		//�޼ҵ� ȣ��� ��ȯ�Ǵ� ����� ��� - ��ȯ�� �Ͻ��� ���
		System.out.println("�հ� = "+method.returnTot(36, 79));
		System.out.println("=========================================================");
		boolean result=method.isOddEven(10);
		if(result) {//result �������� true�� ���
			System.out.println("�Ű������� ���޵� ���� [¦��]�Դϴ�.");
		} else {
			System.out.println("�Ű������� ���޵� ���� [Ȧ��]�Դϴ�.");
		}
		
		//if ������ ���ǽ� ��� ������ ��ȯ�ϴ� �޼ҵ� ȣ�� ���� , ������ ���� ������ �ʴ´�.
		if(method.isOddEven(11)) {//�޼ҵ� ��ȯ���� true�� ���
			System.out.println("�Ű������� ���޵� ���� [¦��]�Դϴ�.");
		} else {
			System.out.println("�Ű������� ���޵� ���� [Ȧ��]�Դϴ�.");
		}
		System.out.println("=========================================================");
		String nameResult=method.nameHello("ȫ�浿");
		System.out.println(nameResult);
		System.out.println(method.nameHello("�Ӳ���"));
		System.out.println("=========================================================");
		//�޼ҵ� ȣ���Ͽ� ��ȯ�� �迭�� �������� ����
		int [] num=method.returnArray();
		System.out.print("��ȯ�� ��Ұ� >> ");
		for(int temp:num) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("=========================================================");
		System.out.println("�հ� = "+method.sumOne(10, 20, 30));
		//�޼ҵ��� �Ű������� ���� ���������� ���޵��� ���� ��� �޼ҵ� ȣ�� ���� �߻�
		//System.out.println("�հ� = "+method.sumOne(10, 20, 30,40,50));
		System.out.println("=========================================================");
		//System.out.println("�հ� ="+method.sumTwo({10,20,30})); //���� (�迭�� �ƴ�)
		System.out.println("�հ� = "+method.sumTwo(new int[] {10,20,30}));
		System.out.println("�հ� = "+method.sumTwo(new int[] {10,20,30,40,50}));
		System.out.println("=========================================================");
		System.out.println("�հ� = "+method.sumThree());
		System.out.println("�հ� = "+method.sumThree(10,20,30));
		System.out.println("�հ� = "+method.sumThree(10,20,30,40,50));
		System.out.println("=========================================================");
	}
}











