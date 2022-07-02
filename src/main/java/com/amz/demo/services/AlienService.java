package com.amz.demo.services;

import com.amz.demo.daos.AlienRepo;
import com.amz.demo.exceptions.AlienNotFound;
import com.amz.demo.models.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {

  @Autowired
  private AlienRepo alienrepo;

  public List<Alien> getAllAliens() {
    return alienrepo.findAll();
  }

  public Alien addAlien(Alien alien) {
    return alienrepo.save(alien);
  }

  public Alien getAlienById(int alienId) throws AlienNotFound {
    Alien alien = alienrepo.findByAlienId(alienId);

    if(alien == null) {
      throw new AlienNotFound("Alien not found with Id " + alienId);
    }

    return alien;
  }
}
