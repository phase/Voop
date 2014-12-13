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
	
	public static void main(String...args){
		String code = "class test\nmethod main takes (int bar, int far) and is a int";
		Tokenizer t = new Tokenizer(code);
		while(t.hasNextToken()){
			System.out.println(t.nextToken().getToken());
		}
	}
	
}
