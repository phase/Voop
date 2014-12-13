/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.parser;

import xyz._5th.voop.VarType;
import xyz._5th.voop.Variable;
import xyz._5th.voop.block.Block;
import xyz._5th.voop.token.Token;
import xyz._5th.voop.token.TokenType;
import xyz._5th.voop.token.Tokenizer;

/**
 * Project: Voop
 * 
 * File: VariableParser.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class VariableParser extends Parser<Block>{

	@Override
	public boolean shouldParse(String line) {
		return line.matches("[a-zA-Z]+ is a [a-zA-Z]+ (=|:) \"?[a-zA-Z0-9]\"?");
	}

	@Override
	public Block parse(Block superBlock, Tokenizer tokenizer) {
		
		String name = tokenizer.nextToken().getToken();
		tokenizer.nextToken(2); //Skips 'is a'
		VarType type = VarType.valueOf(tokenizer.nextToken().getToken());
		
		tokenizer.nextToken(); //Skips (=|:)
		
		Token value = tokenizer.nextToken();
		Object v;
		if(value.getType() == TokenType.INTEGER_LITERAL)
			v = Integer.valueOf(value.getToken());
		else if(value.getType() == TokenType.STRING_LITERAL)
			v = value.getToken();
		else
			v = superBlock.getVariable(value.getToken()).getValue();
		
		//Add this var to the Block
		superBlock.addVariable(new Variable(superBlock, type, name, value));
		return null;
	}

}
