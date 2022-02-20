
//계좌 클래스(Account)
//- 계좌번호, 이름, 잔액정보
//- 입금기능(), 출금기능, 출력기능()
class Account {
	// 맴버 필드(데이터 은닉)
	private int accid;
	private String name;
	private int balance;

	// 생성자
	public Account(int accid, String name) {
		this(accid, name, 0);
	}

	public Account(int accid, String name, int balance) {
		this.setAccid(accid); // <------ 권고사항!(이유???)
		this.setName(name);
		this.setBalance(balance);
	}

	// get & set 메서드(필요에 의해서 외부 노출)
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

	// 기능메서드
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
		Account acc = new Account(111, "홍길동", 1000);

		// acc.setBalance(-1); //잔액이 -1원
		System.out.println("잔액정보 : " + acc.getBalance() + "원");

		acc.InputMoney(500);
		System.out.println("잔액정보 : " + acc.getBalance() + "원");

		acc.OutputMoney(1000);
		System.out.println("잔액정보 : " + acc.getBalance() + "원");

		acc.OutputMoney(5000);
		System.out.println("잔액정보 : " + acc.getBalance() + "원");
	}
}
