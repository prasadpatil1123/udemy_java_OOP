class Employee2
{
	int empno;
	String ename;
	float sal;

	void displayProperties(){
			System.out.println(empno + " | "+ ename + " | "+ sal);
	}

	void setProperties(){
		ename = "Kashiprasad";
		sal = 50000.0f;
		System.out.println(empno + " | "+ ename + " | "+ sal);
	}

	public static void main(String[] args){

	Employee2 emp = new Employee2();
	System.out.println(emp.empno + " | "+ emp.ename + " | "+ emp.sal);

	emp.empno = 101;
	emp.ename = "Kashi";
	emp.sal = 25000.0f;
	emp.displayProperties();
	// System.out.println(emp.empno + " | "+ emp.ename + " | "+ emp.sal);
	emp.setProperties();

	}
}