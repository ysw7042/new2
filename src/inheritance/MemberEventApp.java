package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		//�ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� ������ ��� �θ� Ŭ������ �����ڰ� ���� ȣ��Ǿ� 
		//�θ� �ν��Ͻ��� ���� ���� �ڽ� �ν��Ͻ� �����Ͽ� ��Ӱ��� ����
		// => ������������ �ڽ� �ν��Ͻ� ����
		MemberEvent member1 = new MemberEvent();
		
		//������������ �ڽ� �ν��Ͻ��� ����Ǿ� �����Ƿ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �ڽ� �ν��Ͻ��� �θ� �ν��Ͻ��� ��ӹ޾� ���� �����ϹǷ� �θ� �ν��Ͻ��� �޼ҵ� ȣ�� ���� 
		member1.setId("abc123");
		member1.setName("ȫ�浿");
		member1.setEmail("abc@daum.net");
		
		member1.display();
		System.out.println("===================================================");
		MemberEvent member2 = new MemberEvent("xyz789", "�Ӳ���", "xyz@naver.com");
		member2.display();
		System.out.println("===================================================");
		
	
	}
}
