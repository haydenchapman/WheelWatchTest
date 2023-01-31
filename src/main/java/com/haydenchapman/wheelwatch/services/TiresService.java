package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.TireDto;
import jakarta.transaction.Transactional;

import java.util.List;

public interface TiresService {

    @Transactional
    void deleteTireById(Long tireId);

}
