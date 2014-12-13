/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop;

import xyz._5th.voop.block.Block;

/**
 * Project: Voop
 * 
 * File: Variable.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Variable extends Value {

	private String name;
	private Block block;
	
	public Variable(Block b, VarType t, String n, Object v) {
		super(t, v);
		this.block = b;
		this.name = n;
	}

	public Block getBlock(){
		return block;
	}
	
	public String getName(){
		return name;
	}
}
