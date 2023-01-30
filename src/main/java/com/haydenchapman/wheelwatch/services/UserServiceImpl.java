package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.UserDto;
import com.haydenchapman.wheelwatch.entities.User;
import com.haydenchapman.wheelwatch.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public List<String> addUser(UserDto userDto){
        List<String> response = new ArrayList<>();
        User user = new User(userDto);
        response.add("User added! Welcome to Wheel Watch!");
        return response;
    }

    @Override
    public List<String> userLogin(UserDto userDto){
        List<String> response = new ArrayList<>();
        Optional<User> userOptional = userRepository.findByUsername(userDto.getUsername());
        if (userOptional.isPresent()) {
            if (passwordEncoder.matches(userDto.getPassword(), userOptional.get().getPassword())) {
                response.add("User Login Success! Welcome to Wheel Watch!");
                response.add(String.valueOf(userOptional.get().getId()));
            } else {
                response.add("Username or password incorrect.");
            }
        } else {
                response.add("Username or password incorrect.");
        }
            return response;
    }
}
