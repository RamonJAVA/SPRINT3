import java.util.ArrayList;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(ArrayList<String> toppings);
    Pizza build();
}
