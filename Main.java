package Car;
// writen by Sage
//for Mr Gross SD1 class, learning about objects and classes in Java
public class Main {
    public static void main(String[] args) {
        // Instantiate 3 objects
        Car car1 = new Car("Chevrolet", "Chevelle SS", 0);
        Car car2 = new Car("Ford", "Mustang", 30);
        Car car3 = new Car("Dodge", "Challenger", 45);

        // Change an attribute
        car2.speed = 35;

        // Use the behavior
        car1.speedUp(55);

        // Print to show it works
        System.out.println(car1.make + " " + car1.model + " speed: " + car1.speed);
        System.out.println(car2.make + " " + car2.model + " speed: " + car2.speed);
        System.out.println(car3.make + " " + car3.model + " speed: " + car3.speed);
    }
}