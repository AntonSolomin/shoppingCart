public class Car {
    String name;
    String model;
    int speed = 0;

    Car(String carBrand, String brandModel) {
        // can be both this(referring to the class field ) and just field name.
        this.name = carBrand;
        model = brandModel;
    }

    void accelerate (int amount) {
        speed += amount;
    }
    void decelerate (int amount) {
        if (amount > speed) {
            speed = 0;
        } else {
            speed -= amount;
        }
    }
    void freeze () {
        speed = 0;
    }
    void status () {
        System.out.println(speed + " " + name + " " + model);
    }
    boolean isRunning () {

        boolean isRunning = speed > 0 ? true : false;
        /*isRunning = speed > 0;
        if (speed > 0) {
            isRunning = true;
        } else {
            isRunning = false;
        }*/

        System.out.println(isRunning);

        return isRunning;
    }
    //not nothing (void) is returned but a string meaning we need to indicate String;
    public String toString () {
        return name + " " + model + " " + speed;
    }
}
