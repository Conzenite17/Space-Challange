public class U1 extends Rocket {

    U1(){
        cost = 100;
        weight = 10;
        maxWeight = 18;
    }

    @Override
    public boolean launch() {
        chanceOfLaunchExplosion = (int) (5 * ((weight - 10.0)/(maxWeight - 10)));
        if(((Math.random()*100)+1) <= chanceOfLaunchExplosion){
            return false;
        }
        return true;
    }

    @Override
    public boolean land() {
        chanceOfLandingCrash = (int) (1 * ((weight - 10.0)/(maxWeight - 10)));
        if(((Math.random()*100)+1) <= chanceOfLandingCrash){
            return false;
        }
        return true;
    }
}
