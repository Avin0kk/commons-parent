package com.example.commons.service;
import com.example.commons.dto.UserDTO;
import com.example.commons.interfaces.CrudService;
import java.util.ArrayList;
import java.util.List;

public class UserService implements CrudService<UserDTO, Long> {

    private List<UserDTO> users = new ArrayList<>();

    @Override
    public UserDTO findById(Long id) {
        return users.stream()
                .filter(u->u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<UserDTO> findAll() {
        return users;
    }

    @Override
    public UserDTO save(UserDTO user) {
        users.add(user);
        return user;
    }

    @Override
    public void delete(Long id) {
        users.removeIf(u->u.getId().equals(id));
    }
}
