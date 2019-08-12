package dev.merkle.example.dagger.dagger;

import dagger.BindsInstance;
import dagger.Component;
import dev.merkle.example.dagger.car.Car;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Component(modules = {
    VehicleModule.class,
    WheelsModule.class,
    PetroEngineModule.class
})
public interface VehicleComponent {
  public Car buildCar();

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder horsePower(@Named("horsepower") int horsePower);

    @BindsInstance
    Builder engineCapacity(@Named("capacity") int capacity);

    VehicleComponent build();
  }
}
