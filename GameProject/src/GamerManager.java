
public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Kullanıcı Kaydoldu : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanıcı güncellendi : "+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanıcı silindi : "+ gamer.getFirstName());
		
	}

}
