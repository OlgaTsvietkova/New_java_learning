package New;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        //System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        for(Integer el:numbers){
            System.out.println(el);
        }
    }
}
