public class U2 extends Rocket {

    U2(){
        cost = 120;
        weight = 18;
        maxWeight = 29;
    }

    @Override
    public boolean launch() {
        chanceOfLaunchExplosion = (int) (4 * ((weight - 10.0)/(maxWeight - 10)));
        if(((Math.random()*100)+1) <= chanceOfLaunchExplosion){
            return false;
        }
        return true;
    }

    @Override
    public boolean land() {
        chanceOfLandingCrash = (int) (8 * ((weight - 10.0)/(maxWeight - 10)));
        if(((Math.random()*100)+1) <= chanceOfLaunchExplosion){
            return false;
        }
        return true;
    }
}
