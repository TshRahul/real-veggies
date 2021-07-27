package com.stereo.realveggies.realveggies.service;

import com.stereo.realveggies.realveggies.model.Veggie;
import com.stereo.realveggies.realveggies.repository.VeggieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeggieService {

    @Autowired
    VeggieRepository veggieRepository;

    public List<Veggie> getAllVeggies() {
        return veggieRepository.findAll();
    }


    public Veggie getVeggieById(Long id) {
        return veggieRepository.findVeggieById(id);
    }

    public Veggie addVeggie(Veggie veggie) {
        return veggieRepository.save(veggie);
    }

    public void removeVeggie(Long id) {
         veggieRepository.delete(veggieRepository.findVeggieById(id));
    }
}
