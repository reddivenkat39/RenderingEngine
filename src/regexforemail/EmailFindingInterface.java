package regexforemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * The emailfindinginterface is to find emails in a given string
 * author : Venkata
 * Aim    : To find the email in String following facade pattern
 * 
 */
public abstract class EmailFindingInterface {
	public String findTheEmail(String actualString,String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(actualString);
		String stringtobreturned ="";
		
		while(match.find()){
			stringtobreturned = stringtobreturned+match.group(0);
		}
		return stringtobreturned;
		
	}
}
