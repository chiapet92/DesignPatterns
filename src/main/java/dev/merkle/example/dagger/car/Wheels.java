package dev.merkle.example.dagger.car;

public class Wheels {
  private Rims rims;
  private Tires tires;

  public Wheels(Rims rims, Tires tires) {
    this.rims = rims;
    this.tires = tires;
  }
}
