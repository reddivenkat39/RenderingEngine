package package1;

public class Breakingalooop {
public static void main(String[] args){
	for(int i=0;i<10;i++){
		System.out.println("break at 5");
		if(i==5){
			System.out.println("===============");
			System.out.println("it is 5");
			break;
		}
	}
}
}
