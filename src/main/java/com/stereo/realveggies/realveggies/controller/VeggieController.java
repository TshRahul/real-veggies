package com.stereo.realveggies.realveggies.controller;

import com.stereo.realveggies.realveggies.model.Veggie;
import com.stereo.realveggies.realveggies.service.VeggieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veggies")
public class VeggieController {

    @Autowired
    VeggieService veggieService;

    @GetMapping("/")
    public List<Veggie> getAllVeggies(){
        return veggieService.getAllVeggies();
    }

    @GetMapping("/{id}")
    public Veggie getVeggieById(@PathVariable("id") Long id){
        return veggieService.getVeggieById(id);
    }

    @PostMapping("/")
    public Veggie addVeggie(@RequestBody Veggie veggie){
        return veggieService.addVeggie(veggie);
    }

    @DeleteMapping("/{id}")
    public void deleteVeggie(@PathVariable("id") Long id){
         veggieService.removeVeggie(id);
    }

}
