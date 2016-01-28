package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person1(String pname) {
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
      //Person 1 put your implementation here


        if (input.length() <= 2) {
            return input;
        } 
        String endToFront = input.substring(2, input.length());
        String frontToEnd = input.substring(0, 2);
        return endToFront + frontToEnd;
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

 //   public static void main(String[] args) {
    //  Person1 p1 = new Person1("gtg123b");
    //  System.out.println("p1: " + p1.calc(p1.name));
    //  Person1 p2 = new Person1("");
    //  System.out.println("p2: " + p2.calc(p2.name));
    //  Person1 p3 = new Person1("3");
    //  System.out.println("p3: " + p3.calc(p3.name));
    //  Person1 p4 = new Person1("pd");
    //  System.out.println("p4: " + p4.calc(p4.name));
    // }

}
