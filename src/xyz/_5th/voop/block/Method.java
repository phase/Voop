/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.block;

import xyz._5th.voop.Parameter;
import xyz._5th.voop.Value;
import xyz._5th.voop.VarType;

/**
 * Project: Voop
 * 
 * File: Method.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Method extends Block {
	
	private String name;
	private VarType type;
	private Parameter[] params;
	private Value returnValue;
	
	public Method(Block superBlock, String name, VarType type, Parameter[] pm) {
		super(superBlock);
		this.name = name;
		this.type = type;
		this.params = pm;
	}

	@Override
	public void run() {
		invoke();
	}
	
	/**
	 * Invoke method with values
	 * @param values
	 */
	public void invoke(Value... values){
		
	}
	
}
