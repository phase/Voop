/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.token;

import java.util.regex.Pattern;

/**
 * Project: Voop
 * 
 * File: TokenData.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class TokenData {
	
	private Pattern pattern;
	private TokenType type;
	
	public TokenData(Pattern p, TokenType t){
		pattern = p;
		this.type = t;
	}
	
	public Pattern getPattern(){
		return pattern;
	}
	
	public TokenType getType(){
		return type;
	}
	
}
