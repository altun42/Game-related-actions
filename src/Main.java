


import Campaign.KidsCampaigns;
import Game.Gameİnformation;
import Gamer.BaseGamer;
import Gamer.GamerControl;
import Gamer.KidsGamer;

public class Main {

	public static void main(String[] args) {
		BaseGamer gamer1 = new KidsGamer();
		
		gamer1.setFirstName("Kerim");
		gamer1.setLastName("Altun");
		gamer1.setInternationalityId("14879569100");
		gamer1.setBirthDay("2001");
		
		GamerControl gamerControl = new GamerControl();
		String[] gamers= {gamer1.getFirstName(),gamer1.getLastName(),gamer1.getInternationalityId(),gamer1.getBirthDay()};
		for (int i = 0; i < gamers.length; i++) {
			System.out.println(gamers[i]);
			
			
		}
		String controlBase = gamers[2];
		gamerControl.add(controlBase);
		
		
		Gameİnformation gameİnformation = new Gameİnformation("GTA V", "2016", "En sık alınan oyunlar kategorisinde", 800,0.5);
		System.out.println(gameİnformation.getFinalPrice());
		
		
		
		
		
		 String[] gameİnformations = {gameİnformation.getName(),gameİnformation.getReleaseDate(),gameİnformation.getDetails()};
		 for (String game_İnformation : gameİnformations) {
			 System.out.println(game_İnformation);
			
		}
		KidsCampaigns kidsCampaign = new KidsCampaigns();
		kidsCampaign.reportCampaign(0.5);
		
		 
		
		 
		 
		 
		
	
		
		
		
		

	}

}
