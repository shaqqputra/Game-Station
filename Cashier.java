import java.util.Scanner;

public class Cashier extends Employee{
    private Game game;
    Scanner scan = new Scanner(System.in);
    private int input;

    public Cashier() {
        game = new Game();

    }

    public void showOrder(){
        do{
            System.out.println("ORDER BILLS");
            System.out.println("1. Display Bills");
            System.out.println("Exit");
            System.out.println("Choose Menu: ");
            input = scan.nextInt();

            switch(input){
                case 1: 

                    break;
            }
        }
    }
    

    
}