package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends JpaRepository <Combo, Long> {
}
