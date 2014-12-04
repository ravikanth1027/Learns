package certification;

public class HashCode {

	private String name;
	private int age;
	public HashCode(String n , int a){
		name = n;
		age = a;
	}
	public boolean equals(Object o){
		if(!(o instanceof HashCode)) return false;
		HashCode h = (HashCode)o;
		return age == h.age && name.equals(h.name);
	}
}
