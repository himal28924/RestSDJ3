package userExcercise.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import userExcercise.model.User;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
//    User createUser(User user);
//    User getUser(int userid);
//    User removeUser(int userId);
//    User updateUser(User user);
//    List<User> getAllUsers();
    User getUserByEmail(String email);
}
