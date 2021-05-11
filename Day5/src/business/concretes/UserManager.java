//yardým alýnacak


package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
 private UserDao userDao;
 public UserManager(UserDao userdao) {
	 
 }
@Override
public void add(User user) {
	// TODO Auto-generated method stub
	
}
@Override
public void delete(User user) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(User user) {
	// TODO Auto-generated method stub
	
}
@Override
public void verifyUser(int id) {
	User user= userDao.get(id);
	user.setVerified(true);
	System.out.println("Kullanýcý doðrulandý");
	
	
}
@Override
public User getId(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public User getByEmail() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public User getByEmailAndPassword(String email, String password) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<User> getAll() {
	// TODO Auto-generated method stub
	return null;
}
public static void Usersend(String mail) {
	// TODO Auto-generated method stub
	
}
}
