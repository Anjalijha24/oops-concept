package inheritanceEmployee;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an instance of the FE class
   FE f = new FE();
   f.setEmployeeInInfo("ram",1236,98766554);//fixed the method name
   f.HoursSal(100,1000);
   
   
   RE r = new RE();
   r.setEmployeeInInfo("Shyam",2,456456);
   r.MonthSal(500000);
   
   CE c = new CE();
   c.setEmployeeInInfo("Dinesh,3,66666", 0, 0);
   c.projWiseSal(5,2000);
	}
}

package inheritanceEmployee;
import inheritanceEmployee.FE;


public class EmloyeeIn {
	
	String name;
	int id;
	double contact;
	void setEmployeeInInfo(String name,int id,double contact)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
	}

}

class FE extends EmloyeeIn
{
	void HoursSal(int nhour,int ppcost)
	{
		int total=nhour*ppcost;
		System.out.println("Total salary is as per hour:"+total);
	}
}

class RE extends EmloyeeIn
{
	 void MonthSal(int annualsal)
	{
		int Monthsal=annualsal/12;
				System.out.println("my month sal is:"+Monthsal);
	}
}
class CE extends EmloyeeIn
{
	void  projWiseSal(int nproj,int ppsal)
	{
		int totalCost = nproj*ppsal;
		System.out.println("Total number of project cost is:"+ totalCost);
	}
}
