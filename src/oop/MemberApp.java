package oop;

public class MemberApp {
	public static void main(String[] args) {
		//new �����ڷ� �⺻ ������(�Ű������� ���� ������)�� ȣ���Ͽ� �ν��Ͻ� ����
		// => new �����ڰ� ����� �����ڰ� ���� ��� ���� �߻� - �ν��Ͻ� ���� �Ұ���
		// => �ν��Ͻ��� �ʵ忡�� �⺻���� �ڵ� ����
		Member member1=new Member();//�����ڴ� new �����ڷθ� �ҷ��ü� �ִ�. ex)new Member 
		
		//Getter �޼ҵ带 ȣ���Ͽ� �ν��Ͻ��� �ʵ尪�� ��ȯ�޾� ���
		System.out.println("���̵� = "+member1.getId());
		System.out.println("�̸� = "+member1.getName());
		System.out.println("�̸��� = "+member1.getEmail());
		System.out.println("==========================================================");
		//Setter �޼ҵ带 ȣ���Ͽ� �Ű������� ���޵� ���� �̿��Ͽ� �ν��Ͻ��� �ʵ尪 ����
		member1.setId("aaa");
		member1.setName("ȫ�浿");
		member1.setEmail("aaa@daum.net");
		
		/*
		System.out.println("���̵� = "+member1.getId());
		System.out.println("�̸� = "+member1.getName());
		System.out.println("�̸��� = "+member1.getEmail());
		*/
		member1.display();
		System.out.println("==========================================================");
		//�����ڰ� ����� �Ű������� �̿��Ͽ� �ν��Ͻ� ����
		// => �Ű������� ���޵� ���� �ʵ忡 ����
		Member member2=new Member("bbb");
		member2.display();
		System.out.println("==========================================================");
		Member member3=new Member("ccc", "�Ӳ���");
		member3.display();
		System.out.println("==========================================================");
		Member member4=new Member("ddd", "����ġ", "ddd@naver.com");
		member4.display();
		System.out.println("==========================================================");
	}
}
