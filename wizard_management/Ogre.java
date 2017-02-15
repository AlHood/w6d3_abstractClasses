package wizard_management;

import behaviours.Deployable;


public class Ogre extends MythicalBeast implements Deployable {
  
  public Ogre(String name){
    super(name);
  }


  public String protect(){
    return "Me smash good!";

}

}