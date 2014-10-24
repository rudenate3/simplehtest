package simplehtest;

public class RandomEnc {

	public  Enemy newBattle(int hlvl) {
		
		Enemy e = new Enemy();

		if(hlvl < 6) {
			e.spawne5();
			
			
		}
		return e;
		
		
		
	}

}
