/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop;

/**
 * Project: Voop
 * 
 * File: Value.java
 * 
 * Represents a value
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Value {
	
	private VarType type;
	private Object value;
	
	public Value(VarType t, Object v){
		type = t;
		value = v;
	}
	
	public VarType getType(){
		return type;
	}
	
	public Object getValue(){
		return value;
	}
	
	public void setValue(Object o){
		value = o;
	}
}
