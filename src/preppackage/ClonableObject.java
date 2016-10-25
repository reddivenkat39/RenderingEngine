package preppackage;

public class ClonableObject {
String name;
@Override
public ClonableObject clone(){
return this;	
}


public ClonableObject clonei(){
	ClonableObject clone = new ClonableObject();
	clone.name = this.name;
	return clone;
}
public static void main(String[] args){
	ClonableObject clonableObject = new ClonableObject();
	clonableObject.name = "venkat";
	ClonableObject newclone = clonableObject.clone();
	ClonableObject shallowclone = clonableObject.clonei();
	// this is how we clone deep and shallow
	System.out.println(newclone.name+" "+ newclone.toString());
	System.out.println(shallowclone.name +" "+ shallowclone.toString());
	
}
}
