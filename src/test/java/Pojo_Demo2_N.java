
public class Pojo_Demo2_N {
	public static void main(String[] args) {
		
		Pojo_Demo2 A = new Pojo_Demo2();
		
		//this one type of method for get print
		String name = A.getName();
		System.out.println(name);
		
		A.setName("Anbu");
		System.out.println(A.getName());
		
		// this one type of method for get print 
		System.out.println(A.getNo());
		A.setNo(10);
		System.out.println(A.getNo());
		
		System.out.println(A.getCh());
		A.setCh('#');
		System.out.println(A.getCh());
		
		System.err.println(A.getN());
		A.setN("Dad");
		System.err.println(A.getN());
		
		A.setN("abcfdhdhdjjd");
		System.out.println(A.getN());//set value after get value
	
		
}}
