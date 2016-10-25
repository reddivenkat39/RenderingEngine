package renderingengine;

import java.util.List;
import java.util.stream.Collectors;

public abstract class RenderingImplementer implements HtmlRenderer{
@Override
public String simpleRender(String renderingstring){
	String divwithstring = "<div>"+renderingstring+"</div>";
	return divwithstring;
}
@Override
public String Formation(String id,String type,Object Content){
	PatternFindAndReplace findandreplace = new PatternFindAndReplace();
	String inputstring = "<input id='"+id+"' type='"+type+"' name='"+id+"' value='value123'>";
	if(type.equals("radio")){
		@SuppressWarnings("unchecked")
		List<String> array = (List<String>)Content;
		String totalRadiodiv = "";
		for(int i=0;i<array.size();i++){
		totalRadiodiv +=findandreplace.findAndReplace(inputstring, "value123",array.get(i))+array.get(i);
		totalRadiodiv+= "</input>\n<br>\n";
		}
		inputstring = totalRadiodiv;
		inputstring = "<div class='"+id+"class'>\n"+inputstring+"</div>";
		
	}
	
	else if(type.equals("dropdown")){
		String opentag = "<option id='"+id+"' value='value123'>value123</option>";
		@SuppressWarnings("unchecked")
		List<String> valuesarray = (List<String>)Content;
		String options ="";
		String dropdown =  valuesarray.stream().map(i->options+findandreplace.findAndReplace(opentag, "value123",i)).collect(Collectors.joining("<br>\n"));
		 inputstring = "<div class='"+id+"class'>\n<select>\n"+dropdown+"\n</select></div>\n";
	
	}
	
	else if(type.equals("text")||type.equals("button")||type.equals("password")||type.equals("email")){
		String name = (String)Content;
		String opentag = name+" :<input type='"+type+"' value='' name='name123' id='name123'></input><br>\n";
		inputstring = "<div class='"+id+"class'>\n"+findandreplace.findAndReplace(opentag, "name123",id)+"\n</div><br>\n";
		
	}
	
	else
	{
	inputstring = "null";
	}
	
	return inputstring;
}


public String finalHtml(String preparedString){
	String finalhtml = "<html><body>"+preparedString+"<body></html>";
	return finalhtml;
}

}
