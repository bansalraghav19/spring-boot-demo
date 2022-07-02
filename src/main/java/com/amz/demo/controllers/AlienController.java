package com.amz.demo.controllers;

import com.amz.demo.exceptions.AlienNotFound;
import com.amz.demo.models.Alien;
import com.amz.demo.services.AlienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

  @Autowired
  private AlienService alienService;

  @GetMapping("/aliens")
  public List<Alien> getAliens() {
    return alienService.getAllAliens();
  }

  @GetMapping("/alien/{id}")
  public ResponseEntity<Alien> getAlienById(@PathVariable("id") int alienId) throws AlienNotFound {
    return ResponseEntity.ok(alienService.getAlienById(alienId));
  }

  @PostMapping(value = "/addAlien", consumes = "application/json")
  public Alien createAlien(@RequestBody Alien alien) {
    return alienService.addAlien(alien);
  }
}
