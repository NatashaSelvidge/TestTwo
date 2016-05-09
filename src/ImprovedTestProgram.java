public class ImprovedTestProgram {
  public static void main(int userInput){
  Dice dt = new Dice();
  int loops = dt.throwDice(userInput);

  int i = 0;
  Automobile truck = new Automobile(2016, "Ram", "Dodge", "Blue", "Truck", 3);
  while ( i < loops){
  truck.increaseCycle();
  }
  System.out.println(truck.distanceTraveled);
  System.out.println(truck.operatingCycle);
  System.out.println(truck.gears);
  System.out.println(truck.currentSpeed);

  Automobile van = new Automobile(2016, "Caravan", "Dodge", "Purple", "Van", 4);
  while ( i < loops){
  van.increaseCycle();
  }
  System.out.println(van.distanceTraveled);
  System.out.println(van.operatingCycle);
  System.out.println(van.gears);
  System.out.println(van.currentSpeed);

  Automobile sportCar = new Automobile(2016, "Mercielago", "Lamborghini", "Green", "Sport Car", 6);
  while ( i < loops){
  sportCar.increaseCycle();
  }
  System.out.println(sportCar.distanceTraveled);
  System.out.println(sportCar.operatingCycle);
  System.out.println(sportCar.gears);
  System.out.println(sportCar.currentSpeed);
  }
}