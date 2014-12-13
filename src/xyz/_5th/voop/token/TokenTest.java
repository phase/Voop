/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.token;

/**
 * Project: Voop
 * 
 * File: TokenTest.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class TokenTest {
	
	public static void main(String... ares){
		String code = "class test\n" + "m main r ()\n" + "echo \"Hello\"";
		Tokenizer t = new Tokenizer(code);
		while(t.hasNextToken()){
			System.out.println(t.nextToken().getToken());
		}
	}
	
}
