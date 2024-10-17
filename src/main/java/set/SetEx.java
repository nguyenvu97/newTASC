package set;

import student.Student;

import java.util.*;

public class SetEx {
    public static final long NUMBER = 100000;
    public static void hashSet () {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains("d"));
        System.out.println(Arrays.toString(hashSet.toArray()));
        System.out.println(hashSet.remove("a"));

        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("a");
        hashSet1.add("d");
        hashSet.addAll(hashSet1);
        System.out.println(hashSet);// kq a,b,c,d

        System.out.println("hashSet.retainAll :"+hashSet.retainAll(hashSet1));
        System.out.println(hashSet); // kq a, d

        String a = "a";
        hashSet.remove(a);
        System.out.println(hashSet);

        hashSet1.clear();
        System.out.println(hashSet1);
        System.out.println(hashSet.equals(a));

//        treeSet();
        check_hashSet_linkedHashSet();
    }



    public static void check_hashSet_linkedHashSet(){
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> hashSet = new HashSet<>();
        //Add nhu nhau
        long startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            linkedHashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) + " ns");
        /*

        Tìm kếm  linkedHashSet nhanh nhat

        */

            //! hashset
        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains time: " + (endTime - startTime) + " ns");


        //! linkedHashSet
        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            linkedHashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("linkedHashSet contains time: " + (endTime - startTime) + " ns");
 /*

        Xoa hashSet nhanh nhat

        */
        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            linkedHashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) + " ns");
    }

    public static void treeSet(){
        Set<Student> tree_set = new TreeSet<>();
//        tree_set.add(null); Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
        tree_set.add(new Student(1,"name",10));
        tree_set.add(new Student(5,"name",10));
        tree_set.add(new Student(6,"name",10));
        tree_set.add(new Student(2,"name",10));
        tree_set.add(new Student(3,"name",10));

        System.out.println(tree_set); // [Student{id=6, name='name', age=10}, Student{id=5, name='name', age=10}, Student{id=3, name='name', age=10}, Student{id=2, name='name', age=10}, Student{id=1, name='name', age=10}]

    }





}
