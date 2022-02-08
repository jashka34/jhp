package jashka.jhp.controller;


import jashka.jhp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jashka.jhp.repository.UserRepository;

@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    public UserController() {}

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRepository.getById(id);
    }

}
