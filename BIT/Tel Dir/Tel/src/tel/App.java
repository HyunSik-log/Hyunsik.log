package tel;

import java.io.IOException;

import tel.lib.*;

public class App {
	private App() {
	}

	private static App instance = null;

	public static App GetInstance() {
		if (instance == null)
			instance = new App();
		return instance;
	}

	private TelControl acon = TelControl.GetInstance();

	public void Run() throws IOException {
		while(true) {
			acon.PrintAll();
			Menu();
			
			switch(TelLib.InputChar("메뉴 선택")) {
			case '1': acon.MakeTel();				break;
			case '2': acon.SearchTel();				break;
			case '3': acon.SelectTel();				break;
			case '4': acon.UpdateTel();				break;
			case '5': acon.DeleteTel();				break;
			case '6': acon.SaveTel(); 				break;
			case '7': acon.LoadTel(); 				break;
			case '8': return;
			}
		}
	}
	
	public void Exit() {
		Ending();
	}
	
	private void Menu() {
		System.out.println("---------전화번호부 관리---------");
		System.out.println(" 1. 전화번호 등록");
		System.out.println(" 2. 전화번호 조회");
		System.out.println(" 3. 전화번호 검색");
		System.out.println(" 4. 전화번호 변경");
		System.out.println(" 5. 전화번호 삭제");
		System.out.println(" 6. 전화번호 저장하기");
		System.out.println(" 7. 전화번호 가져오기");
		System.out.println(" 8. 종료");
	}

	private void Ending() {
		System.out.println("---------------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("---------------------");
	}
}






