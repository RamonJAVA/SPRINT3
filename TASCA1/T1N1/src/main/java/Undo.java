import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList<String> orders;

    private Undo() {
        this.orders = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(String order) {
        orders.add(order);
        System.out.println("Order added.");
    }

    public void deleteOrder(String order) {
        int index = searchOrder(order);
        if (index == -1) {
            System.out.println("Command not found.");
        }else {
            orders.remove(index);
        }
    }

    public void deleteLastOrder(){
        if (orders.isEmpty()){
            System.out.println("Empty list");
        }else {
            orders.remove(orders.size()-1);
        }
    }

    public void showOrders(){
        if (orders.isEmpty()){
            System.out.println("Empty list");
        }else {
            for (String order : orders) {
                System.out.println("\n" + order);
            }
        }
    }

    public int searchOrder(String order) {
        int foundIndex = -1;
        boolean coincidence = false;
        int i = 0;

        while (i < orders.size() && !coincidence) {
            if ((orders.get(i).equalsIgnoreCase(order))) {
                coincidence = true;
                foundIndex = i;
            }
            i++;

        }return foundIndex;

    }

}
