package week3.assignments;

public class Students {
	
	public void getInfo(int id)
	{
		System.out.println("The student id is: " + id);
	}
	
	public void getInfo(int id,String name)
	{
		System.out.println("The student id  is: " + id);
		System.out.println("The student name is: " + name);
	}
	

	public void getInfo(long phone, String email)
	{
		System.out.println("The student name is: " + email);
		System.out.println("The student phone number is: " + phone);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getInfo(134572);
		obj.getInfo(1345721, "Rose");
		obj.getInfo(9061747445L,"roseboscom@gmail.com");

	}

}
