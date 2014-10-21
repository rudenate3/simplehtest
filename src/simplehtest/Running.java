package simplehtest;

import java.util.Scanner;

public class Running {

	private static final Scanner SCANNER = new Scanner(System.in);
	public static int g_run = 0;
	public static int in_bat = 0;
	public static int lfb = 0;

	public void begin() {

		System.out.println("Name?");

		String input = SCANNER.nextLine();

		Player h = new Player(input);
		Battle b = new Battle();

		g_run = 1;
		lfb = 1;
		run(h, b);

	}

	private void run(Player h, Battle b) {
		/*
		 * while (g_run == 1){ int death = h.deathcheck(); if (death == 1) {
		 * g_run = 0; }
		 */
		while (g_run == 1) {

			if ((lfb == 1) && (in_bat == 0)) {
				RandomEnc re = new RandomEnc();
				int h_lev = h.getP_level();
				Enemy e = re.newBattle(h_lev);
				lfb = 0;

				b.BattleBegin(h, e);
				lfb = 1;
			}

		}

	}

}
