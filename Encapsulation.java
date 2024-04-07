public class Encapsulation{
	
	private String Name;
	private int RollNo;
	private String Address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public static void main(String[] args)
	{
		Encapsulate obj= new Encapsulate();
		
		obj.setName("Anjali");
	    obj.setRollNo(2);
	    obj.setAddress("Bhiwandi");
	    
	    System.out.println("Name:" +obj.Name);
	    System.out.println("Name:" +obj.RollNo);
	    System.out.println("Name:" +obj.Address);
	}

}
