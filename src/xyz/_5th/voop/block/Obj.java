/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.block;

/**
 * Project: Voop
 * 
 * File: Obj.java
 * 
 * Represents a "class" or "Object"
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Obj extends Block{

	private String name;
	
	public Obj(String name) {
		super(null);
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void run() {
		//TODO Run 'main' method!
	}
}
