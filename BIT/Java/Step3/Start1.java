//��ü(�ɹ��ʵ�) �ʱ�ȭ ���

class Sample3 {
	// 1) �ɹ� �ʵ� ������ ��ġ���� �ʱ�ȭ(��� ��ü���� ������ ������ �ʱ�ȭ �ȴ�.)
	public int number = 10;
	public String str = "���ڿ�";

	// (*)Ŭ�����ɹ� �ʱ�ȭ ����(Ŭ�����ɹ� �ʱ�ȭ, ������ ������ �ʿ��� ��)
	// ���� ���� ����(Ŭ������ � �ɹ��� ȣ���ϵ� �� ������)
	// �ѹ��� ����
	static {
		System.out.println("Ŭ�����ɹ� �ʱ�ȭ ����");
	}

	// 2)�ν��Ͻ� �ʱ�ȭ ����(�ν��Ͻ� ������ ȣ��) : ������ ������ �ʿ��� ��
	{
		number = 20;
		str = "�ν��Ͻ� �ʱ�ȭ����";
		System.out.println("�ν��Ͻ� �ʱ�ȭ ����");
	}

	// 3)������(���� ���� ���, ��� ��ü���� ���δٸ� ������ �ʱ�ȭ ����)
	public Sample3(int number, String str) {
		this.number = number;
		this.str = str;
		System.out.println("������");
	}
}

public class Start1 {
	public static void main(String[] args) {
		Sample3 s1 = new Sample3(100, "������");
		System.out.println(s1.number + ", " + s1.str);

		Sample3 s2 = new Sample3(200, "������ȣ��");
		System.out.println(s2.number + ", " + s2.str);
	}
}
