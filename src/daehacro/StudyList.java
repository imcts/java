package daehacro;

import java.util.*;

/**
 * Created by imcts on 2016. 9. 17..
 */
public class StudyList {
    public static void main(String[] args) {

//        List<Person> list = new ArrayList<Person>();
//        list.add(new Person("수진", 23, "없음"));
//        list.add(new Person("연종", 23, "음악감상"));
//        list.add(new Person("태산", 30, "하아..."));
//        list.add(new Person("은정", 28, "놀기"));
//
//        for(int i = 0; i < list.size(); i++) {
//            Person p = list.get(i);
//            System.out.println(p.getName());
//
//            int a = Integer.parseInt(p.getAge() + "");
//        }




        List<Person> list = new ArrayList<Person>(); //어레이리스트를 생성한다.
        list.add(new Person("수진", 23, "없음")); //리스트에 수진이라는 클래스를 생성하여 추가한다.
        list.add(new Person("연종", 23, "음악감상"));
        list.add(new Person("태산", 30, "하아..."));
        list.add(new Person("은정", 28, "놀기"));


        List<Integer> list2 = new ArrayList<>();
        list2.add(43);


        Map<String, List<Person>> map = new HashMap<String, List<Person>>(); //해쉬맵을 생성한다.
        map.put("frame", list);


        Iterator<String> it = map.keySet().iterator();


        while(it.hasNext()) {
            String key = it.next();

            List<Person> personList = map.get(key);

            for(int i = 0; i < personList.size(); i++) {
                Person student = personList.get(i);
                System.out.println(student.getName());
            }
        }

//        HashSet set = new HashSet();
//
//        set.add("수지니 졸지마");
//        set.add("수지니 졸지마");
//        set.add("뭬렁 ~ 스택 아니지렁 ~ ");
//        set.add(3);
//        set.add(31);
//        set.add(32);
//        set.add(33);
//        set.add(34);
//        set.add(35);
//        set.add(36);
//        set.add(37);
//        set.add(38);
//        set.add(5);
//
//        ConditionAndIterator it = set.iterator();
//
//        while(it.hasNext())
//            System.out.println(it.next());


        //한번더 뽑아냈자나
//        it = set.iterator();
//
//        System.out.println(it.next());
//        System.out.println(it.next());


//        ArrayList list = new ArrayList();
//        list.add("문자열");
//        list.add(3);
//        list.add(5L);
//        list.add(5.3f);
//
//
//        for(int i = 0; i < list.size(); i++)
//            System.out.println(list.get(i));
//
//        Object [] arr = new Object[4];
//        arr[0] = "문자열";
//        arr[1] = 3;
//        arr[2] = 5L;
//        arr[3] = 5.3f;
//
//        for(int i = 0; i < arr.length; i++)
//            System.out.println(arr[i]);
//
//        Person sujin = new Person("수진", 23, "없음");
//        Person yeonJong = new Person("연종", 23, "없음");
//        yeonJong.setFriend(sujin);
//
//
//        System.out.println(sujin.toString() );
//        System.out.println(sujin.getSelf());
//        System.out.println(yeonJong.getFriend());
//
//
//
    }
}
