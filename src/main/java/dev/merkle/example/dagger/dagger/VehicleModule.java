package dev.merkle.example.dagger.dagger;

import dagger.Module;
import dagger.Provides;
import dev.merkle.example.dagger.car.Brand;
import javax.inject.Singleton;

@Module
class VehicleModule {

  @Provides
  @Singleton
  Brand provideBrand() {
    return new Brand("Merkle");
  }

}
