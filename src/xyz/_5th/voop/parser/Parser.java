/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.parser;

import xyz._5th.voop.block.Block;
import xyz._5th.voop.token.Tokenizer;

/**
 * Project: Voop
 * 
 * File: Parser.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public abstract class Parser<T extends Block> {
	
	/**
	 * Takes a line and checks to see if it should parse it.
	 * @param line = line to parse
	 * @return should it parse?
	 */
	public abstract boolean shouldParse(String line);
	
	/**
	 * Take the super block and the tokenizer for the line and return a block of this parser's type.
	 * @param superBlock = Block above this block
	 * @param tokenizer = Tokenizer for line
	 * @return
	 */
	public abstract T parse(Block superBlock, Tokenizer tokenizer);
}
