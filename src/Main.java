


import Campaign.KidsCampaigns;
import Game.Game›nformation;
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
		
		
		Game›nformation game›nformation = new Game›nformation("GTA V", "2016", "En s˝k al˝nan oyunlar kategorisinde", 800,0.5);
		System.out.println(game›nformation.getFinalPrice());
		
		
		
		
		
		 String[] game›nformations = {game›nformation.getName(),game›nformation.getReleaseDate(),game›nformation.getDetails()};
		 for (String game_›nformation : game›nformations) {
			 System.out.println(game_›nformation);
			
		}
		KidsCampaigns kidsCampaign = new KidsCampaigns();
		kidsCampaign.reportCampaign(0.5);
		
		 
		
		 
		 
		 
		
	
		
		
		
		

	}

}
