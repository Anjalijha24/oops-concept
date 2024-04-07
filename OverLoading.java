package polymorphismExample;  //overloading // compile time 

public class OverLoading {

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sum obj=new Sum();
   obj.add(10, 20);
   obj.add(10, 20, 30);
	}

}
