package com;

import java.util.*;

public class arraytoarraylist {
    public static void main(String args[]) {

        ArrayList<String> l=new ArrayList();
        l.add("apple");
        l.add("banana");
        l.add("guava");
        l.add("pineapple");
        String[] arr=new String[l.size()];
        arr=l.toArray(arr);

        System.out.println(Arrays.toString(arr));
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }



        Collections.addAll(l,arr);

        for(int i=0;i<l.size();i++) {
            System.out.print(l.get(i)+" ");
        }



    }
}