package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.User;
import com.haydenchapman.wheelwatch.entities.Wheels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WheelsRepository extends JpaRepository <Wheels, Long> {
    List<Wheels> findAllByUserEquals(User user);
}
