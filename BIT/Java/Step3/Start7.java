import java.util.Scanner;

//����(has a) : UML (Ŭ���� ����)
/*
 * [���]�� [��]�� ������ ���� ����. 
 *   - ����� ���� �����ϰ� �ȴ�.(���� ���� �ִ� ����� ����ϱ� ����)
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

//Pen�� �Ͻ������� ���� ���� ����
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

//���� �縦 ���� �ϴ� ����
//��ü ���� �� ������ü�� ���� �������(������)
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
		Pen redpen = new Pen("����", 1);
		Pen greenpen = new Pen("���", 2);

		Person1 p1 = new Person1();
		p1.PenUp(redpen);
		p1.Write();
		p1.PenDown();

		p1.PenUp(greenpen);
		p1.Write();
		p1.PenDown();
		// ---------------------------------------------------
		Person2 p2 = new Person2("����", 1);
		p2.Write();
		p2.ChangPen(new Pen("���", 2));
		p2.Write();
	}
}
