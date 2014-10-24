package simplehtest;

import java.util.Random;

public class Enemy extends baseEnemy {

  public void spawne5() {
	  
	  int i;
	  i = randnum(1,3);
	  System.out.println("Random number is " + i);
	 
	  switch(i) {
	  		
	  		case 1:  
	  			this.setName("Gob");
	  			this.setHp(15);
	  			this.setStr(3);
	  			System.out.println("Gob Spawned");
	  			break;
	  		case 2:  
	  			this.setName("Og");
	  			this.setHp(20);
	  			this.setStr(4);
	  			System.out.println("Og Spawned");
	  			break;
	  		case 3:  
	  			this.setName("Bir");
	  			this.setHp(10);
	  			this.setStr(2);
	  			System.out.println("Bir Spawned");
	  			break;
	  }
	 
	  
  }
	

  
  
  
  
  
  
  
  
  
  
  
  
  private int randnum (int min, int max){
	  // NOTE: Usually this should be a field rather than a method
  
  // variable so that it is not re-seeded every call.
  Random rand = new Random();

  // nextInt is normally exclusive of the top value,
  // so add 1 to make it inclusive
  int randomNum = rand.nextInt((max - min) + 1) + min;

  return randomNum;
  
  }
}
