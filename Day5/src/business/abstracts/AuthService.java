package business.abstracts;

import entities.concretes.User;

public interface AuthService {

	    boolean register(User user);
	  
	   boolean login(User user);

	boolean verified(String email);

	boolean login(User user, String Email);
	}



