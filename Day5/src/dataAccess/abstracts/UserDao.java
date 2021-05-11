package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	    void add(User user);
	    void delete(User user);
	    void update(User user);
	    void verifyUser(int id);
	    User getId(int id);
	    boolean getByEmail(String email);
	    User getByEmailAndPassword(String email,String password);
	    List<User> getAll();
		User get(int id);
		boolean checkMail(String email);
		User getByEmail();
}
