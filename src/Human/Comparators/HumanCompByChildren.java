package Human.Comparators;

import java.util.Comparator;

import Human.Human;

public class HumanCompByChildren implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getChildren().size() - o2.getChildren().size() ;
    }
    
}
