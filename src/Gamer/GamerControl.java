package Gamer;

public class GamerControl extends GamerManager {
	
	BaseGamer baseGamer = new BaseGamer();

	@Override
	public void add(String gamer) {
		if (gamer.length()==11) {
			System.out.println("Kimlik do�ruland�...");
			System.out.println("Kay�t ba�ar�l� bir �ekilde tamamland�...");
		}else {
			System.out.println("Kimlik do�rulanamad�.L�tfen kimlik bilgilerinizi tam giriniz...");
			System.out.println("Kay�t tamamlanamad�...");
		}
		
	}
	

}
