package certification;

public class THashMap {
	
	private LinkedList table[] = new LinkedList[16];
	
	public void put(String K , String V){
		int hash = K.hashCode() % 16;
		LinkedList l = table[hash];
		if(l != null){
			if(l.key.equals(K)){
				l.value = V;
			}
			else{
				while(l.next!= null){
					l=l.next;
				}
				LinkedList list = new LinkedList(K, V);
				list.next =list;
			}
		}else{
			LinkedList newList = new LinkedList(K, V);
			table[hash] = newList;
		}
		
	}
	
	public LinkedList get(String k){
		int hashCode = k.hashCode() % 16;
		LinkedList l = table[hashCode];
		while(l!=null){
			if(l.key.equals(k)){
				System.out.println("l.key:"+ l.key +"       k:"+k);
				return l;
			}
			l = l.next;
		}
		return null;
	}
}
