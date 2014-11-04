package simplehtest;

public class hWar extends basePlayer implements intChar {

	hWar(String name) {
		this.setName(name);
		this.setLevel(1);
		this.setHp(20);
		this.setStr(5);

		equipArray[1] = 1;

		this.setExp(0);
		this.setTnl(20);

	}

}