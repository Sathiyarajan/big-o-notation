package com.java.generics.benchmark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListsBigOBenchMark {

    private static ArrayList<Integer> ArrayListOneMillion = new ArrayList<>();
    private static Stack<Integer> StackOneMillion = new Stack<>();
    private static LinkedList<Integer> LinkedListOneMillion = new LinkedList<>();
    private static ArrayList<Integer> ArrayListTenMillion = new ArrayList<>();
    private static Stack<Integer> StackTenMillion = new Stack<>();
    private static LinkedList<Integer> LinkedListTenMillion = new LinkedList<>();

    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        arrayListCreateOneMillion();
        stackCreateOneMillion();
        linkedListCreateOneMillion();
        System.out.println("-------------------------------------------------");
        arrayListCreateTenMillion();
        stackCreateTenMillion();
        linkedListCreateTenMillion();
        System.out.println("-------------------------------------------------");
        arrayListReadoneMillion();
        stackReadOneMillion();
        linkedListReadOneMillion();
        System.out.println("-------------------------------------------------");
        arrayListReadTenMillion();
        stackReadTenMillion();
        linkedListReadTenMillion();
        System.out.println("-------------------------------------------------");
        arrayListUpdateOneMillion();
        stackUpdateOneMillion();
        linkedListUpdateOneMillion();
        System.out.println("-------------------------------------------------");
        arrayListUpdateTenMillion();
        stackUpdateTenMillion();
        linkedListUpdateTenMillion();
        System.out.println("-------------------------------------------------");
        arrayListDeleteOneMillion();
        stackDeleteOneMillion();
        linkedListDeleteOneMillion();
        System.out.println("-------------------------------------------------");
        arrayListDeleteTenMillion();
        stackDeleteTenMillion();
        linkedListDeleteTenMillion();
    }

    public static void arrayListCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ArrayListOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayListOneMillion.size());
    }

    public static void stackCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            StackOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + StackOneMillion.size());
    }

    public static void linkedListCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedListOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedListOneMillion.size());
    }

    public static void arrayListCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            ArrayListTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayListTenMillion.size());
    }

    public static void stackCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            StackTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + StackTenMillion.size());
    }

    public static void linkedListCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedListTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedListTenMillion.size());
    }

    public static void arrayListReadoneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = ArrayListOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void stackReadOneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = StackOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void linkedListReadOneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = LinkedListOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void arrayListReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = ArrayListTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void stackReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = StackTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void linkedListReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator<Integer> iterator = LinkedListTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void arrayListUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = ArrayListOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newArrayList.add(updatedValue);
            updatedValue++;
        }
        ArrayListOneMillion = newArrayList;
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void stackUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        Stack<Integer> newStack = new Stack<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = StackOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newStack.add(updatedValue);
            updatedValue++;
        }
        StackOneMillion = newStack;
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void linkedListUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedListOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedList.add(updatedValue);
            updatedValue++;
        }
        LinkedListOneMillion = newLinkedList;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void arrayListUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = ArrayListTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newArrayList.add(updatedValue);
            updatedValue++;
        }
        ArrayListTenMillion = newArrayList;
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void stackUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        Stack<Integer> newStack = new Stack<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = StackTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newStack.add(updatedValue);
            updatedValue++;
        }
        StackTenMillion = newStack;
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void linkedListUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedListTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedList.add(updatedValue);
            updatedValue++;
        }
        LinkedListTenMillion = newLinkedList;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void arrayListDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < ArrayListOneMillion.size(); i++) {
            ArrayListOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayListOneMillion.size());
    }

    public static void stackDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < StackOneMillion.size(); i++) {
            StackOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + StackOneMillion.size());
    }

    public static void linkedListDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < LinkedListOneMillion.size(); i++) {
            LinkedListOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedListOneMillion.size());
    }

    public static void arrayListDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < ArrayListTenMillion.size(); i++) {
            ArrayListTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayListTenMillion.size());
    }

    public static void stackDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < StackTenMillion.size(); i++) {
            StackTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + StackTenMillion.size());
    }

    public static void linkedListDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < LinkedListTenMillion.size(); i++) {
            LinkedListTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedListTenMillion.size());
    }

}
