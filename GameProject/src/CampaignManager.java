
public class CampaignManager  implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Kampanya eklendi  : " + campaign.campaignName);
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi  : " + campaign.campaignName);
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya Geri al�nd� : " + campaign.campaignName);
		
	}

	@Override
	public void campignApply(Campaign campaign) {
		System.out.println("Kampanya Uyguland� : " + campaign.campaignName);
		
	}

	public void campaignApply(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
