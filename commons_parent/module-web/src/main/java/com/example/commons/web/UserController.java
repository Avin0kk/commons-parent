package com.example.commons.web;
import com.example.commons.dto.UserDTO;
import com.example.commons.service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public UserDTO getUser(Long id) {
        return userService.findById(id);
    }

    public UserDTO createUser(Long id, String name, String email) {
        UserDTO user = new UserDTO(id, name, email);
        return userService.save(user);
    }

    public void removeUser(Long id) {
        userService.delete(id);
    }

}
