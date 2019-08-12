package dev.merkle.example.dagger.dagger;

import dagger.Module;
import dagger.Provides;
import dev.merkle.example.dagger.car.Rims;
import dev.merkle.example.dagger.car.Tires;
import dev.merkle.example.dagger.car.Wheels;

@Module
abstract class WheelsModule {

  @Provides
  static Rims provideRims() {
    return new Rims();
  }

  @Provides
  static Tires provideTires() {
    Tires tires = new Tires();
    tires.inflate();
    return tires;
  }

  @Provides
  static Wheels provideWheels(Rims rims, Tires tires) {
    return new Wheels(rims, tires);
  }
}
