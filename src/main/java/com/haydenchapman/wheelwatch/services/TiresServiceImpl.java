package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.TireDto;
import com.haydenchapman.wheelwatch.entities.Tires;
import com.haydenchapman.wheelwatch.entities.User;
import com.haydenchapman.wheelwatch.repositories.TiresRepository;
import com.haydenchapman.wheelwatch.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TiresServiceImpl implements TiresService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TiresRepository tiresRepository;

    @Override
    @Transactional
    public void deleteTireById(Long tireId){
        Optional<Tires> tiresOptional = tiresRepository.findById(tireId);
        tiresOptional.ifPresent(tires -> tiresRepository.delete(tires));
    }

    //get all tires

    //get tires by id
}
