package allaboutstatic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticCarTestTest {

    @Test
    void whenNumberOfCarObjectsInitialized_ThenCounterIncrease() {
        new StaticFieldCar("ferrari","v8");
        new StaticFieldCar("toyota","w16");
        assertEquals(2, StaticFieldCar.numberOfCars);

    }
}