package simplehtest;


public class Battle {

	public void BattleBegin(hWar h, Enemy e) {
		// h setup
		String h_name = h.getName();
		int h_hp = h.getHp();
		int h_att = h.getStr();

		// e setup
		String e_name = e.getName();
		int e_hp = e.getHp();
		int e_att = e.getStr();

		// Begins
		System.out.println("The battle has begun");
		Running.in_bat = 1;

		while (Running.in_bat == 1) {

			// h atts
			e_hp = e_hp - h_att;
			System.out.println(h_name + " atts for " + h_att);
			if (e_hp <= 0) {
				System.out.println(h_name + " was victorious");
				Running.in_bat = 0;
				break;

			}
			try {
				Thread.sleep(1000); // 4000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			// e atts
			h_hp = h_hp - e_att;
			System.out.println(e_name + " atts for " + e_att);
			if (h_hp <= 0) {
				System.out.println("e was victorious");
				Running.in_bat = 0;
				break;

			}
			try {
				Thread.sleep(1000); // 4000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

		}

	}

}
