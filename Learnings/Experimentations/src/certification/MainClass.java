package certification;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashCode h = new HashCode("Ravi", 27);
		//System.out.println(h.equals(h));
//		String s1 = new String("Ravi");
//		String s2 = s1;
//		String s3 = new String("R");
//		System.out.println(s3.hashCode() );
//		System.out.println(s1.hashCode());
		
		THashMap tmhm = new THashMap();
		 
        tmhm.put("Niranjan", "SMTS");
        tmhm.put("Ananth", "SSE");
        tmhm.put("Niranjan", "SMTS1");
        tmhm.put("Chandu", "SSE");
 
        LinkedList e = tmhm.get("Niranjan");
        System.out.println(""+e.getValue());
	}

}
