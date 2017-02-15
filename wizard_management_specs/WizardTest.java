import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    dragon = new Dragon("Benedict");
    wizard = new Wizard("Toby", broomstick, dragon);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }


  @Test
  public void canFlyDragon(){
Dragon dragon = new Dragon("Smaug");
wizard = new Wizard("Ridcully", dragon, dragon); 
assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());

  }

@Test
public void canFlyMagicCarpet(){
MagicCarpet magiccarpet = new MagicCarpet("incarnadine");
wizard = new Wizard("Rincewind", magiccarpet, dragon);
assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
}

@Test
public void canSetRide(){
Dragon dragon = new Dragon("Erik");
wizard.setRide(dragon);
assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());


}

@Test
public void canDeployDragon(){
  assertEquals("Burn them all!", wizard.deploy());

}

@Test 
public void canDeployOgre(){
Ogre ogre = new Ogre("Throng the Smasher");
wizard = new Wizard("Ron", broomstick, ogre);
assertEquals("Me smash good!", wizard.deploy());



}

}





