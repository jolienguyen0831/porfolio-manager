package com.pluralsight.finance;

import java.util.ArrayList;

public class Porfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Porfolio(String name, String owner, ArrayList<Valuable> valuables) {
        this.name = name;
        this.owner = owner;
        this.valuables = valuables;
    }
    public void add(Valuable valuable){
        valuables.add(valuable);
    }

    public double getValue(){
        return valuables.stream().mapToDouble(Valuable::getValue).sum();
    }
    public double getMostValueable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::max).orElse(0.0);
    }
    public double getLeaseValuable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::min).orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
