//static�ɹ��ʵ� Ȱ��2(������ �ν��Ͻ� ���� ����?)

class Star4Sample {
	private static int s_count = 0; // ��ü�� ����

	// ������
	public Star4Sample() {
		s_count++;
		System.out.println(s_count + "��° ��ü�� �����Ǿ����ϴ�.");
	}
}

public class Start4 {
	public static void main(String[] args) {
		// Star4Sample ��ü 1���� ����
		Star4Sample s1 = new Star4Sample();

		// Star4Sample ��ü�� ���� 5���� ������� ����
		Star4Sample[] s2 = new Star4Sample[5];

		// �迭�� 0��° ���� ���� : Star4Sample��ü�� 1�� ����
		s2[0] = new Star4Sample();
	}
}
