//static맴버필드 활용3(싱글톤 패턴)
/*
   "Gof의 디자인 패턴" : 어떤 기능의 클래스를 만들고 싶을 때 어떻게 만들면 될까?
   
    예) 싱글톤 패턴 : 하나의 객체만 생성 가능한 클래스를 정의하고 싶다
       1) 생성자를 은닉한다.
       2) 클래스 내부에서 한개 생성해서 static 맴버필드에 저장
       3) static매서드로 static맴버 필드 외부에 제공
*/
class SingletonClass {
	// ----------------------- 싱글톤 패턴 코드 ------------------------
	private static SingletonClass instance = null;

	private SingletonClass() {
	}

	public static SingletonClass GetInstance() {
		if (instance == null)
			instance = new SingletonClass();
		return instance;
	}
	// ---------------------- 싱글톤 패턴 코드 ------------------------

	private String name;
	private int age;

	public void SetData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void Print() {
		System.out.println(name + ", " + age);
	}
}

public class Start5 {
	public static void main(String[] args) {
		// SingletonClass s1 = new SingletonClass();
		// SingletonClass s2 = new SingletonClass();
		SingletonClass s3 = SingletonClass.GetInstance();
		SingletonClass s4 = SingletonClass.GetInstance();

		s3.SetData("홍길동", 29);
		s4.Print();
	}
}
