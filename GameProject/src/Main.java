public class Main {
 
    public static void main(String[] args) {

        Game game = new Game();
        game.setGameName("Rust");
        game.setGameId(1);
        game.setSystemrequirement("16 GB Ram");
        game.setPrice(127);
        
        GameManager gameManager = new GameManager();
        gameManager.register(game);
        gameManager.update(game);
        gameManager.delete(game);

        Gamer gamer = new Gamer(1, "NobleTR", "Emir", "K���K", "19.03.2002", "emir.kucuk747@gmail.com", "12345678911");
        gamer.setGamerId(1);
        gamer.setNickName("NobleTR");
        gamer.setFirstName("Emir");
        gamer.setLastName("K���K");
        gamer.setDateOfBirth("19.03.2002");
        
        GamerManager gamerManager = new GamerManager();
        gamerManager.register(gamer);
        gamerManager.update(gamer);
        gamerManager.delete(gamer);


        Campaign campaign = new Campaign();
        campaign.setCampaignId(1);
        campaign.setCampaignName("2021 Bahar Kampanyas�");
        campaign.setCampaignDiscount(50);
       
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.campaignAdd(campaign);
        campaignManager.campaignUpdate(campaign);
        campaignManager.campaignDelete(campaign);
        campaignManager.campaignApply(campaign);

        Sales sales = new Sales();

        SalesManager salesManager = new SalesManager();
        salesManager.compaignSale(gamer, campaign , game );
        salesManager.withoutCampaignSale(gamer, game );
        salesManager.returnOfSale(gamer , game);
        
    
  
        
       
       
        






   }
}