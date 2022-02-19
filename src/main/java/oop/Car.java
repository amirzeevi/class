package oop;

public class Car {
    private long licenseNumber;
    private int speed;

    public void setLicenseNumber(long licenseNumber) {
        this.licenseNumber = licenseNumber;

    }

    public long getLicenseNumber() {
        return licenseNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int accelerate) {
        this.speed+= accelerate;
    }

    public void decelerate(int decelerate) {
        this.speed-= decelerate;
    }

    public void stop () {
        speed = 0;
    }
    public void show (){
        System.out.println("The car's licence number is "+getLicenseNumber());
        System.out.println("The current speed is "+getSpeed());
        System.out.println("==============================");
    }
}
