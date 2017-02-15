package wizard_management;

import behaviours.Flyable;
import behaviours.Deployable;

public class Wizard {
  String name;
private Flyable ride; 
private Deployable beast;

  public Wizard(String name, Flyable ride, Deployable beast){
    this.name = name;
    this.ride = ride;
    this.beast = beast;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

public String deploy(){
  return this.beast.protect();
}

}