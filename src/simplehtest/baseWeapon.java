package simplehtest;

public class baseWeapon extends baseItem {
	@SuppressWarnings("unused")
	private enum WeaponTypes {
		   Sword,
		   Bow,
		   Staff,
		   Mace,
		   Axe,
		}
		
		private int att;
		private int matt;
		
		
		
		
		// Getters and Setters
		public int getAtt() {
			return att;
		}
		public void setAtt(int att) {
			this.att = att;
		}
		public int getMatt() {
			return matt;
		}
		public void setMatt(int matt) {
			this.matt = matt;
		}
	
	
}
