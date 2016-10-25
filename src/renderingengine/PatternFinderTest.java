package renderingengine;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternFinderTest {

	PatternFindAndReplace patternreplace = new PatternFindAndReplace();
	String regex = "venkat";
	
//	@Test
//	public void testpattern(){
//		
//		assertEquals("venkat",patternfinder.findthematchingWord("venkat", regex));
//	}
	
	@Test
	public void testreplacement(){
		assertEquals("venkata mangina",patternreplace.findAndReplace("venkata reddi","reddi","mangina"));
	}

}
