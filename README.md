# Portfolio Manager
## Class Design
![image.PNG](../diagrams/image.PNG)
## Requirements
-:)
;)
- ;))
- =)
- =))
## Code
### Interesting code
``` java
public double getValue(){
        return valuables.stream().mapToDouble(Valuable::getValue).sum();
    }
    public double getMostValueable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::max).orElse(0.0);
    }
    public double getLeastValuable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::min).orElse(0.0);
    }
```
```diff
public double getValue(){
        return valuables.stream().mapToDouble(Valuable::getValue).sum();
    }
    public double getMostValueable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::max).orElse(0.0);
    }
    public double getLeastValuable(){
        return valuables.stream().mapToDouble(Valuable::getValue).reduce(Double::min).orElse(0.0);
    }
```