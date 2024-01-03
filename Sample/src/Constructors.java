
public class Constructors {
	int a =10;// instance variable is a variable that is declared within a class but outside methods
	int k;
	void display()
	{
		System.out.println(a);
	}
	Constructors()//No-args constructor
	{
		System.out.println(a);
	}
	Constructors(int x,int y)
	{
		k=x+y;
	}
public static void main(String args[])
{
	Constructors obj = new Constructors(); // constrcuting no-args constructors.
	obj.display();
	int x=10,y=30;
	Constructors obj1 = new Constructors(x,y); // Constructing args constructors
	System.out.println(obj1.k);
}

}
