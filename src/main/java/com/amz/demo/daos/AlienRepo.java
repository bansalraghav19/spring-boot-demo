package com.amz.demo.daos;

import com.amz.demo.models.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
  public Alien findByAlienId(int alienId);
}
