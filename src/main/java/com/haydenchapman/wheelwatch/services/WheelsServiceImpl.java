package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.WheelDto;
import com.haydenchapman.wheelwatch.entities.User;
import com.haydenchapman.wheelwatch.entities.Wheels;
import com.haydenchapman.wheelwatch.repositories.UserRepository;
import com.haydenchapman.wheelwatch.repositories.WheelsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WheelsServiceImpl implements WheelsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WheelsRepository wheelsRepository;

    @Override
    @Transactional
    public void deleteWheelById(Long wheelId){
        Optional<Wheels> wheelsOptional = wheelsRepository.findById(wheelId);
        wheelsOptional.ifPresent(wheels -> wheelsRepository.delete(wheels));
    }

    //get all wheels

    //get wheel by id
}
