package inheritancetest;

interface Car
{
	public void Start();
}
interface bike
{
	public void Start();
}

 class vehiclesss implements Car,bike
{
	public void Start()
	{
		System.out.println("start with key");
	}
}


public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    vehiclesss v = new vehiclesss();
    		 v.Start();
	}

}
