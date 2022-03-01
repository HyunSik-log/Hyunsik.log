//static�ɹ� �ʵ� Ȱ�뿹1(Ŭ���� ���ǰ������� ���� �����Ͱ� �ʿ��� ���)

class Card {
	private String number; // 1~10, J,Q,K
	private char shape; // D, H, S, C
	private static int width = 100;
	private static int height = 200;

	static {
		width = 100;
		height = 200;
	}

	// �ν��Ͻ� �ɹ� �ʱ�ȭ
	public Card(String number, char shape) {
		this.number = number;
		this.shape = shape;
	}

	// Ŭ�����ɹ�(Ŭ���� �ɹ��� ���� ����)
	public static void ChangeSize(int w, int h) {
		width = w;
		height = h;
	}

	// ���
	// �ν��Ͻ� �޼���(��� �ɹ� ������ ����)
	public void Print() {
		System.out.println(number + "," + shape + "," + width + "," + height);
	}
}

public class Start3 {
	public static void main(String[] args) {

		Card.ChangeSize(10, 20);

		Card c1 = new Card("1", 'D'); // 2���� ������� ����
		Card c2 = new Card("1", 'H'); // 2���� ������� ����

		c1.Print();
		c2.Print();

		Card.ChangeSize(100, 200);
		c1.Print();
		c2.Print();
	}
}
