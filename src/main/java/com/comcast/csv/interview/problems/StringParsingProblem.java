package com.comcast.csv.interview.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The following methods operate on street addresses in a particular format. The format contains the following components:
 * 
 *  1. Number of miles from the center of the city
 *  2. Primary direction from the city as a single lower-case letter
 *  3. Street number
 *  4. Street name (always a single word)
 *  5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2>
 * 25w873 Apple St.
 * 3n17 Special Ave.
 * 0e34800 Main St.
 */
public class StringParsingProblem {

	 
    public static void main(String[] args) {
		String str = "3n17 Special Ave";
		StringParsingProblem strpProb = new StringParsingProblem();
		System.out.println(strpProb.isAddressValid(str));
		System.out.println("the distance in miles from the center of the city from the given address---" + strpProb.getDistanceFromCityCenter(str));
		
	}
    
    /**
     * Returns true if the address is valid, otherwise false.
     * 
     * @param address the address to validate
     * @return true if the address is valid
     */
    public boolean isAddressValid(String address) {
    	 return address.matches( 
    	         "\\d+[a-zA-Z]+\\d+\\s[a-zA-Z]+\\s[a-zA-Z]+" );
    }
    
    /**
     * Get the distance in miles from the center of the city from the given address.
     * 
     * @param address the address
     * @return the distance
     */
    public int getDistanceFromCityCenter(String address) {
    	 Matcher matcher = Pattern.compile("\\d+").matcher(address);

         if (!matcher.find())
             throw new NumberFormatException("For input string [" + address + "]");

         return Integer.parseInt(matcher.group());
    }
   
}
