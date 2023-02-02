package isp.bad;

public class Car implements VehicleInterface {
 
    // Bisa di implementasikan
    @Override
    public void drive() {
 
    }
 
    @Override
    public void stop() {
 
    }
 
    @Override
    public void refuel() {
 
    }
 
    // Tidak bisa di implementasikan
    @Override
    public void openDoors() {
        // motor kan ngga punya pintu hehehe
    }
}
