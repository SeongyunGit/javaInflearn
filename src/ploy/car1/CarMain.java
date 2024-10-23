package ploy.car1;

public class CarMain {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        ModelCar modelCar = new ModelCar();
        driver.setCar(modelCar);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
