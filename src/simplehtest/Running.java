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
		
		
			System.out.println("War, Mag, Rou?");
			String clasel = SCANNER.nextLine();
			
			CharFactory charFactory = new CharFactory();
			intChar h = charFactory.creCha(input,clasel);
			

		//Player h = new Player(input);
		Battle b = new Battle();
	// hWar h = new hWar(input);
		
		System.out.println(h.getName());
		System.out.println(h.getHp());
		System.out.println(h.getStr());
		
		h.setup();
		g_run = 1;
		lfb = 1;
		run(h, b);

	}


	private void run(intChar h, Battle b) {
		RandomEnc re = new RandomEnc();
		while (g_run == 1) {

			if ((lfb == 1) && (in_bat == 0)) {
				
				
				lfb = 0;
				Enemy e = re.newBattle(h.getLevel());
				b.BattleBegin(h, e);
				lfb = 1;
			}

		}

	}

}
