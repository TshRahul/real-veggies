package com.stereo.realveggies.realveggies.repository;

import com.stereo.realveggies.realveggies.model.Veggie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeggieRepository extends JpaRepository<Veggie, Long> {
    Veggie  findVeggieById(Long id);
}
