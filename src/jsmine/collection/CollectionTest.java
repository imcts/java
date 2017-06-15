package jsmine.collection;

import java.util.*;

/**
 * Created by imcts on 2017. 6. 11..
 */


public class CollectionTest {

    public static void main(String[] args) {
        ArrayList arrayList; //배열로 이루어진 리스트
        LinkedList linkedList; //링크로 이루어진 리스트
        Stack stack; //스퉥

        arrayList = new ArrayList(); //열거할때 쓰는 것

        arrayList.add(new Object());
        arrayList.add(1);
        arrayList.add("문자");


        linkedList = new LinkedList(); //추가 와 삭제에 용이하게 하기 위해

        linkedList.add(1);
        linkedList.add(new Object());
        linkedList.add("dd");

        stack = new Stack(); //FILO 를 구현하기위해 쓰는 것

        stack.add(33);


        for(int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);

            if(o instanceof Integer) {
                int num = (int) o;

//                System.out.println(num);
            }

        }

        HashSet set = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();

        set.add(3);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(55);
        set.add(55);
        set.add(755);
        set.add(565);
        set.add(555);

        Iterator it = set.iterator();

        while(it.hasNext()) {
            int num = (int) it.next();
//            System.out.println(num);
        }

//        test(stack);


        HashMap map = new HashMap();

        map.put(1, new Object());
        map.put("2", new Object());
        map.put(0.1, new Object());
        map.put(arrayList, 3);

        Iterator mit = map.keySet().iterator();

        while(mit.hasNext()) {
            Object key = mit.next();


        }
    }

    public static void test(List list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
