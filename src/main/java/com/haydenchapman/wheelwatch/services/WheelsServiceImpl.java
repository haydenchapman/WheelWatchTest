package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.repositories.UserRepository;
import com.haydenchapman.wheelwatch.repositories.WheelsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WheelsServiceImpl {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WheelsRepository wheelsRepository;
}
