package dev.merkle.example.dagger.car;

import javax.inject.Inject;

public class Car {
  private Engine engine;
  private Brand brand;
  private Wheels wheels;
  private Driver driver;

  @Inject
  public Car(Engine engine, Brand brand, Wheels wheels, Driver driver) {
    this.engine = engine;
    this.brand = brand;
    this.wheels = wheels;
    this.driver = driver;
  }

  @Inject
  public void enableRemote(Remote remote) {
    remote.setListener(this);
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public void drive() {
    this.engine.start();
    System.out.println(this.driver);
  }
}
