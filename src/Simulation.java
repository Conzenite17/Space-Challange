import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    Simulation(){

    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int totalCost = 0;//Millions
        int successfulMissions = 0;

        while (successfulMissions < rockets.size()){
            totalCost+= rockets.get(successfulMissions).cost;
            if (rockets.get(successfulMissions).launch() && rockets.get(successfulMissions).land()){
                successfulMissions++;
            }
        }
        return totalCost;
    }


    public ArrayList<Rocket> loadU1(ArrayList<Item> itemArrayList){
        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();
        u1Rockets.add(new U1());

        for (Item item: itemArrayList) {
            if(u1Rockets.get(u1Rockets.size() - 1).canCarry(item)){
                u1Rockets.get(u1Rockets.size() - 1).carry(item);
            } else{
                u1Rockets.add(new U1());
            }
        }
        return u1Rockets;
    }


    public ArrayList<Rocket> loadU2(ArrayList<Item> itemArrayList){
        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();
        u2Rockets.add(new U2());

        for (Item item: itemArrayList) {
            if(u2Rockets.get(u2Rockets.size() - 1).canCarry(item)){
                u2Rockets.get(u2Rockets.size() - 1).carry(item);
            } else{
                u2Rockets.add(new U2());
            }
        }
        return u2Rockets;
    }

    /**
     * Method that reads the items from a text file into an itemArrayList
     * @param textFile
     * @return itemArrayList containing the names and weights of the cargo to be loaded onto the rockets.
     */
    public ArrayList<Item> loadItems(String textFile){
        File file = new File(textFile);
        ArrayList<Item> itemArrayList = new ArrayList<>();
        Scanner fileScanner;

        try{
            fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()){
                String[] stringArray = fileScanner.nextLine().split("=");
                Item item = new Item();
                item.name = stringArray[0];
                item.weight = Integer.parseInt(stringArray[1]);
                itemArrayList.add(item);
            }

        } catch (FileNotFoundException exception){
            System.out.println("Error loading file name: "+ textFile);
        }

        return itemArrayList;
    }
}
