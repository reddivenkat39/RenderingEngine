package preppackage;

import java.util.List;

class regexclass extends FindARegularExpression{

	@Override
	public List<String> findtheListOfTargetStrings(String actualString, String regex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		regexclass regex = new regexclass();
		String thegroup = regex.findTheTarget("hey	hello","y(.*?)l");
		System.out.println(thegroup);
	}
}
