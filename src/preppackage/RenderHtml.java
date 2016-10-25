package preppackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenderHtml implements Renderinghtml{

	@Override
	public List<String> makeStringintoList(String stringtobeconverted) {
		// TODO Auto-generated method stub
		return null;
	}

    public static void splitTheString(String line){
          
     Pattern pattern = Pattern.compile("a(.*?)b");
     Matcher match = pattern.matcher(line);
     
     if(match.find()){
     System.out.println(match.group(0));
     }
    }

    public static void main(String[] args){
    	String strintobeSplitted = "This order w a s placed forb QT3000! OK?";
    	splitTheString(strintobeSplitted);
    }

	
}
