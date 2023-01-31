package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.ComboDto;
import com.haydenchapman.wheelwatch.dtos.TireDto;
import com.haydenchapman.wheelwatch.dtos.WheelDto;
import com.haydenchapman.wheelwatch.entities.Combo;
import com.haydenchapman.wheelwatch.entities.Tires;
import com.haydenchapman.wheelwatch.entities.User;
import com.haydenchapman.wheelwatch.entities.Wheels;
import com.haydenchapman.wheelwatch.repositories.ComboRepository;
import com.haydenchapman.wheelwatch.repositories.TiresRepository;
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
public class ComboServiceImpl implements ComboService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WheelsRepository wheelsRepository;
    @Autowired
    private TiresRepository tiresRepository;
    @Autowired
    private ComboRepository comboRepository;



    @Override
    public Optional<ComboDto> getComboById(Long comboId) {
        Optional<Combo> comboOptional = comboRepository.findById(comboId);
        if (comboOptional.isPresent()){
            return Optional.of(new ComboDto(comboOptional.get()));
        }
        return Optional.empty();
    }
}


