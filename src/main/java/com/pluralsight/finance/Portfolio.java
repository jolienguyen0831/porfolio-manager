package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();

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
    public double getLeastValuable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::min).orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
