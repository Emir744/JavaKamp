package business.concretes;



import business.abstracts.AuthService;
import core.LoginWithEmail;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


public class AuthManager implements AuthService {
      private UserDao userDao;
      private LoginWithEmail loginWithEmail;
	
      
      
        public AuthManager(UserDao userDao, LoginWithEmail loginWithEmail) {
		super();
		this.userDao = userDao;
		this.loginWithEmail = loginWithEmail;
	
        
        
        
        }
	@Override
	public boolean register(User user) {
		if (User.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getEmail().matches("(.*)@gmail.com")) {
			if(!userDao.checkMail(user.getEmail())) {
				System.out.println("Do�rulama bekleniyor...");
				loginWithEmail.loginWithEmail(user.getEmail());
				userDao.add(user);
				System.out.println("Kay�t Ba�ar�l�!");
			}else {
				System.out.println("Bu kullan�c� zaten var!");
			}
			
		} else {
			System.out.println("Kay�t Ba�ar�s�z! L�tfen bilgileri kontrol edin.");
		}

	

		return false;
	}
	@Override
	public boolean login(User user, String Email) {
	
		if (userDao.getByEmail(Email)) {
			System.out.println(Email + " giri� ba�ar�l�.");
		}
		else {
			System.out.println("Hatal� bilgi giri�i.");
		}
		return false;
	
	
	
	
	
	
	
	
	}
	@Override
	public boolean verified(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}
      
	
      
      
}