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
				win(h, e);
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
				System.out.println(e_name + " was victorious");
				Running.in_bat = 0;
				Running.g_run = 0;
				break;

			}
			try {
				Thread.sleep(1000); // 4000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

		}

	}
	
	private void win(hWar h, Enemy e){
		int rewarded = e.getRexp();
		int curexp = h.getExp();
		int curtnl = h.getTnl();
		
		
		
		System.out.println("Recieved " + rewarded + " exp");
		h.setExp(curexp + rewarded);
		
		if (curexp >= curtnl){
			System.out.println("Level Up");
			h.setLevel(h.getLevel() + 1);
			h.setTnl(curtnl * 2);
			System.out.println(h.getName() + " went to level " + h.getLevel());
			System.out.println(h.getExp() + "/" + h.getTnl() );
			try {
				Thread.sleep(4000); // 4000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
		 
	}

}
