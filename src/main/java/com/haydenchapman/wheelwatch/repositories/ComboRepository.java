package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.Combo;
import com.haydenchapman.wheelwatch.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComboRepository extends JpaRepository <Combo, Long> {
    List<Combo> findAllByUserEquals(User user);
}
