/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.parser;

import xyz._5th.voop.block.Block;
import xyz._5th.voop.block.Obj;
import xyz._5th.voop.token.Tokenizer;

/**
 * Project: Voop
 * 
 * File: ObjParser.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class ObjParser extends Parser<Obj> {

	@Override
	public boolean shouldParse(String line) {
		return line.matches("obj [a-zA-Z][a-zA-Z0-9]*");
	}

	@Override
	public Obj parse(Block superBlock, Tokenizer tokenizer) {
		tokenizer.nextToken(); //Skip obj token.
		String name = tokenizer.nextToken().getToken(); //Gets String value of next token. (name of obj)
		return new Obj(name);
	}
	
	
}
