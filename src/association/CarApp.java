package association;

public class CarApp {
	public static void main(String[] args) {
		//���� ����
		Engine engine = new Engine();
		//engine.enginedisplay();
		engine.setFualType("����");
		engine.setDisplacement(2000);
		
		//�ڵ��� ����
		Car carOne = new Car();
		//carOne.carDisplay();
		
		carOne.setModelName("Sorento");
		carOne.setProductionYear(2018);
		//�ڵ����� ���� ���� - Setter �޼ҵ带 ȣ���Ͽ� ���� ���� ����
		carOne.setCarEngine(engine);
		
		carOne.carDisplay();
		System.out.println("==============================================================");
		//�ڵ��� ���� - ���� ���� 
		// => �����ڸ� �̿��Ͽ� ���� ���� ���� 
		Car carTwo = new Car("��Ÿ��", 2020, new Engine("�ֹ���", 3000));
		carTwo.carDisplay();
		System.out.println("==============================================================");
		System.out.println(carOne.getModelName()+"�� ���� ���� >> ");
		engine.enginedisplay();
		System.out.println("==============================================================");
		System.out.println(carTwo.getModelName()+"�� ���� ���� >> ");
		//carTwo.getCarEngine() : �����ʵ忡 ����� Engine �ν��Ͻ� ��ȯ
		// => ��ȯ���� ���� ������ �ν��Ͻ��� �̿��Ͽ� �޼ҵ� ȣ��
		carTwo.getCarEngine().enginedisplay();
		System.out.println("==============================================================");
	}
}
