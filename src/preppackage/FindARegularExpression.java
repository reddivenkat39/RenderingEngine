package preppackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FindARegularExpression implements RegularExpressionsIntereface{

	@Override
	public String findTheTarget(String actualString,String regex){
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match  = pattern.matcher(actualString);
		if(match.find()){
			return match.group(0);
		}
		else
		{
			return "null";
		}
	}
}


