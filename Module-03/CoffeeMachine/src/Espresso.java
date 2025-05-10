public class Espresso extends Coffee{

    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots){
        super(name, roast, price);
        this.numberOfShots = numberOfShots;

    }

    public void printEspressoDetails(){
        System.out.println("You asked for " + numberOfShots + " number of shots, each one costs $2.5. The final cost is: " + (numberOfShots * 2.5));
    }
}
