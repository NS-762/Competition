public class Main {

    public static void main(String[] args) {

        Participant[] participants = {
                new Cat(200, 4),
                new Robot(30, 1),
                new Human(150, 2)
        };

        Obstacle[] obstacles = {
                new Cross(20),
                new Wall(2),
                new Cross(180)
        };

        for (Participant prt: participants) {
            for (Obstacle obs: obstacles) {
                prt.doIt(obs);
                if (!prt.isState()) {
                    System.out.println();
                    break;
                }
            }
            System.out.println();
        }
    }
}
