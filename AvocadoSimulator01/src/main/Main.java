/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	enum myEnum {A,B,C,D};	// Demo of enumerated date type

	public static void main(String[] args) {
		
		Avocado bob = new Avocado("green", Avocado.enumCondition.ok , 7);
		
		/*myEnum e = myEnum.A;
		System.out.println(e.toString());
*/
		
	}
}
