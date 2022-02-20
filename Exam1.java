import java.util.Scanner;

// static 맴버는 static맴버만 사용가능하다.
// 1) static      : 클래스 맴버
// 2) NON static  : 인스턴스 맴버 
public class Exam1 {

	// hello, world
	public static void Example1() {
		System.out.println("Hello, World!");
	}

	// 기본 출력 함수
	// out : 출력 객체
	// 1) print : 기본형타입과 Object, String 타입을 인자로 갖는 오버로딩 구조.
	// 오버로딩(Overloading) : 함수의 이름은 같고, 매개변수가 다른 함수들의 관계
	// 개행없이 원하는 타입을 출력하는 용도!
	public static void Example2() {
		System.out.print(10);
		System.out.print('A');
	}

	// 2) println
	// 개행처리가 된다.
	public static void Example3() {
		System.out.println(10);
		System.out.println('A');
	}

	// 3) printf : C언어에서 제공되는 printf와 사용방법 동일!
	// 오버로딩 구조가 아니다.
	// 서식을 이용해서 다양한 타입을 출력
	// "%d" : 정수타입, "%c" : 문자 타입, "%f" : 실수 타입, "%s: : 문자열 타입
	public static void Example4() {
		System.out.printf("%d, %c, %f, %s\n", 10, 'A', 10.1f, "문자열");
	}

	// 입력객체
	// System.in.
	// 입력보조객체 : Scanner
	public static void Example5() {
		// java.util.Scanner scan;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("나이 : ");
		String temp = scan.nextLine(); // "10"
		int age = Integer.parseInt(temp);

		System.out.print("몸무게 : "); // "10.1"
		float weight = Float.parseFloat(scan.nextLine());

		System.out.print("성별(남 or 여) : "); // "남"
		char gender = scan.nextLine().charAt(0);

		System.out.printf("%s, %d, %.1f, %c\n", name, age, weight, gender);
	}

	public static void main(String[] args) {
		Example5();
	}
}
