package wizard_management;

import behaviours.Deployable;

import behaviours.Flyable;

public class Dragon extends MythicalBeast implements Flyable, Deployable {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

public String protect(){
  return "Burn them all!";
}
}