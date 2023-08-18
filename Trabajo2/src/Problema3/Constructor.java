package Problema3;


    interface PizzaBuilder {
        void setSize(String size);
        void setDough(String dough);
        void addTopping(String topping);
        void setEdge(String edge);
        Pizza buildPizza();
    }
}
