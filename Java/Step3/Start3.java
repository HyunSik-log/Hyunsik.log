//static맴버 필드 활용예1(클래스 정의과정에서 공유 데이터가 필요한 경우)

class Card {
	private String number; // 1~10, J,Q,K
	private char shape; // D, H, S, C
	private static int width = 100;
	private static int height = 200;

	static {
		width = 100;
		height = 200;
	}

	// 인스턴스 맴버 초기화
	public Card(String number, char shape) {
		this.number = number;
		this.shape = shape;
	}

	// 클래스맴버(클래스 맴버만 접근 가능)
	public static void ChangeSize(int w, int h) {
		width = w;
		height = h;
	}

	// 출력
	// 인스턴스 메서드(모든 맴버 접근이 가능)
	public void Print() {
		System.out.println(number + "," + shape + "," + width + "," + height);
	}
}

public class Start3 {
	public static void main(String[] args) {

		Card.ChangeSize(10, 20);

		Card c1 = new Card("1", 'D'); // 2개의 저장공간 생성
		Card c2 = new Card("1", 'H'); // 2개의 저장공간 생성

		c1.Print();
		c2.Print();

		Card.ChangeSize(100, 200);
		c1.Print();
		c2.Print();
	}
}
