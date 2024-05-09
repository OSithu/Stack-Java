package Implementation;

public class StackApp_Main {

	public static void main(String[] args) {
			
		StackX s1 = new StackX(10); 
		
		s1.push(50);
		s1.push(60);
		s1.push(10);
		s1.push(70);
		
		
		while(!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
	}

}
