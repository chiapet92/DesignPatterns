package dev.merkle.example.dagger.dagger;

import dagger.Binds;
import dagger.Module;
import dev.merkle.example.dagger.car.Engine;
import dev.merkle.example.dagger.car.PetroEngine;

@Module
public abstract class PetroEngineModule {

  @Binds
  abstract Engine bindEngine(PetroEngine engine);
}
