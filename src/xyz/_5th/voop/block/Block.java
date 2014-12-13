/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.block;

import java.util.ArrayList;

import xyz._5th.voop.Variable;

/**
 * Project: Voop
 * 
 * File: Block.java
 * 
 * Represents a block of code, such as an if statement.
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public abstract class Block{

	private Block superBlock;
	private ArrayList<Block> subBlocks;
	private ArrayList<Variable> vars;
	
	public Block(Block superBlock){
		this.superBlock = superBlock;
		this.subBlocks = new ArrayList<Block>();
		this.vars = new ArrayList<Variable>();
	}
	
	public Variable getVariable(String name){
		for(Variable v : vars)
			if(v.getName().equals(name))
				return v;
		if(superBlock.containsVariable(name))
			return superBlock.getVariable(name);
		return null;
	}
	
	public boolean containsVariable(String name){
		return getVariable(name) != null;
	}
	
	public void addVariable(Variable v){
		vars.add(v);
	}
	
	public Block getSuperBlock(){
		return superBlock;
	}
	
	public void addBlock(Block b){
		subBlocks.add(b);
	}
	
	public abstract void run();
	
	
}
