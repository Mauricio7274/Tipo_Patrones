package Problema3;
import java.util.ArrayList;
import java.util.List;
    class ConcretePizzaBuilder implements PizzaBuilder {
        private Pizza pizza = new Pizza();

        public void setSize(String size) {
            pizza.setSize(size);
        }

        public void setDough(String dough) {
            pizza.setDough(dough);
        }

        public void addTopping(String topping) {
            pizza.addTopping(topping);
        }

        public void setEdge(String edge) {
            pizza.setEdge(edge);
        }

        public Pizza buildPizza() {
            // Calcula el costo total de la pizza
            double toppingsCost = pizza.getToppings().size() * 1.5; // Precio por topping
            double edgeCost = pizza.getEdge().equals("queso") ? 2.0 : 0.0; // Precio por edge
            pizza.setTotalCost(toppingsCost + edgeCost);

            return pizza;
        }
    }
}
