package com.poc.java.comcast;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.comcast.csv.interview.problems.MemeComp;
import com.poc.java.comcast.entity.Meme;

public class MemeTest {
	
	
	@Before
	public void startup(){
		System.out.println("Start Unit test");
	}
	
	@Test
    public void testEmployeeSorting(){
        Meme e1 = new Meme("comcast1", 2000, new String[] { "developer","UI" });
        Meme e2 = new Meme("comcast2", 2001, new String[] { "developer","UX"});
        Meme e3 = new Meme("comcast1", 2002, new String[] { "developer","backend" });
        
      
        List<Meme> listOfEmployees = new ArrayList<Meme>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        System.out.println("Unsorted List : " + listOfEmployees);
      
        Collections.sort(listOfEmployees, new MemeComp());
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(1));
        assertEquals(e3, listOfEmployees.get(2));
    }
	
	@After
	public void tearDown(){
		System.out.println("over");
	}


}
