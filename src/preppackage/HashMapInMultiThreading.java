package preppackage;

import java.util.HashMap;

public class HashMapInMultiThreading {

	// deep cloning - Both refer to the same object
	@Override
	public HashMapInMultiThreading clone(){
		return this;
	}
	public static void main(String[] args){
		HashMap<Object,Object> hm = new HashMap<>();
		
	}
}
