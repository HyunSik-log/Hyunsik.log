package tel.data;

public class Tel {

	private String NAME;
	private int NUM;
	private String AD;
	
	public Tel(String name, int num, String address) {
		this.NAME = name;
		this.NUM = num;
		this.AD = address;
	}
	
	public void PutNum(int num) {
		this.NUM = num;		
	}
	
	public String getName() {
		return NAME;
	}
	
	public int getNum() {
		return NUM;
	}
	
	public String getAd() {
		return AD;
	}
	
	public void Print() {
		System.out.print("이름: " + NAME + ", " + "전화번호: " + NUM + ", " + "주소: " + AD);
	}

	public void Println() {
		System.out.println("이름: " + NAME);
		System.out.println("전화번호: " + NUM);
		System.out.println("주소: " + AD);
	}
}




