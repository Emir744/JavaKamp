package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
    void add(User user);
    void delete(User user);
    void update(User user);
    void verifyUser(int id);
    User getId(int id);
    User getByEmail();
    User getByEmailAndPassword(String email,String password);
    List<User> getAll();
    
    
}
