/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.block;

/**
 * Project: Voop
 * 
 * File: Method.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Method extends Block {
	
	private String name;
	private Type type;
	private Parameter[] params;
	private Value returnValue;
	
	public Method(Block superBlock) {
		super(superBlock);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
