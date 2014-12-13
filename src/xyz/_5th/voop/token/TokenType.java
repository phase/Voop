/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.token;

/**
 * Project: Voop
 * 
 * File: TokenType.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public enum TokenType {
	
	TOKEN, //A Token: ( ) = * / 
	IDENTIFIER, //Name of something (Method, variable)
	INTEGER_LITERAL, //A number
	STRING_LITERAL, //Anything in quotes "Hello world!"
	EMPTY //Nothing!
}
