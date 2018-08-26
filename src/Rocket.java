public class Rocket implements SpaceShip {
    int cost; //Millions
    int weight; //Tonnes
    int maxWeight; //with cargo (Tonnes)
    int chanceOfLaunchExplosion; //out of 100%
    int chanceOfLandingCrash; //out of 100%


    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    final public void carry(Item item) {
        weight+= item.weight;
    }

    public boolean canCarry(Item item) {
        if(weight + item.weight <= maxWeight){
            return true;
        }
        return false;
    }
}
