package tel;

import tel.data.*;
import tel.lib.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TelControl {
	private TelControl() {
		int max = TelLib.InputInteger("전화번호 갯수");

		arr = new Arr(max);
	}

	private static TelControl instance = null;

	public static TelControl GetInstance() {
		if (instance == null)
			instance = new TelControl();
		return instance;
	}

	private Arr arr;

	public void PrintAll() {
		System.out.println("------------------------------");
		System.out.printf("전화번호 수 : %d\n", arr.getSize());
		for (int i = 0; i < arr.getSize(); i++) {
			Tel acc = arr.getData(i);
			System.out.printf("[%d] ", i + 1);
			acc.Print();
			System.out.println("");
		}
		System.out.println("------------------------------");
	}

	public void MakeTel() {
		try {
			String name = TelLib.InputString("이름");
			int num = TelLib.InputInteger("번호");
			String address = TelLib.InputString("주소");

			Tel acc = new Tel(name, num, address);

			arr.PushBack(acc);

			System.out.println("전화번호 저장 완료");
		} catch (Exception ex) {
			System.out.println("예외: " + ex.getMessage());
		}
	}

	public int idToIdx(int id) throws Exception {
		for (int i = 0; i < arr.getSize(); i++) {
			Tel acc = arr.getData(i);
			if (acc.getNum() == id)
				return i;
		}
		throw new Exception("없는 전화번호입니다.");
	}
	
	public void SearchTel() {
		try {
			if( arr.getSize() == 0)
				System.out.println("데이터가 없습니다.");
			else {
				for(int i = 0; i < arr.getSize(); i++) {
					Tel acc = arr.getData(i);
					System.out.println("[" + (i + 1) + "]" + "이름: " + acc.getName() 
					+ ", " + "전화번호: " + acc.getNum() + ", " + "주소: " + acc.getAd() );
				}
			}
		}catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	public void SelectTel() {
		try {
			int id = TelLib.InputInteger("전화번호");

			int idx = idToIdx(id);

			Tel acc = arr.getData(idx);

			acc.Println();
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	public void UpdateTel() {
		try {
			int id = TelLib.InputInteger("전화번호");

			int idx = idToIdx(id);

			Tel acc = arr.getData(idx);

			int num = TelLib.InputInteger("새로운 번호");

			acc.PutNum(num);

			System.out.println("변경되었습니다");
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}

	public void DeleteTel() {
		try {
			int id = TelLib.InputInteger("전화번호");

			int idx = idToIdx(id);

			arr.Delete(idx);

			System.out.println("삭제되었습니다.");
		} catch (Exception ex) {
			System.out.println("에러 : " + ex.getMessage());
		}
	}
	
	public void SaveTel() throws IOException {
		FileOutputStream save = new FileOutputStream("c:/Tel.txt");
		for(int i = 0; i < arr.getSize(); i++) {
			Tel acc = arr.getData(i);
			String data = acc.getName() + "," + acc.getNum() + "," + acc.getAd() + "\n";
			save.write(data.getBytes());
		}
		System.out.println("데이터를 저장했습니다.");
		save.close();
	}

	public void LoadTel() throws IOException {
		String[] array;
		BufferedReader load = new BufferedReader(new FileReader("c:/Tel.txt"));
		while(true) {
            String line = load.readLine();
            if (line == null) break;
            array = line.split(",");
            for(int i = 0; i < arr.getSize(); i++) {
            	System.out.println(line);
            }

        }
		System.out.println("데이터를 가져왔습니다.");
		load.close();
	}
}






