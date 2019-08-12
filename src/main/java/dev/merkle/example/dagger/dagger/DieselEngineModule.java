package dev.merkle.example.dagger.dagger;

import dagger.Module;
import dagger.Provides;
import dev.merkle.example.dagger.car.DieselEngine;
import dev.merkle.example.dagger.car.Engine;

@Module
public class DieselEngineModule {
  private int horsePower;

  public DieselEngineModule(int horsePower) {
    this.horsePower = horsePower;
  }

  @Provides
  int provideHorsePower() {
    return horsePower;
  }

  @Provides
  Engine provideEngine(DieselEngine engine) {
    return engine;
  }
}