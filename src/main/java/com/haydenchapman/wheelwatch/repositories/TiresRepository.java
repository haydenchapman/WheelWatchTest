package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.Tires;
import com.haydenchapman.wheelwatch.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TiresRepository extends JpaRepository <Tires, Long> {
    List<Tires> findAllByUserEquals(User user);
}
