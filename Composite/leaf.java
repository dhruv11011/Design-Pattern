package Composite;

import java.util.ArrayList;
import java.util.List;

interface Transportation {
    void showPrice();
}

class Leaf implements Transportation {
    int Price;
    String Name;

    // Constructor
    public Leaf(int Price, String Name) {
        super();
        this.Price = Price;
        this.Name = Name;
    }

    @Override
    public void showPrice() {
        System.out.println(Name + " : " + Price);
    }
}

class Tickets implements Transportation {
    String Name;

    public Tickets(String Name) {
        super();
        this.Name = Name;
    }

    List<Transportation> Transportations = new ArrayList<>();

    public void addTransportation(Transportation com) {
        Transportations.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("Name:");
        for (Transportation c : Transportations) {
            c.showPrice();
        }
    }
}