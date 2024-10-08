import java.util.Scanner;

public class Menu {
    private static Undo command = Undo.getInstance();
    public static void start(){
        Scanner sc = new Scanner(System.in);
        boolean escape = false;

        do{
            switch (menu()){
                case 1:
                    addOrder();
                    break;
                case 2:
                    deleteOrder();
                    break;
                case 3:
                    undo();
                    break;
                case 4:
                    showOrders();
                    break;
                case 0:
                    System.out.println("Thanks, goodbye!");
                    escape = true;
                    break;
            }
        } while (!escape);

    }

    private static byte menu() {
        Scanner input = new Scanner(System.in);
        byte option;
        final byte MIN = 0;
        final byte MAX = 4;

        do{
            System.out.println("\nMenu");
            System.out.println("1.Add order.");
            System.out.println("2.Delete order.");
            System.out.println("3.Undo.");
            System.out.println("4.Show orders.");
            System.out.println("0 To leave the app.\n");
            option = input.nextByte();
            if (option < MIN || option > MAX){
                System.out.println("Introduce a valid option.");
            }

        }while (option < MIN || option > MAX);
        return option;
    }

    public static void addOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order to add.");
        String order = sc.next();
        command.addOrder(order);
    }

    public static void deleteOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order to delete.");
        String order = sc.next();
        command.deleteOrder(order);

    }

    public static void undo(){
        command.deleteLastOrder();
    }

    public static void showOrders() {
        command.showOrders();
    }
}
