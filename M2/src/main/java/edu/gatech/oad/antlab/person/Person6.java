package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 6
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person6 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person6(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters with first
         * and last character swapped.
	 * given "gtg123b" it should return
	 * "btg123g".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        StringBuilder result = new StringBuilder(input);
        char a = input.charAt(0);
        char b = input.charAt(input.length() - 1);
        result.setCharAt(0, b);
        result.setCharAt(input.length() - 1, a);
        return result.toString();
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

}
