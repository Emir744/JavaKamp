
public class Campaign {
    public int campaignId;
    public String campaignName;
    public double campaignDiscount;
	
    
    
    public Campaign(int campaignId, String campaignName, double campaignDiscount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	
	
	
	
	}
	public Campaign() {
		// TODO Auto-generated constructor stub
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
}
