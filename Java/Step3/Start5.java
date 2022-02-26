//static�ɹ��ʵ� Ȱ��3(�̱��� ����)
/*
   "Gof�� ������ ����" : � ����� Ŭ������ ����� ���� �� ��� ����� �ɱ�?
   
    ��) �̱��� ���� : �ϳ��� ��ü�� ���� ������ Ŭ������ �����ϰ� �ʹ�
       1) �����ڸ� �����Ѵ�.
       2) Ŭ���� ���ο��� �Ѱ� �����ؼ� static �ɹ��ʵ忡 ����
       3) static�ż���� static�ɹ� �ʵ� �ܺο� ����
*/
class SingletonClass {
	// ----------------------- �̱��� ���� �ڵ� ------------------------
	private static SingletonClass instance = null;

	private SingletonClass() {
	}

	public static SingletonClass GetInstance() {
		if (instance == null)
			instance = new SingletonClass();
		return instance;
	}
	// ---------------------- �̱��� ���� �ڵ� ------------------------

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

		s3.SetData("ȫ�浿", 29);
		s4.Print();
	}
}
