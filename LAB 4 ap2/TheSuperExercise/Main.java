public class Main extends Car
{
	Main(String s ,String g, int y)
{
	
	super(s,g,y);
}


	public static void main(String[] args)
{

	Car c = new Car("AUDI", "R8", 8);
	Bicycle b = new Bicycle("Avon", 10);
	c.displayCarInfo();
	b.displayBicycleInfo();
}



}

