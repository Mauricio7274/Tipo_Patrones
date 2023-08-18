package Problema3;
import java.util.List;
public class Director {
    private PizzaBuilder builder;

    public Director(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructPizza(String size, String dough, List<String> toppings, String edge) {
        builder.setSize(size);
        builder.setDough(dough);
        for (String topping : toppings) {
            builder.addTopping(topping);
        }
        builder.setEdge(edge);
    }
}
}

