package userExcercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import userExcercise.model.User;
import userExcercise.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/home")
    @ResponseBody
    public String welcomePage() {
        return "Welcome to the home page of user spring exercise";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAllUsers();
    }


    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public User removeUser(@RequestBody int userId) {
        return userService.removeUser(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.PATCH, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);

    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }


}
