package simplehtest;

public class CharFactory {

	public intChar creCha(String input, String clasel) {
		if(input == null){
			return null;
		}
		if(clasel.equalsIgnoreCase("War")){
			System.out.println("War");
			return new hWar(input);
		} else if (clasel.equalsIgnoreCase("Mag")){
			System.out.println("Mag");
			return new hMag(input);
		} else if (clasel.equalsIgnoreCase("Rou")){
			System.out.println("Rou");
			return new hRou(input);
		}
		return null;
	}
}