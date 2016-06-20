package com.poc.java.comcast.entity;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Simple class used by various tests.
 */
public class Meme {

	@Override
	public String toString() {
		return "Meme [name=" + name + ", year=" + year + ", tags=" + Arrays.toString(tags) + "]";
	}

	private String name;
	private int year;
	private String[] tags;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the tags
	 */
	public String[] getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public Meme(String name, int year, String[] tags) {
		super();
		this.name = name;
		this.year = year;
		this.tags = tags;
	}

	public Meme(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	
}
