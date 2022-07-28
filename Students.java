package Week3.day1;

public class Students {

	/*Assignment 4
	==============

	      Class: Students
	      Methods: getStudentInfo()

	Description: 
	Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

	*/
	int id=this.id;
	
	
	public void getStudentInfo(int id)
	{
		System.out.println("id :"+id);
	}
	public void getStudentInfo(int  id ,String name)
	{
		System.out.println("id :"+id +" "+"Name :" +name);
	}
	
	public void getStudentInfo(String email,String phoneNumber)
	{
		System.out.println("email :"+email+" "+"phone Number is :"+phoneNumber);
	}
	public static void main(String[] args) {
		
		Students info =new Students();
		
		info.getStudentInfo(10);
		info.getStudentInfo(11, "Anu");
		info.getStudentInfo("anusha121995@gmail.com", "9566556498");

	}
}
