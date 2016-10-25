package package1;

public class SystemProperties {

	public static void main(String[] args){
		
		String path = System.getProperty("JAVA_HOME");
		System.out.println(path);
		System.setProperty("app.config","c:/users/venka/desktop/app.txt");
		System.out.println(System.getProperty("app.config"));
	}
}
