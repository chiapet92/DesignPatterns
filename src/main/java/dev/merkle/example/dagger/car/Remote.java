package dev.merkle.example.dagger.car;

import javax.inject.Inject;

public class Remote {
  @Inject
  public Remote() {};

  public void setListener(Car car) {
    System.out.println("Remote connected");
  }
}
