package com.amz.demo.controllers;

import com.amz.demo.models.Alien;
import com.amz.demo.services.AlienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienController {

  @Autowired
  private AlienService alienService;

  @GetMapping("/aliens")
  public List<Alien> getAliens() {
    return alienService.getAllAliens();
  }

  @PostMapping(value = "/addAlien", consumes = "application/json")
  public Alien createAlien(@RequestBody Alien alien) {
    return alienService.addAlien(alien);
  }
}
