
public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Kullan�c� Kaydoldu : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi : "+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : "+ gamer.getFirstName());
		
	}

}
