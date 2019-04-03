package com.company;

import java.util.*;

public class CollectionTraining {

    private static class ObjDummy {
        int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "ObjDummy{" +
                    "a=" + a +
                    '}';
        }
    }

    public static void main(String[] args) {
//
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Green");
        // best // worst
        // O(1) -> O(n)
        list.add("White");

        System.out.println(list);

        list.add(1, "Black");

        System.out.println(list);

        list.set(1, "Pink");

        System.out.println(list);

        System.out.println(list);

        System.out.println(list.indexOf("Green"));
        System.out.println(list.lastIndexOf("Green"));


        // O(n)
        System.out.println(list.contains("Brown"));
        System.out.println(list.contains("White"));

        System.out.println(list.isEmpty());

        // O(1)
        System.out.println(list.get(2));

        System.out.println(list.size());


        // multiple operations
        List<String> l2 = Arrays.asList("Lime", "Gray");
        // A [1,2,3]
        // B [3,4,5]
        // C [6,7,8]
        // D [2]

        // A U B = [1,2,3,4,5]
        // A ^ B = [3]
        // A ^ C = O
        // A / B = [1,2]
        // D c A
        System.out.println(list.addAll(l2));

        System.out.println(list.containsAll(l2));

        System.out.println(list.removeAll(l2));

        System.out.println(list.containsAll(l2));

        System.out.println("==========================================");
        System.out.println(list.addAll(l2));
        System.out.println(list);

        System.out.println(list.retainAll(list));
        System.out.println(list);

        System.out.println(list.removeAll(l2));
        System.out.println(list);

        System.out.println(list.remove("White"));
        System.out.println(list.remove("Whitesmoke"));

        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);

        // [1, 3] -> 1, 2, 3 - inclusive
        // (1, 3) -> 2 - exclusive
        System.out.println(list.subList(1, 3));
        System.out.println(list);

        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("==========================================");
        Iterator<String> a = list.iterator();

        while (a.hasNext()) {
            String aa = a.next();
            if ("Yellow".equals(aa)) {
                a.remove();
            }
        }

        System.out.println(list);


    }

    //dz


    // 1 union(list<object>, list<object>) ->
    // 2 minus(list A, list B) -> A \ B -> A - B, A elements without elements of B
    // 3 intersection (list A, list B) -> A ^ B
    // 4 contain (list A, list B) -> int
    // contain == 0 -> A c= B , A =[1,2] , B= [2,1], A isn't empty and B is empty
    // contain == 1 -> B c A
    // contain == -1 -> A c B

    // 5 outerWithoutIntersection
    // A U B / A ^ B
    // A = [1,2]
    // B = [2, 3]
    // A = [1,2,3] / [2] -> [1,3]















}
