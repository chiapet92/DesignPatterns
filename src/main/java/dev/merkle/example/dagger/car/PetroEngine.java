package dev.merkle.example.dagger.car;

import javax.inject.Inject;
import javax.inject.Named;

public class PetroEngine implements Engine {
  private int hp;
  private int capacity;

  @Inject
  public PetroEngine(@Named("horsepower") int hp,
      @Named("capacity") int capacity) {
    this.capacity = capacity;
    this.hp = hp;
  };

  public void start() {
    System.out.println("Starting Petro Engine with "
        + "\n horsepower: "+ String.valueOf(hp)
        + "\n capacity: "+ String.valueOf(capacity));
  }

  public void stop() {
    System.out.println("Stopping Petro Engine");
  }
}
