class Automobile {
  public int year;
  public String make;
  public String model;
  public String color;
  public String name;
  public int gears;
  public int operatingCycle = 0;
  public int currentGear = 0;
  public int currentSpeed = 0;
  public int distanceTraveled = 0;

  
public Automobile (int year, String make, String model, String color, String name, int gears){
  year = year;
  make = make;
  model = model;
  color = color;
  name = name;
  gears = gears;
  }
  public void increaseCycle(){
  operatingCycle++;
  if( currentGear + 1 <= gears ) {
  currentGear++;
  currentSpeed = currentGear * 10;
  }
  distanceTraveled = distanceTraveled + (currentSpeed/60);
  }
}
