package Human.Comparators;

import java.util.Comparator;

import Human.Human;

public class HumanCompByAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthday().getYear() - o2.getBirthday().getYear();
    }
    
}