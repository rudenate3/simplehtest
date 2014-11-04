package simplehtest;

public class basePlayer extends baseChar {
	
	private int exp;
	private int tnl;
	private int wid;
	private dataLocations loc;
	

	protected int[] equipArray = new int[6];
	
	
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getTnl() {
		return tnl;
	}
	public void setTnl(int tnl) {
		this.tnl = tnl;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public dataLocations getLoc() {
		return loc;
	}
	public void setLoc(dataLocations loc) {
		this.loc = loc;
	}


	public void setup(){  // Any first setup for player
		this.setLoc(dataLocations.FIRST);
	}
	

	
}

