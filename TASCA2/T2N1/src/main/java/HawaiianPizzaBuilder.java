import java.util.ArrayList;
import java.util.Arrays;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private ArrayList<String> toppings =
            new ArrayList<>(Arrays.asList("ham", "pineapple"));

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setSize(getSize());
        pizza.setDough(getDough());
        pizza.setToppings(getToppings());
        return pizza;
    }
}
