package preppackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class IntegratingScripts {
public static void main(String[] args){
//	ScriptEngineManager senginemanager = new ScriptEngineManager();
//	List<ScriptEngineFactory> enginenames = senginemanager.getEngineFactories();
//	Consumer<ScriptEngineFactory> scriptenginename = (ScriptEngineFactory se)-> System.out.println(se.toString()); 
//	enginenames.forEach(scriptenginename);
	
List<String> names = new ArrayList<>();
names.add("venkat");
names.add("mangina");
names.add("ravindranath");
names.add("sri rama");

Consumer<String> nameslist = (String s)->System.out.println(s);

names.forEach(nameslist);
Stream<String> namesstring = names.stream().distinct().sorted();
List<String> employeelist = namesstring.filter(predicate()).collect(Collectors.<String>toList());

System.out.println(employeelist);
}

public static Predicate<String> predicate(){
	return p-> p.equals("venkat");
}
}
