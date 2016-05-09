public class TestProgram {
  public static void main(){
  Dice dt = new Dice();
  System.out.println(dt.throwDice(3));
  System.out.println(dt.throwDice(2));
  System.out.println(dt.throwDice(1));

  Automobile truck = new Automobile(2016, "Ram", "Dodge", "Blue", "Truck", 3);
  truck.increaseCycle();
  System.out.println(truck.distanceTraveled);
  truck.increaseCycle();
  System.out.println(truck.distanceTraveled);

  Automobile van = new Automobile(2016, "Caravan", "Dodge", "Purple", "Van", 4);
  van.increaseCycle();
  System.out.println(van.distanceTraveled);
  van.increaseCycle();
  System.out.println(van.distanceTraveled);

  Automobile sportCar = new Automobile(2016, "Mercielago", "Lamborghini", "Green", "Sport Car", 6);
  sportCar.increaseCycle();
  System.out.println(sportCar.distanceTraveled);
  sportCar.increaseCycle();
  System.out.println(sportCar.distanceTraveled);
  }
}


