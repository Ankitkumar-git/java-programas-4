public class Car extends Vehicle
 {
private String model;
private int year;
public Car(String brand, String model, int year)
{
super(brand);
this.model = model;
this.year = year;

}
public void displayCarInfo() 
{
System.out.println("Car Info:");
super.displayBrand();
System.out.println("Model: " + model);
System.out.println("Year " + year);
}
}
