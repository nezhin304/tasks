package myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyCollection {

    private static <O> Collection<O> getObjects(O[] list, Collection<O> coll) {

        Collection<O> collection = new ArrayList<>();
        for (O obj : list) {
            coll.add(obj);
        }

        return coll;
    }


    public static void main(String[] args) {


        Integer i[] = {1, 2, 1, 2, 1};
        List<Object> lstObj;

        lstObj = (List<Object>) getObjects(i, new ArrayList<Object>());

        for (Object o : lstObj) {

            System.out.println(o);

        }
    }
}
