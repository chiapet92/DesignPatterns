package dev.merkle.example.dagger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import dev.merkle.example.dagger.car.Car;
import dev.merkle.example.dagger.dagger.DaggerVehicleComponent;
import dev.merkle.example.dagger.dagger.VehicleComponent;
import org.junit.jupiter.api.Test;

class CarDaggerUnitTest {

  @Test
  void givenGeneratedComponent_whenBuildingCar_thenDependenciesAreInjected() {
    VehicleComponent component = DaggerVehicleComponent.builder()
        .horsePower(123)
        .engineCapacity(321)
        .build();

    Car carOne = component.buildCar();
    Car carTwo = component.buildCar();

//    test drive
    carOne.drive();
    carTwo.drive();

    // assertions
    assertNotNull(carOne);
    assertNotNull(carTwo);
    assertNotNull(carOne.getEngine());
    assertNotNull(carTwo.getEngine());
    assertNotNull(carOne.getBrand());
    assertNotNull(carTwo.getBrand());
    assertNotEquals(carOne.getEngine(), carTwo.getEngine());
    assertEquals(carOne.getBrand(), carTwo.getBrand());
  }

}
