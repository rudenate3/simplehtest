package simplehtest;

public class baseArmor extends baseItem {
	
	@SuppressWarnings("unused")
	private enum ArmorTypes {
	   Body,
	   Head,
	   Legs,
	   Boots,
	   Gloves,
	}
	
	private int def;
	private int mdef;

	
	
	// Getters and Setters
	
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMdef() {
		return mdef;
	}
	public void setMdef(int mdef) {
		this.mdef = mdef;
	}
	
	
	
}
