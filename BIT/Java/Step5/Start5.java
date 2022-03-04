//인터페이스

class GroundUnit {
	private int x;
	private int y;
	private int hp;
	private int power;

	public GroundUnit(int x, int y, int hp, int power) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void pointupdate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void DownHp(int value) {
		hp = hp - value;
	}
}

interface Moveable {
	void move(int x, int y); // public abstract ~~
}

interface Attackable {
	void attack(GroundUnit u);
}

//interface가 하나 이상의 interface 상속이 가능하다.
interface Fightable extends Moveable, Attackable {
}

//class또한 하나 이상의 interface 상속이 가능하다.
//         하나의 class상속이 가능하다.
//         반드시 class상속이 선행되어야 한다.
class Marin extends GroundUnit implements Moveable, Attackable {

	public Marin(int x, int y, int hp, int power) {
		super(x, y, hp, power);
	}

	@Override
	public void move(int x, int y) {
		super.pointupdate(x, y);
	}

	@Override
	public void attack(GroundUnit u) {
		if (u instanceof Marin)
			u.DownHp(this.getPower());
		else
			System.out.println("마린은 마린만 공객가능합니다.");
	}
}

//구현 상속(약속)
class Tank implements Moveable, Attackable {

	@Override
	public void attack(GroundUnit u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}

public class Start5 {
	public static void main(String[] args) {
		Marin m1 = new Marin(10, 10, 100, 20);
		m1.move(260, 512);

		Marin m2 = new Marin(50, 50, 100, 20);
		m1.attack(m2);
	}
}
