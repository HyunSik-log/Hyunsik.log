import java.util.Scanner;

//소유(has a) : UML (클래스 관계)
/*
 * [사람]이 [펜]을 가지고 글을 쓴다. 
 *   - 사람이 펜을 소유하게 된다.(펜이 갖고 있는 기능을 사용하기 위함)
*/

class Pen {
	private String color;
	private int width;

	public Pen(String color, int width) {
		this.color = color;
		this.width = width;
	}

	public void Write(String str) {
		System.out.printf("[%s:%d] %s\n", color, width, str);
	}
}

//Pen을 일시적으로 소유 관계 패턴
class Person1 {
	private Scanner scan = new Scanner(System.in);
	private Pen pen = null;

	public void PenUp(Pen pen) {
		this.pen = pen;
	}

	public void Write() {
		System.out.print(">> ");
		String str = scan.nextLine();

		if (pen != null)
			pen.Write(str);
	}

	public void PenDown() {
		pen = null;
	}
}

//생과 사를 같이 하는 소유
//객체 생성 시 소유객체가 먼저 만들어짐(생성자)
class Person2 {
	private Scanner scan = new Scanner(System.in);
	private Pen pen = null;

	Person2(String color, int width) {
		pen = new Pen(color, width);
	}

	public void Write() {
		System.out.print(">> ");
		String str = scan.nextLine();

		if (pen != null)
			pen.Write(str);
	}

	public void ChangPen(Pen pen) {
		this.pen = pen;
	}
}

public class Start7 {
	public static void main(String[] args) {
		Pen redpen = new Pen("빨강", 1);
		Pen greenpen = new Pen("녹색", 2);

		Person1 p1 = new Person1();
		p1.PenUp(redpen);
		p1.Write();
		p1.PenDown();

		p1.PenUp(greenpen);
		p1.Write();
		p1.PenDown();
		// ---------------------------------------------------
		Person2 p2 = new Person2("빨강", 1);
		p2.Write();
		p2.ChangPen(new Pen("녹색", 2));
		p2.Write();
	}
}
