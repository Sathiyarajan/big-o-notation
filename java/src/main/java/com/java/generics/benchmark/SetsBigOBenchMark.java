package com.java.generics.benchmark;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsBigOBenchMark {

    private static HashSet<Integer> HashSetOneMillion = new HashSet<>();
    private static TreeSet<Integer> TreeSetOneMillion = new TreeSet<>();
    private static LinkedHashSet<Integer> LinkedHashSetOneMillion = new LinkedHashSet<>();
    private static HashSet<Integer> HashSetTenMillion = new HashSet<>();
    private static TreeSet<Integer> TreeSetTenMillion = new TreeSet<>();
    private static LinkedHashSet<Integer> LinkedHashSetTenMillion = new LinkedHashSet<>();

    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        hashSetCreateOneMillion();
        treeSetCreateOneMillion();
        linkedHashSetCreateOneMillion();
        System.out.println("-------------------------------------------------");
        hashSetCreateTenMillion();
        treeSetCreateTenMillion();
        linkedHashSetCreateTenMillion();
        System.out.println("-------------------------------------------------");
        hashSetReadOneMillion();
        treeSetReadOneMillion();
        linkedHashSetReadOneMillion();
        System.out.println("-------------------------------------------------");
        hashSetReadTenMillion();
        treeSetReadTenMillion();
        linkedHashSetReadTenMillion();
        System.out.println("-------------------------------------------------");
        hashSetUpdateOneMillion();
        treeSetUpdateOneMillion();
        linkedHashSetUpdateOneMillion();
        System.out.println("-------------------------------------------------");
        hashSetUpdateTenMillion();
        treeSetUpdateTenMillion();
        linkedHashSetUpdateTenMillion();
        System.out.println("-------------------------------------------------");
        hashSetDeleteOneMillion();
        treeSetDeleteOneMillion();
        linkedHashSetDeleteOneMillion();
        System.out.println("-------------------------------------------------");
        hashSetDeleteTenMillion();
        treeSetDeleteTenMillion();
        linkedHashSetDeleteTenMillion();
    }

    public static void hashSetCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            HashSetOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSetOneMillion.size());
    }

    public static void treeSetCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            TreeSetOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSetOneMillion.size());
    }

    public static void linkedHashSetCreateOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedHashSetOneMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSetOneMillion.size());
    }

    public static void hashSetCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            HashSetTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSetTenMillion.size());
    }

    public static void treeSetCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            TreeSetTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSetTenMillion.size());
    }

    public static void linkedHashSetCreateTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedHashSetTenMillion.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSetTenMillion.size());
    }

    public static void hashSetReadOneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = HashSetOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void treeSetReadOneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = TreeSetOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void linkedHashSetReadOneMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedHashSetOneMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void hashSetReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = HashSetTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void treeSetReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = TreeSetTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void linkedHashSetReadTenMillion() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedHashSetTenMillion.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void hashSetUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        HashSet<Integer> newHashSet = new HashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = HashSetOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newHashSet.add(updatedValue);
            updatedValue++;
        }
        HashSetOneMillion = newHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void treeSetUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = TreeSetOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newTreeSet.add(updatedValue);
            updatedValue++;
        }
        TreeSetOneMillion = newTreeSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void linkedHashSetUpdateOneMillion() {
        Long startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedHashSetOneMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedHashSet.add(updatedValue);
            updatedValue++;
        }
        LinkedHashSetOneMillion = newLinkedHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void hashSetUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        HashSet<Integer> newHashSet = new HashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = HashSetTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newHashSet.add(updatedValue);
            updatedValue++;
        }
        HashSetTenMillion = newHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void treeSetUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = TreeSetTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newTreeSet.add(updatedValue);
            updatedValue++;
        }
        TreeSetTenMillion = newTreeSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void linkedHashSetUpdateTenMillion() {
        Long startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedHashSetTenMillion.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedHashSet.add(updatedValue);
            updatedValue++;
        }
        LinkedHashSetTenMillion = newLinkedHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void hashSetDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            HashSetOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSetOneMillion.size());
    }

    public static void treeSetDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            TreeSetOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSetOneMillion.size());
    }

    public static void linkedHashSetDeleteOneMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedHashSetOneMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSetOneMillion.size());
    }

    public static void hashSetDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            HashSetTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSetTenMillion.size());
    }

    public static void treeSetDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            TreeSetTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSetTenMillion.size());
    }

    public static void linkedHashSetDeleteTenMillion() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedHashSetTenMillion.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSetTenMillion.size());
    }

}
