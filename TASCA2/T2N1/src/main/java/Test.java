public class Test {
    public static void start(){
        PizzaBuilder hawaiianPizzaOrder1 = new HawaiianPizzaBuilder().setSize("Medium").setDough("Thin");
        PizzaMaster pm = new PizzaMaster(hawaiianPizzaOrder1);
        Pizza hawaiianPizza = pm.buildPizza();
        System.out.println("Order ready: " + hawaiianPizza.toString());

        PizzaBuilder vegetarianPizzaOrder1 = new VegetarianPizzaBuilder().setSize("Small").setDough("Stuffed");
        pm = new PizzaMaster(vegetarianPizzaOrder1);
        Pizza vegetarianPizza = pm.buildPizza();
        System.out.println("Order ready: " + vegetarianPizza.toString());

        PizzaBuilder fourCheesesPizzaOrder1 = new FourCheesesPizzaBuilder().setSize("Large").setDough("Thick");
        pm = new PizzaMaster(fourCheesesPizzaOrder1);
        Pizza fourCheesesPizza = pm.buildPizza();
        System.out.println("Order ready: " + fourCheesesPizza.toString());

    }

}
