/**
 * This file may be open source, 
 * but that does not mean you own it. 
 * Contact me at https://github.com/Phasesaber .
 */
package xyz._5th.voop.token;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project: Voop
 * 
 * File: Tokenizer.java
 * 
 * @author Phase(Jadon Fowler) on Dec 12, 2014
 */
public class Tokenizer {

	private ArrayList<TokenData> tokenDatas;

	private String str;

	private Token lastToken;
	private boolean pushBack;

	public Tokenizer(String s) {
		str = s;
		tokenDatas = new ArrayList<TokenData>();
		tokenDatas.add(new TokenData(Pattern.compile("^([a-zA-z][a-zA-z0-9]*)"),
				TokenType.IDENTIFIER));
		tokenDatas.add(new TokenData(Pattern.compile("^((-)?[0-9]+)"),
				TokenType.INTEGER_LITERAL));
		tokenDatas.add(new TokenData(Pattern.compile("^(\".*\")"),
				TokenType.STRING_LITERAL));
		tokenDatas.add(new TokenData(Pattern.compile("^('.*')"),
				TokenType.STRING_LITERAL));
		for (String t : new String[] { "=", "\\(", "\\)", "\\.", "\\," })
			tokenDatas.add(new TokenData(Pattern.compile("^(" + t + ")"), TokenType.TOKEN));
	}
	
	public void nextToken(int i) {
		while(i > 0){
			i--;
			nextToken();
		}
	}
	
	public Token nextToken() {
		str = str.trim();
		if (pushBack) {
			pushBack = false;
			return lastToken;
		}
		if (str.isEmpty())
			return (lastToken = new Token("", TokenType.EMPTY));
		for (TokenData data : tokenDatas) {
			Matcher m = data.getPattern().matcher(str);
			if (m.find()) {
				String token = m.group().trim();
				str = m.replaceFirst("");
				if (data.getType() == TokenType.STRING_LITERAL)
					return (lastToken = new Token(token.substring(1,
							token.length() - 1), TokenType.STRING_LITERAL));
				else
					return (lastToken = new Token(token, data.getType()));
			}
		}
		throw new IllegalStateException("Could not parse: " + str);
	}

	public boolean hasNextToken() {
		return !str.isEmpty();
	}

	public void pushBack() {
		if (lastToken != null)
			pushBack = true;
	}

}
