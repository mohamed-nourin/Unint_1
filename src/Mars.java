public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Aco";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        double mealsLeft = (meals - (2 * shipPopulation * 0.75));
        System.out.println(mealsLeft);

        meals = meals + (meals * .50);
        shipPopulation += 5;

        String landingLocation = "The Ocean";
        if (landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(50);
        new MarsExpedition();
        new GuessingGame();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        for(int minute = 0; minute<= minutesLeft; minute++){
            if(((minute%2) == 0) && ((minute%3) == 0)) {
                System.out.println("Keep Center");
            } else if (minute%2 == 0){
                System.out.println("Right");
            } else if(minute%3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}