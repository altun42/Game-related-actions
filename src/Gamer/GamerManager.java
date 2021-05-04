package Gamer;

public abstract class GamerManager {
	public abstract void add(String gamer);
		
	
	public void delete(String gamer) {
		System.out.println("Kayýt silindi");
	}
	public void update(BaseGamer gamer) {
		System.out.println("Kayýt güncellendi");
	}
	

}
