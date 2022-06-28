package com.amz.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "aliens_table")
public class Alien {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "alien_id")
  private int alienId;
  @Column(name = "alien_name")
  private String alienName;
  @Column(name = "alien_tech")
  private String alienTech;

  public int getAlienId() {
    return alienId;
  }

  public void setAlienId(int alienId) {
    this.alienId = alienId;
  }

  public String getAlienName() {
    return alienName;
  }

  public void setAlienName(String alienName) {
    this.alienName = alienName;
  }

  public String getAlienTech() {
    return alienTech;
  }

  public void setAlienTech(String alienTech) {
    this.alienTech = alienTech;
  }

  @Override
  public String toString() {
    return "Alien{" +
      "alienId=" + alienId +
      ", alienName='" + alienName + '\'' +
      ", alienTech='" + alienTech + '\'' +
      '}';
  }
}
