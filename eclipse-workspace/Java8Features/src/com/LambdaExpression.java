package com;
@FunctionalInterface
interface Operation {
	int add(int x, int y);
}
class OperationImp implements Operation {
	@Override
	public int add(int x, int y) {
		return x+y;
	}
}
public class LambdaExpression {

	public static void main(String[] args) {
	//1st way 
	Operation op1 = new OperationImp();
	System.out.println("Add "+op1.add(100, 200));
	// 2nd way 
	Operation op2 = new Operation() {
		@Override
		public int add(int x, int y) {
			return x+y;
		}
	};
	System.out.println("Add "+op2.add(30, 40));
	//Operation op3 = (x,y)->x+y;
	//Operation op3 = (a,b)->a+b;
	Operation op3 = (int a,int b)->a+b;
	System.out.println("Add "+op3.add(100, 200));
	Operation op4 = (int x, int y)-> {
		int sum = x+y;
		return sum;
	};
	System.out.println("Add "+op4.add(123, 456));
	}

}