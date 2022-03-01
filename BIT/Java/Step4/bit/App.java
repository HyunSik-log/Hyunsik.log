package bit;

import bit.lib.BitGlobal;

//흐름
public class App {
	// 싱글톤--------------------------------------------------
	private App() {
	}

	private static App instance = null;

	public static App GetInstance() {
		if (instance == null)
			instance = new App();
		return instance;
	}
	// --------------------------------------------------------

	private AccountControl acon = AccountControl.GetInstance();

	public void Init() {
		Logo();
	}

	public void Run() {
		while (true) {
			acon.PrintAll();
			Menu();

			switch (BitGlobal.InputChar("메뉴 선택")) {
			case '0':
				return;
			case '1':
				acon.MakeAccount();
				break;
			case '2':
				acon.SelectAccount();
				break;
			case '3':
				acon.InputUpdateAccount();
				break;
			case '4':
				acon.OutputUpdateAccount();
				break;
			case '5':
				acon.DeleteAccount();
				break;
			default:
				System.out.println("잘못된 선택");
			}
		}
	}

	public void Exit() {
		Ending();
	}

	private void Menu() {
		System.out.println("------------------------------------------");
		System.out.println(" [0] 프로그램 종료)");
		System.out.println(" [1] 계좌 저장(insert)");
		System.out.println(" [2] 계좌 검색(select)");
		System.out.println(" [3] 계좌 입금(update)");
		System.out.println(" [4] 계좌 출금(update)");
		System.out.println(" [5] 계좌 삭제(update)");
		System.out.println("------------------------------------------");
	}

	private void Logo() {
		System.out.println("------------------------------------------");
		System.out.println(" Java Programming 실습");
		System.out.println(" 2022-02-03");
		System.out.println(" ccm");
		System.out.println("------------------------------------------");
	}

	private void Ending() {
		System.out.println("------------------------------------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("------------------------------------------");
	}
}
