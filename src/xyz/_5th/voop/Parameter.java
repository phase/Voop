/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop;

/**
 * Project: Voop
 * 
 * File: Parameter.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Parameter {
	
	private String name;
	private VarType type;
	
	public Parameter(VarType type, String name){
		this.type = type;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public VarType getType(){
		return type;
	}
}
