package userExcercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userExcercise.dao.UserRepository;
import userExcercise.model.User;

import java.util.List;


//Please note : This class should ask database for data in real life scenarios
@Service
public class UserServiceImpl implements UserService {

    //    private Map<Integer, User> allUsers;
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public UserServiceImpl() {
////        allUsers = new HashMap<>();
////        addUser(new User("sachin@gmail.com", "sachin11"));
////        addUser(new User("sdfsd", "sachin11"));
////        addUser(new User("sdfsdf", "sachin11"));
////        addUser(new User("fsdfsdf", "sachin11"));
////        addUser(new User("tyjghj", "sachin11"));
////        addUser(new User("ghjgj", "sachin11"));
////        addUser(new User("tyututy", "sachin11"));
////        addUser(new User("bnbvnbvn", "sachin11"));
////        addUser(new User("ertetert", "sachin11"));
//
//
//    }


    //Use the repository to do the following stuffs
    @Override
    public List<User> getAllUsers() {
//        return userRepository.findAll()
        List<User> users = (List<User>) userRepository.findAll();
        return users;

    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User removeUser(int userId) {
        User user = getUserById(userId);
        userRepository.deleteById(userId);
        return user;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
