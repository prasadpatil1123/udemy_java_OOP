
public class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
		Employee3 emp1 = new Employee3();
		Employee3 emp2 = new Employee3(101,"Sunil");
		Employee3 emp3 = new Employee3(102,"Naveen",2500f);
		
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}

}
