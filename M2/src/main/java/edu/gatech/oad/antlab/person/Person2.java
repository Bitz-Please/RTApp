package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  	int randOne;
	  	int randTwo;
		char[] characters = new char[input.length()];
		for (int i = 0; i < characters.length; i++) {
			characters[i] = input.charAt(i);
		}
		for (int i = 0; i < input.length() * 5; i++) {
			randOne = (int) (Math.random() * input.length());
			randTwo = (int) (Math.random() * input.length());
			char temp = characters[randOne];
			characters[randOne] = characters[randTwo];
			characters[randTwo] = temp;
		}
		input = "";
		for (int i = 0; i < characters.length; i++) {
			input += characters[i];
		}
	 	return input;
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
