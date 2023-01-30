package com.haydenchapman.wheelwatch.repositories;

import com.haydenchapman.wheelwatch.entities.Tires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiresRepository extends JpaRepository <Tires, Long> {
}
