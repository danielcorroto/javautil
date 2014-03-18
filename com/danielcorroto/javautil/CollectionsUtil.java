package com.danielcorroto.javautil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsUtil {
	public static List<String> arrayToList(String[] array) {
		return Arrays.asList(array);
	}

	public static String[] listToArray(List<String> list) {
		return (String[]) list.toArray(new String[] {});
	}

	public static Set<String> listToSet(List<String> list) {
		return new HashSet<String>(list);
	}

	public static List<String> setToList(Set<String> set) {
		return new ArrayList<String>(set);
	}

}
