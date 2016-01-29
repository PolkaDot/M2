package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob & Arsh Momin
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
		if (input.length() == 0) {
			return input;
		} else {
			String ans = input;
		  	for (int x = 0; x < 2; x++) {
		  		Character first = ans.charAt(x);
		  		ans = ans + first;
		  	}
		  	ans = ans.substring(2);
		  	return ans;
		}
		
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	
	// public static void main(String[] args) {
	// 	Person5 arsh = new Person5("Arsh");
	// 	System.out.println(arsh);
	// }

}
