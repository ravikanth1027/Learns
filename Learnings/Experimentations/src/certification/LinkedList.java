package certification;

public class LinkedList {
	String key , value;
	LinkedList next;
	
	public LinkedList(String K , String V) {
		// TODO Auto-generated constructor stub
		key = K ;
		value = V;
	}
	
	public String getValue(){
		return value;
	}
	
	public String getKey(){
		return key;
	}
	
	public void setValue(String V){
		this.value = V;
	}
	

}
