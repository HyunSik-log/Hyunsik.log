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
		int max = TelLib.InputInteger("��ȭ��ȣ ����");

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
		System.out.printf("��ȭ��ȣ �� : %d\n", arr.getSize());
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
			String name = TelLib.InputString("�̸�");
			int num = TelLib.InputInteger("��ȣ");
			String address = TelLib.InputString("�ּ�");

			Tel acc = new Tel(name, num, address);

			arr.PushBack(acc);

			System.out.println("��ȭ��ȣ ���� �Ϸ�");
		} catch (Exception ex) {
			System.out.println("����: " + ex.getMessage());
		}
	}

	public int idToIdx(int id) throws Exception {
		for (int i = 0; i < arr.getSize(); i++) {
			Tel acc = arr.getData(i);
			if (acc.getNum() == id)
				return i;
		}
		throw new Exception("���� ��ȭ��ȣ�Դϴ�.");
	}
	
	public void SearchTel() {
		try {
			if( arr.getSize() == 0)
				System.out.println("�����Ͱ� �����ϴ�.");
			else {
				for(int i = 0; i < arr.getSize(); i++) {
					Tel acc = arr.getData(i);
					System.out.println("[" + (i + 1) + "]" + "�̸�: " + acc.getName() 
					+ ", " + "��ȭ��ȣ: " + acc.getNum() + ", " + "�ּ�: " + acc.getAd() );
				}
			}
		}catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	public void SelectTel() {
		try {
			int id = TelLib.InputInteger("��ȭ��ȣ");

			int idx = idToIdx(id);

			Tel acc = arr.getData(idx);

			acc.Println();
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	public void UpdateTel() {
		try {
			int id = TelLib.InputInteger("��ȭ��ȣ");

			int idx = idToIdx(id);

			Tel acc = arr.getData(idx);

			int num = TelLib.InputInteger("���ο� ��ȣ");

			acc.PutNum(num);

			System.out.println("����Ǿ����ϴ�");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	public void DeleteTel() {
		try {
			int id = TelLib.InputInteger("��ȭ��ȣ");

			int idx = idToIdx(id);

			arr.Delete(idx);

			System.out.println("�����Ǿ����ϴ�.");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}
	
	public void SaveTel() throws IOException {
		FileOutputStream save = new FileOutputStream("c:/Tel.txt");
		for(int i = 0; i < arr.getSize(); i++) {
			Tel acc = arr.getData(i);
			String data = acc.getName() + "," + acc.getNum() + "," + acc.getAd() + "\n";
			save.write(data.getBytes());
		}
		System.out.println("�����͸� �����߽��ϴ�.");
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
		System.out.println("�����͸� �����Խ��ϴ�.");
		load.close();
	}
}






