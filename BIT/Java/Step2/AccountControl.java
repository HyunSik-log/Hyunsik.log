//AccountControl.java

//Account��ü�� ����(has a)
// - �� ��ü�� ����� �ʿ�� �ϱ� �����̴�.
public class AccountControl {
	private Account acc = null;

	public void MakeAccount(int accid, String name) {
		if (acc != null) {
			System.out.println("�̹� ��ü�� �����մϴ�.");
			return;
		}
		acc = new Account(accid, name);
		System.out.println("��ü ����");
	}

	public void MakeAccount(int accid, String name, int balance) {
		if (acc != null) {
			System.out.println("�̹� ��ü�� �����մϴ�.");
			return;
		}
		acc = new Account(accid, name, balance);
		System.out.println("��ü ����");
	}

	public void DeleteAccount() {
		if (acc == null) {
			System.out.println("��ü�� �����ϴ�.");
			return;
		}
		acc = null;
	}

	public void Print() {
		if (acc != null)
			acc.Print();
		else
			System.out.println("��ü �����Ǳ� ��");
	}
}
