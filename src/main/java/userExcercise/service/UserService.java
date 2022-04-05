package userExcercise.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import userExcercise.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User updateUser(User user);
    User removeUser(int userId);
    User addUser(User user);
}
