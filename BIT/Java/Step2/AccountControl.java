//AccountControl.java

//Account객체를 소유(has a)
// - 그 객체의 기능을 필요로 하기 때문이다.
public class AccountControl {
	private Account acc = null;

	public void MakeAccount(int accid, String name) {
		if (acc != null) {
			System.out.println("이미 객체가 존재합니다.");
			return;
		}
		acc = new Account(accid, name);
		System.out.println("객체 생성");
	}

	public void MakeAccount(int accid, String name, int balance) {
		if (acc != null) {
			System.out.println("이미 객체가 존재합니다.");
			return;
		}
		acc = new Account(accid, name, balance);
		System.out.println("객체 생성");
	}

	public void DeleteAccount() {
		if (acc == null) {
			System.out.println("객체가 없습니다.");
			return;
		}
		acc = null;
	}

	public void Print() {
		if (acc != null)
			acc.Print();
		else
			System.out.println("객체 생성되기 전");
	}
}
