package com.haydenchapman.wheelwatch.services;

import com.haydenchapman.wheelwatch.dtos.ComboDto;

import java.util.List;
import java.util.Optional;

public interface ComboService {

    Optional<ComboDto> getComboById(Long comboId);
}
