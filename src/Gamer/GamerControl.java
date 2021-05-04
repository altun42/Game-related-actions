package Gamer;

public class GamerControl extends GamerManager {
	
	BaseGamer baseGamer = new BaseGamer();

	@Override
	public void add(String gamer) {
		if (gamer.length()==11) {
			System.out.println("Kimlik doðrulandý...");
			System.out.println("Kayýt baþarýlý bir þekilde tamamlandý...");
		}else {
			System.out.println("Kimlik doðrulanamadý.Lütfen kimlik bilgilerinizi tam giriniz...");
			System.out.println("Kayýt tamamlanamadý...");
		}
		
	}
	

}
