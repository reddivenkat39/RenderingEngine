package regexforemail;

public class FindTheEmail extends EmailFindingInterface{

	public static void main(String[] args){
		FindTheEmail findemail = new FindTheEmail();
		String regex =null;
		regex = "(\\s+)(\\w+)(@)(\\w+)";
		String email = findemail.findTheEmail("hey my venkatamangina@gmail.com email address is mangina92v@gmail.com. please call me when u free", regex);
		System.out.println(email.trim());
	}
}
