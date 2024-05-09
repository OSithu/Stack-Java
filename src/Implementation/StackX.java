package Implementation;

public class StackX {
	
	private int maxSize;
	private double[]stackArray;
	private int top;
	
	public StackX(int s) {
		
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
//	Push Method Implement
	
	public void push(double j) {
		
		if(top==maxSize-1) {
			System.out.println("Stack is Full");
		}
		
		else {
		top++;   		//First Increment top
		stackArray[top] = j;
		
//		stackArray[++top];
		
		}
		
	}
	
	
//	Pop Method Implement
	
	public double pop() {
		
		if(top==-1) {
			System.out.println("Stack is Empty");
			return -99;
		}
		
		else {
			return stackArray[top--];
		}

			
	}
	
//	Peek Method Implement
	public double peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return -99;
			
		}
		
		else {
			return stackArray[top];
		}
	}
	
	
//isFull Methods
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	
//isEmpty Method
	public boolean isEmpty() {
		return (top==-1);
	}
	
	

}
