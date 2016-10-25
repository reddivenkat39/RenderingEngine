package renderingengine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindAndReplace {

	public String findthematchingWord(String actualString,String regex){
		Matcher match = Pattern.compile(regex).matcher(actualString);
		String matchingword= null;
		while(match.find()){
			matchingword = match.group(0);
		}
		return matchingword;
	}
	
	public String findAndReplace(String actualString,String find,String replace){
		String replacedString = actualString.replaceAll(find, replace);
		return replacedString;
	}
}
