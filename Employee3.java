class Employee3{
	int empno;
	String ename;
	float sal;

	Employee3(){}

	Employee3(int empno, String ename){
		this.empno=empno;
		this.ename=ename;
	}

	Employee3(int a, String b, float c){
		this(a,b); // constructor chaining
		/*
		empno = a;
		ename = b;
		*/
		sal = c; 
	}

	void getDetails(){
		System.out.println(this.empno+" | "+ this.ename + " | "+ this.sal);
	}

	
}