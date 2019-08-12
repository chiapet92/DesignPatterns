package dev.merkle.example.dagger.car;

import javax.inject.Inject;

public class DieselEngine implements Engine {
  private int horsePower;

  @Inject
  DieselEngine(int horsePower) {
    this.horsePower = horsePower;
  };

  public void start() {
    System.out.println("Starting Diesel Engine with HP: " + horsePower);
  }

  public void stop() {
    System.out.println("Stopping Diesel Engine");
  }
}
