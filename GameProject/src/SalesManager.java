public class SalesManager implements SalesService {

    
	@Override
    public void compaignSale(Gamer gamer, Campaign campaign, Game game) {
        String campaignSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullac�ya" + game.gameName + "adl� oyun" + campaignSale + "kampanyal� sat�� yap�ld�");

    }

    @Override
    public void withoutCampaignSale(Gamer gamer, Game game) {
        String withoutCampaignSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullac�ya" + game.gameName + "adl� oyun" + withoutCampaignSale + "kampanyas�z sat��� yap�ld�");


    }

    @Override
    public void returnOfSale(Gamer gamer, Game game) {
        String returnOfSale = null;
        System.out.println(gamer.getFirstName() + "isimli kullac� taraf�ndan" + game.gameName + "adl� oyun" + returnOfSale + "iade edildi ");

    }


}