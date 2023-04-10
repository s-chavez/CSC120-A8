import java.util.ArrayList;

/**
 * Represents a Robot
 */
public class Robot implements Contract {

  /** The name of the Robot */
  String name;

  /** Arraylist of the Robot's actions */
  ArrayList < String > actions;

  /** The size of the Robot in meters */
  Number size;

  public Robot(String name, Number size) {
    this.name = name;
    this.actions = new ArrayList < String > ();
    this.size = size;
  }
  /**
   * Method allowing the Robot to grab an item.
   * @param item The item the Robot grabs
   */
  public void grab(String item) {
    System.out.println(this.name + " has grabbed the " + item + ".");
    actions.add("grabbing");
  }
  /**
   * Method allowing the Robot to drop an item.
   * @param item The item being dropped
   * @return The item being dropped
   */
  public String drop(String item) {
    System.out.println(this.name + " has dropped the " + item + ".");
    actions.add("dropping");
    return item;
  }
  /**
   * Method allowing the Robot to examine an item.
   * @param item The item being examined
   */
  public void examine(String item) {
    System.out.println(this.name + " is now examining the " + item + ".");
    actions.add("examining");
  }
  /**
   * Method allowing the Robot to use an item.
   * @param item The item being used
   */
  public void use(String item) {
    System.out.println(this.name + " is now using the " + item);
    actions.add("using");
  }
  /**
   * Method allowing the Robot to walk in a specific direction
   * @param direction The direction the Robot will walk towards
   * @return The boolean value representing when the Robot is walking
   */
  public boolean walk(String direction) {
    System.out.println(this.name + " is now walking " + direction + ".");
    actions.add("walking");
    return true;
  }
  /**
   * Allows Robot to fly given x and y coordinates.
   * @param x The x-coordinate the Robot will fly towards
   * @param y The y-coordinate the Robot will fly towards
   * @return The boolean value representing when the Robot is flying
   */
  public boolean fly(int x, int y) {
    System.out.println("Flying " + this.name + " to " + x + ", " + y + "...");
    System.out.println(this.name + " has now flown to " + x + ", " + y + "!");
    actions.add("flying");
    return true;
  }
  /**
   * Shrinks the Robot.
   * @return The shrunken Robot's size in meters
   */
  public Number shrink() {
    size = size.intValue() / 2;
    System.out.println(this.name + " is shrinking!");
    System.out.println("The Robot named " + this.name + " is now " + size + " meters.");
    actions.add("shrinking");
    return size;
  }
  /**
   * Expands the Robot's size.
   * @return The expanded Robot's size in meters
   */
  public Number grow() {
    size = (size.intValue()) * 2;
    System.out.println(this.name + " is growing!");
    System.out.println("The Robot named " + this.name + " is now " + size + " meters.");
    actions.add("growing");
    return size;
  }
  /**
   * Method to let the Robot rest.
   */
  public void rest() {
    System.out.println(this.name + " is now resting.");
    actions.add("resting");
  }
  /**
   * Allows Robot's action to be undone.
   */
  public void undo() {
    String last_action = actions.get(actions.size() - 1);
    System.out.println("The robot's action of " + last_action + " is now being undone. The robot is no longer " + last_action + ".");
  }
  /**
   * Allows the Robot to deliver an item to a person
   * @param item The item being delivered
   * @param person The person who the Robot is delivering the item to
   * @return The item being delivered
   */
  public String deliver(String item, Object person) {
    System.out.println(this.name + " is delivering the " + item + " to " + person + "...");
    System.out.println("The " + item + " has been delivered to " + person + ". Enjoy!");
    actions.add("delivering");
    return item;
  }
  /**
   * Allows a Robot to build an item
   * @param item The item being built by the Robot
   * @return The built item
   */
  public String build(String item) {
    System.out.println(this.name + " is building the " + item + ".");
    System.out.println("The " + item + " has been built!");
    actions.add("building");
    return item;
  }
  /**
   * Allow the Robot to fix an item
   * @param item The item needed to be fixed
   * @return The fixed item
   */
  public String fix(String item) {
    System.out.println(this.name + " is fixing the " + item + ".");
    System.out.println("The " + item + " has been fixed!");
    actions.add("fixing");
    return item;
  }
  /**
   * Demonstrates use of methods in the Robot class
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Robot myRobot = new Robot("Steve", 10.0);
    myRobot.grab("box");
    myRobot.drop("box");
    myRobot.examine("box");
    myRobot.use("box");
    myRobot.walk("left");
    myRobot.fly(50, 50);
    myRobot.shrink();
    myRobot.grow();
    myRobot.grow();
    myRobot.rest();
    myRobot.deliver("package", "Sarah");
    myRobot.build("printer");
    myRobot.fix("printer");
    System.out.println(myRobot.actions);
    myRobot.undo();
  }
}