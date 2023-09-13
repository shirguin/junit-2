package hw;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp() {
        this.car = new Car("BMW", "X5", 2023);
        this.motorcycle = new Motorcycle("Java", "j1", 1980);
    }

    //проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarInstanceOfVehicle(){
        assertEquals(true, this.car instanceof Vehicle);
    }

    //проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testCarNumWheels(){
        assertEquals(4, this.car.getNumWheels());
    }

    //проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleNumWheels(){
        assertEquals(2, this.motorcycle.getNumWheels());
    }

    //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarSpeedTestDrive(){
        this.car.testDrive();
        assertEquals(60, this.car.getSpeed());
    }

    //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotorcycleSpeedTestDrive(){
        this.motorcycle.testDrive();
        assertEquals(75, this.motorcycle.getSpeed());
    }

    //проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarParkSpeed(){
        this.car.testDrive();
        this.car.park();
        assertEquals(0, this.car.getSpeed());
    }
    //проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotorcycleParkSpeed(){
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertEquals(0, this.motorcycle.getSpeed());
    }
}