public interface SpaceShip {

    boolean launch();
    //returns either true or false indicating if the launch was successful or if the rocket has crashed.

    boolean land();
    //returns either true or false based on the success of the landing.

    boolean canCarry(Item item);
    //returns true if the rocket can carry such item or false if it will exceed the weight limit. When item is added

    void carry(Item item);
    //updates the current weight of the rocket. After adding item
}
