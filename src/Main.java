import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Car myFirstCar = new Car();
        myFirstCar.model = "GT600";
        myFirstCar.brand = "Suzuki";
        myFirstCar.color = "white";
        myFirstCar.year = 2023;

        System.out.println(myFirstCar.getCarDetails());

        Car[] cars = new Car[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++){
            cars[i] = new Car();

            System.out.println("Insert car details, for car number: " + (i+1));

        System.out.print("Insert make: ");
        cars[i].brand = scanner.nextLine();

        System.out.print("Insert model: ");
        cars[i].model = scanner.nextLine();

        System.out.print("Insert color: ");
        cars[i].color = scanner.nextLine();

        System.out.print("Insert year: ");
        cars[i].year = scanner.nextInt();
        scanner.nextLine();

        }
        System.out.println("List of cars: ");
        for (Car car : cars){
            System.out.println(car.getCarDetails());
        }

        scanner.close();



         }

    }