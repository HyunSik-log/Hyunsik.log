import java.util.Scanner;

//static 사용
//1) 클래스 맴버메서드 : 맴버 함수에 사용
//    - 클래스명으로 사용되는 메서드
//    - 클래스맴버이기 때문에 클래스맴버만 사용가능하다.(this가 제공되지 않는다)

//2) 클래스 맴버 필드 : 맴버 필드에 사용

class Sample5 {
	private int number;

	public static void fun() {

	}

	public void fun1() { // 인스턴스 맴버
		this.number = 10;
	}

	public static int Add(int n1, int n2) {
		fun(); // 클래스맴버호출 가능!
		// fun1(); //인스턴스맴버호출 불가능!
		return n1 + n2;
	}
}

class Sample4 {
	static Scanner scan = new Scanner(System.in);

	public static int InputNumber(String str) {
		System.out.print(str + " : ");
		return Integer.parseInt(scan.nextLine());
	}

	public static String StringNumber(String str) {
		System.out.print(str + " : ");
		return scan.nextLine();
	}
}

class Sample6 {
	public int number; // 인스턴스 맴버
	public static int s_number; // 클래스 맴버
}

public class Start2 {
	public static void main(String[] args) {
		System.out.println(Sample5.Add(10, 20));

		int n1 = Sample4.InputNumber("정수 입력");
		int n2 = Sample4.InputNumber("정수 입력");
		System.out.println(Sample5.Add(n1, n2));

		// ------------------------------------------
		Sample6 s6 = new Sample6();
		System.out.println(s6.number); // 0
		System.out.println(s6.s_number); // 0 클래스맴버를 객체로 호출가능(X)
		System.out.println(Sample6.s_number); // 0 클래스맴버는 클래스로호출권장
	}
}
