package com.comcast.csv.interview.problems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.poc.java.comcast.entity.Meme;

public class LoopProblem {
	public static void main(String[] args) {
		List<Meme> linkedList = new LinkedList<Meme>();
		linkedList.add(new Meme("developer", 2001));
		linkedList.add(new Meme("Tester", 2001));
		linkedList.add(new Meme("Manager", 2001));

		// Using generics and the enhanced for-loop over a LinkedList of Object.
		for (Meme name : linkedList)
			System.out.println(name.getName() + ":" + name.getYear());

		// Using an Iterator to iterate over a LinkedList of Object.
		System.out.println("**Iterator**");
		Iterator i = linkedList.iterator();
		while (i.hasNext()) {
			Meme name = (Meme) i.next();
			System.out.println(name.getName() + ":" + name.getYear());
		}

		// for loop
		System.out.println("**For loop**");
		for (int num = 0; num < linkedList.size(); num++) {
			System.out.println(linkedList.get(num).getName() + ":" + linkedList.get(num).getYear());
		}

		//Iteration in Java 8 using the forEach() method
		System.out.println("**Java 8 foreach**");
		//linkedList.forEach( list -> System.out.println(list.getName()));

	}
}
