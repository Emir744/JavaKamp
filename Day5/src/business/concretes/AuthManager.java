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
				System.out.println("Doðrulama bekleniyor...");
				loginWithEmail.loginWithEmail(user.getEmail());
				userDao.add(user);
				System.out.println("Kayýt Baþarýlý!");
			}else {
				System.out.println("Bu kullanýcý zaten var!");
			}
			
		} else {
			System.out.println("Kayýt Baþarýsýz! Lütfen bilgileri kontrol edin.");
		}

	

		return false;
	}
	@Override
	public boolean login(User user, String Email) {
	
		if (userDao.getByEmail(Email)) {
			System.out.println(Email + " giriþ baþarýlý.");
		}
		else {
			System.out.println("Hatalý bilgi giriþi.");
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