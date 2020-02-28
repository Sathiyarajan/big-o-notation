package com.java.generics.benchmark;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsBigOBenchMark {

	private static final HashMap<Integer, String> HashMapOneMillion = new HashMap<>();
	private static final TreeMap<Integer, String> TreeMapOneMillion = new TreeMap<>();
	private static final LinkedHashMap<Integer, String> LinkedHashMapOneMillion = new LinkedHashMap<>();
	private static final HashMap<Integer, String> HashMapTenMillion = new HashMap<>();
	private static final TreeMap<Integer, String> TreeMapTenMillion = new TreeMap<>();
	private static final LinkedHashMap<Integer, String> LinkedHashMapTenMillion = new LinkedHashMap<>();

	public static void main(String args[]) {
		System.out.println("-------------------------------------------------");
		hashMapCreateOneMillion();
		treeMapCreateOneMillion();
		linkedHashMapCreateOneMillion();
		System.out.println("-------------------------------------------------");
		hashMapCreateTenMillion();
		treeMapCreateTenMillion();
		linkedHashMapCreateTenMillion();
		System.out.println("-------------------------------------------------");
		hashMapReadOneMillion();
		treeMapReadOneMillion();
		linkedHashMapReadOneMillion();
		System.out.println("-------------------------------------------------");
		hashMapReadTenMillion();
		treeMapReadTenMillion();
		linkedHashMapReadTenMillion();
		System.out.println("-------------------------------------------------");
		hashMapUpdateOneMillion();
		treeMapUpdateOneMillion();
		linkedHashMapUpdateOneMillion();
		System.out.println("-------------------------------------------------");
		hashMapUpdateTenMillion();
		treeMapUpdateTenMillion();
		linkedHashMapUpdateTenMillion();
		System.out.println("-------------------------------------------------");
		hashMapDeleteOneMillion();
		treeMapDeleteOneMillion();
		linkedHashMapDeleteOneMillion();
		System.out.println("-------------------------------------------------");
		hashMapDeleteTenMillion();
		treeMapDeleteTenMillion();
		linkedHashMapDeleteTenMillion();
	}

	public static void hashMapCreateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 1000000; i++) {
			HashMapOneMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap create 1 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ HashMapOneMillion.size());
	}

	public static void treeMapCreateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 1000000; i++) {
			TreeMapOneMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap create 1 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ TreeMapOneMillion.size());
	}

	public static void linkedHashMapCreateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 1000000; i++) {
			LinkedHashMapOneMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap create 1 million execution time: " + (endTime - startTime)
				+ "ms. Current size: " + LinkedHashMapOneMillion.size());
	}

	public static void hashMapCreateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 10000000; i++) {
			HashMapTenMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap create 10 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ HashMapTenMillion.size());
	}

	public static void treeMapCreateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 10000000; i++) {
			TreeMapTenMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap create 10 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ TreeMapTenMillion.size());
	}

	public static void linkedHashMapCreateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String value = "temp value";
		for (int i = 0; i < 10000000; i++) {
			LinkedHashMapTenMillion.put(i, value);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap create 10 million execution time: " + (endTime - startTime)
				+ "ms. Current size: " + LinkedHashMapTenMillion.size());
	}

	public static void hashMapReadOneMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < HashMapOneMillion.size(); i++) {
			lastValue = HashMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \""
				+ lastValue + "\"");
	}

	public static void treeMapReadOneMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < TreeMapOneMillion.size(); i++) {
			lastValue = TreeMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \""
				+ lastValue + "\"");
	}

	public static void linkedHashMapReadOneMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < LinkedHashMapOneMillion.size(); i++) {
			lastValue = LinkedHashMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap read 1 million execution time: " + (endTime - startTime)
				+ "ms. Last value: \"" + lastValue + "\"");
	}

	public static void hashMapReadTenMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < HashMapTenMillion.size(); i++) {
			lastValue = HashMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \""
				+ lastValue + "\"");
	}

	public static void treeMapReadTenMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < TreeMapTenMillion.size(); i++) {
			lastValue = TreeMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \""
				+ lastValue + "\"");
	}

	public static void linkedHashMapReadTenMillion() {
		Long startTime = System.currentTimeMillis();
		String lastValue = "No values read.";
		for (int i = 0; i < LinkedHashMapTenMillion.size(); i++) {
			lastValue = LinkedHashMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap read 10 million execution time: " + (endTime - startTime)
				+ "ms. Last value: \"" + lastValue + "\"");
	}

	public static void hashMapUpdateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < HashMapOneMillion.size(); i++) {
			HashMapOneMillion.put(i, "updated temp value");
			updatedValue = HashMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap update 1 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void treeMapUpdateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < TreeMapOneMillion.size(); i++) {
			TreeMapOneMillion.put(i, "updated temp value");
			updatedValue = TreeMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap update 1 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void linkedHashMapUpdateOneMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < TreeMapOneMillion.size(); i++) {
			LinkedHashMapOneMillion.put(i, "updated temp value");
			updatedValue = LinkedHashMapOneMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap update 1 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void hashMapUpdateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < HashMapTenMillion.size(); i++) {
			HashMapTenMillion.put(i, "updated temp value");
			updatedValue = HashMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap update 10 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void treeMapUpdateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < TreeMapTenMillion.size(); i++) {
			TreeMapTenMillion.put(i, "updated temp value");
			updatedValue = TreeMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap update 10 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void linkedHashMapUpdateTenMillion() {
		Long startTime = System.currentTimeMillis();
		String updatedValue = "No values updated.";
		for (int i = 0; i < LinkedHashMapTenMillion.size(); i++) {
			LinkedHashMapTenMillion.put(i, "updated temp value");
			updatedValue = LinkedHashMapTenMillion.get(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap update 10 million execution time: " + (endTime - startTime)
				+ "ms. Last updated value: \"" + updatedValue + "\"");
	}

	public static void hashMapDeleteOneMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			HashMapOneMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ HashMapOneMillion.size());
	}

	public static void treeMapDeleteOneMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			TreeMapOneMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ TreeMapOneMillion.size());
	}

	public static void linkedHashMapDeleteOneMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			LinkedHashMapOneMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap delete 1 million execution time: " + (endTime - startTime)
				+ "ms. Current size: " + LinkedHashMapOneMillion.size());
	}

	public static void hashMapDeleteTenMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			HashMapTenMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashMap delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ HashMapTenMillion.size());
	}

	public static void treeMapDeleteTenMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			TreeMapTenMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeMap delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: "
				+ TreeMapTenMillion.size());
	}

	public static void linkedHashMapDeleteTenMillion() {
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			LinkedHashMapTenMillion.remove(i);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("LinkedHashMap delete 10 million execution time: " + (endTime - startTime)
				+ "ms. Current size: " + LinkedHashMapTenMillion.size());
	}

}
