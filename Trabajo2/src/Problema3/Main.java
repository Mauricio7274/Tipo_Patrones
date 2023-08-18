package Problema3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new ConcretePizzaBuilder();
        Director director = new Director(builder);

        List<String> toppings = new ArrayList<>();
        toppings.add("queso");
        toppings.add("pepperoni");
        toppings.add("champiñones");

        director.constructPizza("grande", "integral", toppings, "queso");
        Pizza pizza = ((ConcretePizzaBuilder) builder).buildPizza();

        System.out.println("Pizza construida:");
        System.out.println("Tamaño: " + pizza.getSize());
        System.out.println("Masa: " + pizza.getDough());
        System.out.println("Ingredientes: " + pizza.getToppings());
        System.out.println("Cobertura adicional: " + pizza.getEdge());
        System.out.println("Costo total: " + pizza.getTotalCost());
    }
}