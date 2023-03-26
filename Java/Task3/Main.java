package Task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Task3.drags.Component;
import Task3.drags.impl.components.Azitron;


public class Main {
    public static void main(String[] args) {
        
        Component Azitron1 = new Azitron("Азитрон","2",5);
        Component Azitron2 = new Azitron("Азитрон","2",5);
        Component Pinecilin = new Azitron("Пинецилин","10",7);
        Component Pinecilin2 = new Azitron("Пинецилин","15",7);
        Component Pinecilin3 = new Azitron("Пинецилин","15",9);
        Component Pinecilin4 = Pinecilin3;
        List<Component> components = new ArrayList<>();
        components.add(Azitron1);
        components.add(Azitron2);
        components.add(Pinecilin);
        components.add(Pinecilin2);
        components.add(Pinecilin3);
        components.add(Pinecilin4);
        
        
        Set<Component> result = new HashSet<>(components);
        System.out.println(result.size());

    }
}
