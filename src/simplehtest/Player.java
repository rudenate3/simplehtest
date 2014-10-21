package simplehtest;

public class Player {

	String p_name;
	int p_level;
	int p_hp = 20;
	int p_att = 3;

	Player(String name) {
		setP_name(name);
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_level() {
		return p_level;
	}

	public int getP_hp() {
		return p_hp;
	}

	public int getP_att() {
		return p_att;
	}

	public int deathcheck() {
		if (p_hp <= 0) {
			return 0;
		}
		return 1;
	}

}
