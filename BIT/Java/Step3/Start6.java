//final
//�ڹپ����� final�� �� �ѹ� �ʱ�ȭ�� �����ϴ�.
//(�ʱ�ȭ : ���� ���� �� ���� ���� ����)
/*
1) ����� ���ÿ� �ʱ�ȭ
   int num = 10;

2) ����� ������ ���Կ����� ���� �ʱ�ȭ
   int num;
   num = 10; //�ʱ�ȭ
*/

class Start6Sample {
	// �ν��Ͻ� �ɹ�
	int number; // �ɹ� �ʵ�, �ɹ� ����
	final int F_NUMBER; // �ɹ� �ʵ�, �ɹ� ���(Ŭ���� ������ ����� ����)

	final int F_NUMBER1 = 10; // ��� ��ü�� ������ ����� ������.(������ ��???)
	static final int F_NUMBER2 = 10; // �� �ڵ庸�ٴ� ������ ����...

	public Start6Sample(int n, int n1) {
		number = n;
		F_NUMBER = n1;
	}

	void Print() {
		number = 2;
		// F_NUMBER = 2; //���� �Ұ�
		System.out.println(number + ", " + F_NUMBER);
	}

	public void fun() {
		final int F_NUMBER1; // ���� ���(�޼��� ���ο� ����� ����)

		F_NUMBER1 = 10; // �ʱ�ȭ ����
		// F_NUMBER1 = 20; //���� ����(����)

		System.out.println(F_NUMBER1);
	}
}

public class Start6 {
	public static void main(String[] args) {
		Start6Sample s1 = new Start6Sample(10, 20);
		s1.Print();

		s1.fun();
	}
}
