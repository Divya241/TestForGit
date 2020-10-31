package com.List;

import jdk.nashorn.internal.objects.NativeArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Object> li=new ArrayList();
        li.add("Divya");
        li.add(1234);
        li.add(243.4234);
        li.add(true);
        li.add(66152376158716l);
        System.out.println(li.size());
        for (int i=0;i<li.size();i++){
            System.out.println("Using for: "+li.get(i));
        }
        for (Object x:li) {
            System.out.println("using foreach "+x);
        }
        Iterator<Object> i = li.iterator();
        while(i.hasNext()){
            System.out.println("Using iterator :"+i.next());
        }
        ArrayList<Integer> li2=new ArrayList<>();
        li2.add(11);
        li2.add(22);
        li.addAll(2,li2);
        System.out.println(li);

    }
}
