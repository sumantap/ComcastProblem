package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.poc.java.comcast.entity.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {

	public void sort(List<Meme> memes, boolean ascending) {
		// TODO Auto-generated method stub
		//Sorting the List collection object based on year in ascending order
		Collections.sort(memes, new MemeComp());
		System.out.println("Sorted list entries: ");
		for (Meme e : memes) {
			if(!ascending)
			System.out.println(e);
		}

	}
	
	public static void main(String[] args) {
		boolean asc = false;
		CollectionsProblemImpl comcast = new CollectionsProblemImpl();
		List<Meme> list = new ArrayList<Meme>();
		
		list.add(new Meme("comcast1", 2000, new String[] { "developer","UI" }));
		list.add(new Meme("comcast2", 2001, new String[] { "developer","UX"}));
		list.add(new Meme("comcast1", 2002, new String[] { "developer","backend" }));
		
		comcast.sort(list, asc);

	}

	public void addTag(List<Meme> memes, String tag) {
		// TODO Auto-generated method stub
		//did not require as tags are taken care through meme parameterized consructor
	}

}
