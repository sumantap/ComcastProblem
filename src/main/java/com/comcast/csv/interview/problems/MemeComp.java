package com.comcast.csv.interview.problems;

import java.util.Comparator;

import com.poc.java.comcast.entity.Meme;

public class MemeComp implements Comparator<Meme>{

	public int compare(Meme o1, Meme o2) {
		// TODO Auto-generated method stub
		if(o1.getYear() > o2.getYear()){
			return 1;
		}
		return -1;
	}

}
