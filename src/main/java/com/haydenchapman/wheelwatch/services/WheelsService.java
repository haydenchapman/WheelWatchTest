package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.WheelDto;
import jakarta.transaction.Transactional;

import java.util.List;

public interface WheelsService {

    @Transactional
    void deleteWheelById(Long wheelId);

}
