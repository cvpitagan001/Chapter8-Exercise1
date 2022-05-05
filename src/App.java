import java.util.Scanner;

public class App {

    static Scanner get = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Bank firstBank = new Bank(0.0, 0.0, 0.0, 0.0);
        menu(firstBank);
    }

    public static void menu(Bank firstBank) {
        System.out.println("1. Show total in a bank");
        System.out.println("2. Add a penny");
        System.out.println("3. Add a nickel");
        System.out.println("4. Add a dime");
        System.out.println("5. Add a quarter");
        System.out.println("6. Take money out of bank");
        System.out.println("Enter 0 to quit");
        System.out.print("Enter your choice: ");
        int opt = get.nextInt();    
        
        if(opt == 0) {
            exit();
        } else if(opt == 1) {
            clrscr();
            firstBank.getTotal();
            transactAgain(firstBank);
        } else if(opt == 2 || opt == 3 || opt == 4 || opt == 5) {
            clrscr();
            addCoin(firstBank, opt);
            transactAgain(firstBank);
        } else if(opt == 6) {
            clrscr();
            firstBank.removeAllCoins();
            transactAgain(firstBank);
        } else {
            clrscr();
            System.out.println("Invalid Input.");
        }

    }

    public static void addCoin(Bank firstBank, int opt) {
        System.out.print("Enter quantity: ");
        double qty = get.nextDouble();

        if(opt == 2) firstBank.setPenny(qty);
        if(opt == 3) firstBank.setNickel(qty);
        if(opt == 4) firstBank.setDime(qty);
        if(opt == 5) firstBank.setQuarter(qty);
    }

    public static void transactAgain(Bank firsBank) {
        System.out.print("\nDo you want to transact again?\n[1]YES [2]NO: ");
        int opt = get.nextInt();

        if(opt == 1) {
            clrscr();
            menu(firsBank);
        } else {
            exit();
        }

    }

    public static void exit() {
        System.exit(0);
    }

    public static void clrscr() {
        System.out.println("\033[H\033[2J");
    }
}
