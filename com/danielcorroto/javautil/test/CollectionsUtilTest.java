package com.danielcorroto.javautil.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.danielcorroto.javautil.CollectionsUtil;

public class CollectionsUtilTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	@Test
	public void testListToArray() {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		String[] array = CollectionsUtil.listToArray(list);
		assertEquals("listToArray size", 2, array.length);
		assertEquals("listToArray aa", "aa", array[0]);
		assertEquals("listToArray bb", "bb", array[1]);
	}

	@Test
	public void testListToSet() {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		Set<String> set = CollectionsUtil.listToSet(list);
		assertEquals("listToSet size", 2, set.size());
		assertTrue("listToSet aa", set.contains("aa"));
		assertTrue("listToSet bb", set.contains("bb"));
	}

	@Test
	public void testSetToList() {
		Set<String> set = new HashSet<String>();
		set.add("aa");
		set.add("bb");
		List<String> list = CollectionsUtil.setToList(set);
		assertEquals("setToList size", 2, set.size());
		assertTrue("setToList aa", list.contains("aa"));
		assertTrue("setToList bb", list.contains("bb"));
	}
}
