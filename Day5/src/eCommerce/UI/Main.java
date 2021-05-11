package eCommerce.UI;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.LoginWithEmail;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User emir = new User(1, "Emir", "KÜÇÜK", "emir.kucuk747@gmail.com", "123456", false);
		User aleyna = new User(2, "Aleyna", "ISNIK", "aleynaisnik@outlook.com", "1234", false);
		AuthService authService = new AuthManager( null, new LoginWithEmail());
		UserService userService = new UserManager(null);
		
		userService.add(emir);
		userService.delete(aleyna);
		userService.update(aleyna);
		//verify manager hatalý!!!!!!!!!!!!
	    userService.getId(1);
	    userService.getByEmail();
	    userService.getByEmailAndPassword(null, null);
		authService.register(emir);
		authService.login(emir);
		authService.verified(null);
		

	}

}