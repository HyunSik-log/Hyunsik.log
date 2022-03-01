package bit;

import bit.lib.BitGlobal;

public class AccountControl {
	// 싱글톤--------------------------------------------------
	private AccountControl() {
		int max = BitGlobal.InputInteger("저장 개수");

		// max개를 저장할 수 있는 저장객체 생성
		arr = new MyArr(max);
	}

	private static AccountControl instance = null;

	public static AccountControl GetInstance() {
		if (instance == null)
			instance = new AccountControl();
		return instance;
	}
	// --------------------------------------------------------

	// 저장객체 소유
	private MyArr arr;

	// 전체 출력
	public void PrintAll() {
		System.out.println("-----------------------------------------");
		System.out.printf("[저장개수 : %d\n", arr.getSize());
		for (int i = 0; i < arr.getSize(); i++) {
			Account acc = arr.getData(i);
			System.out.printf("[%02d] ", i);
			acc.Print();
		}
		System.out.println("-----------------------------------------");
	}

	// 1) insert흐름(저장정보->저장객체생성->[저장]->완료메시지)
	public void MakeAccount() {
		try {
			String name = BitGlobal.InputString("이름");
			int balance = BitGlobal.InputInteger("입금액");

			Account acc = new Account(name, balance);

			// 저장을 저장객체에 요청(예외처리, throw전달!)
			arr.PushBack(acc);

			System.out.println("계좌 저장 성공");
		} catch (Exception ex) {
			System.out.println("예외 : " + ex.getMessage());
		}
	}

	// 검색 알고리즘
	private int IdToIdx(int id) throws Exception {

		for (int i = 0; i < arr.getSize(); i++) {
			Account acc = arr.getData(i);
			if (acc.getAccid() == id)
				return i;
		}
		throw new Exception("없는 아이디입니다");
	}

	// 2) select흐름(검색키워드획득 -> 검색알고리즘(순차검색,배열) -> 찾은 객체 정보 출력)
	public void SelectAccount() {
		try {
			int id = BitGlobal.InputInteger("계좌번호");

			int idx = IdToIdx(id);

			// 저장소에게 해당 인덱스에 저장된 객체의 주소 반환요청
			Account acc = arr.getData(idx);

			acc.Println();
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	// 3) delete흐름(검색키워드획득 -> 검색알고리즘(순차검색,배열) -> 찾은 객체 삭제 ->결과출력)
	public void DeleteAccount() {
		try {
			int id = BitGlobal.InputInteger("계좌번호");

			int idx = IdToIdx(id);

			// 저장소에게 해당 인덱스에 저장된 객체 삭제 요청
			arr.Erase(idx);

			System.out.println("삭제되었습니다");
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	// 4) update흐름(검색키워드획득 -> 검색알고리즘(순차검색,배열) -> 찾은 객체정보변경->결과출력)
	public void InputUpdateAccount() {
		try {
			int id = BitGlobal.InputInteger("계좌번호");

			int idx = IdToIdx(id);

			// 저장소에게 해당 인덱스 객체 반환 요청
			Account acc = arr.getData(idx);

			int money = BitGlobal.InputInteger("입금액");
			acc.InputMoney(money);

			System.out.println("입금되었습니다.");
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	public void OutputUpdateAccount() {
		try {
			int id = BitGlobal.InputInteger("계좌번호");

			int idx = IdToIdx(id);

			// 저장소에게 해당 인덱스 객체 반환 요청
			Account acc = arr.getData(idx);

			int money = BitGlobal.InputInteger("출금액");
			acc.OutputMoney(money);

			System.out.println("출금되었습니다.");
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}
}
