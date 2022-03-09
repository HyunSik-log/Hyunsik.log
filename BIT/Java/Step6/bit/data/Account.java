package bit.data;

public class Account {
	private static int s_accid = 1000;

	private final int ACCID;
	private final String NAME;
	private int balance;

	// ������
	public Account(String name) {
		this(name, 0);
	}

	public Account(String name, int balance) {
		ACCID = s_accid;
		NAME = name;
		this.setBalance(balance);

		s_accid = s_accid + 10;
	}

	// get & set �޼���(�ʿ信 ���ؼ� �ܺ� ����)
	public int getAccid() {
		return ACCID;
	}

	public String getName() {
		return NAME;
	}

	public int getBalance() {
		return balance;
	}

	private void setBalance(int balance) {
		if (balance < 0)
			return;

		this.balance = balance;
	}

	// ��ɸ޼���
	// throws Exception : ���ܸ�(�� �Լ��� Exception ��ü�� ������ �Լ���)
	public void InputMoney(int money) throws Exception {
		if (money <= 0)
			throw new Exception("�߸��� �ݾ��Դϴ�."); // ���ܹ߻�
		balance = balance + money;
	}

	public void OutputMoney(int money) throws Exception {
		if (money <= 0)
			throw new Exception("�߸��� �ݾ��Դϴ�."); // ���ܹ߻�

		if (balance < money)
			throw new Exception("�ܾ��� �����մϴ�.");

		balance = balance - money;
	}

	public void Print() {
		System.out.print(ACCID + ", " + NAME + ", " + balance);
	}

	public void Println() {
		System.out.println("[���¹�ȣ] " + ACCID);
		System.out.println("[�̸�] " + NAME);
		System.out.println("[�ܾ�] " + balance);
	}
}
