
//���� Ŭ����(Account)
//- ���¹�ȣ, �̸�, �ܾ�����
//- �Աݱ��(), ��ݱ��, ��±��()
class Account {
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

}

public class Exam5 {

	public static void main(String[] args) {
		Account acc = new Account(111, "ȫ�浿", 1000);

		// acc.setBalance(-1); //�ܾ��� -1��
		System.out.println("�ܾ����� : " + acc.getBalance() + "��");

		acc.InputMoney(500);
		System.out.println("�ܾ����� : " + acc.getBalance() + "��");

		acc.OutputMoney(1000);
		System.out.println("�ܾ����� : " + acc.getBalance() + "��");

		acc.OutputMoney(5000);
		System.out.println("�ܾ����� : " + acc.getBalance() + "��");
	}
}
