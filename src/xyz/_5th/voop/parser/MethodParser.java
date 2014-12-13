/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.parser;

import java.util.ArrayList;

import xyz._5th.voop.Parameter;
import xyz._5th.voop.VarType;
import xyz._5th.voop.block.Block;
import xyz._5th.voop.block.Method;
import xyz._5th.voop.token.Token;
import xyz._5th.voop.token.Tokenizer;

/**
 * Project: Voop
 * 
 * File: MethodParser.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class MethodParser extends Parser<Method> {

	@Override
	public boolean shouldParse(String line) {
		//                   method Identifier                 Parameters                                         and is a VarType
		return line.matches("method [a-zA-Z][a-zA-Z0-9]* takes \\(([a-zA-Z][a-zA-Z0-9]* [a-zA-Z][a-zA-Z0-9]*)*\\) and is a [a-zA-Z][a-zA-Z0-9]*");
	}

	@Override
	public Method parse(Block superBlock, Tokenizer tokenizer) {
		tokenizer.nextToken(); //Skips 'method' token
		
		String name = tokenizer.nextToken().getToken();
		
		tokenizer.nextToken(2); //Skips 'takes' and '(' tokens
		
		Token first = tokenizer.nextToken();
		ArrayList<Parameter> p = new ArrayList<Parameter>();
		
		if(!first.getToken().equalsIgnoreCase(")")){ //Checks if there are parameters in the method.
			String[] paramData = new String[] {first.getToken(), null}; //0 = type, 1 = value;
			while(tokenizer.hasNextToken()){
				Token token = tokenizer.nextToken();
				if(token.getToken().equals(")")) break;
				if(paramData[0] == null){
					paramData[0] = token.getToken();
				}else{
					paramData[1] = token.getToken();
					p.add(new Parameter(VarType.valueOf(paramData[0].toUpperCase()), paramData[1]));
					paramData = new String[2];
				}
			}
		}
		tokenizer.nextToken(3); //Skips 'and', 'is', and 'a' tokens
		VarType returnType = VarType.valueOf(tokenizer.nextToken().getToken().toUpperCase());
		return new Method(superBlock, name, returnType, p.toArray(new Parameter[p.size()]));
	}

}
