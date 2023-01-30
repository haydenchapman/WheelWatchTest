package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.Wheels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WheelsRepository extends JpaRepository <Wheels, Long> {
}
