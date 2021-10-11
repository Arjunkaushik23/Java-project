
package gobtest;

class Worker extends Person
{
	int wh;
	String name;
	Worker()
	{
		wh=0;
		name=null;
	}
	void accept(String n,int h)
	{
		wh=h;
		name=n;
	}
	void display()
	{
		System.out.println("Worker’s name= "+name);
		System.out.println("Working hour= "+wh);
	}
}
