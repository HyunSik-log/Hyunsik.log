//Account.java

public class Account {
	// �ɹ� �ʵ�(������ ����)
	private int accid;
	private String name;
	private int balance;

	// ������
	public Account(int accid, String name) {
		this(accid, name, 0);
	}

	public Account(int accid, String name, int balance) {
		this.setAccid(accid); // <------ �ǰ����!(����???)
		this.setName(name);
		this.setBalance(balance);
	}

	// get & set �޼���(�ʿ信 ���ؼ� �ܺ� ����)
	public int getAccid() {
		return accid;
	}

	private void setAccid(int accid) {
		this.accid = accid;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
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
	public void InputMoney(int money) {
		if (money <= 0)
			return;
		balance = balance + money;
	}

	public void OutputMoney(int money) {
		if (money <= 0)
			return;

		if (balance < money)
			return;

		balance = balance - money;
	}

	public void Print() {
		System.out.println(accid + ", " + name + ", " + balance);
	}
}
