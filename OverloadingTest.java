public class OverloadingTest{
	
	// void addNum(){
	// 	System.out.println("addNum() with zero parameters");
	// }

	// void addNum(int x, int y){
	// 	System.out.println("addNum() with Two parameters - int and int");
	// }

	// void addNum(int x, float y){
	// 	System.out.println("addNum() with Two parameters - int and float");
	// }

	void addNum(int x, byte y) {
		System.out.println("Sum = "+ (x+y));
	}
	void addNum(int x, long y) {
		long sum = x+y;
		System.out.println(x+" + "+y+" = "+sum);
	}


	public static void main(String[] args){
	OverloadingTest obj = new OverloadingTest();

	// obj.addNum(10,23f);
	// obj.addNum();
	// obj.addNum(10,25);'
	
	int a=10;
		byte b=20;
		obj.addNum(a, b);
		obj.addNum(10, 20);
	}
}