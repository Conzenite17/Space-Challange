public class Main {

    public static void main(String[] args){
        Simulation simulation = new Simulation();
        int u1SimulationBudget = 0;//$million
        int u2SimulationBudget = 0;//$million

        u1SimulationBudget+= simulation.runSimulation(simulation.loadU1(simulation.loadItems("Phase-1.txt")));
        u1SimulationBudget+= simulation.runSimulation(simulation.loadU1(simulation.loadItems("Phase-2.txt")));
        System.out.println("Budget required for U1 Rocket simulation: $"+u1SimulationBudget+" Million");

        u2SimulationBudget+= simulation.runSimulation(simulation.loadU2(simulation.loadItems("Phase-1.txt")));
        u2SimulationBudget+= simulation.runSimulation(simulation.loadU2(simulation.loadItems("Phase-2.txt")));
        System.out.println("Budget required for U2 Rocket simulation: $"+u2SimulationBudget+" Million");

    }
}
