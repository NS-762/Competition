public class Human implements Participant {

    private boolean state = true;
    private int maxDistanceRun;
    private int maxHeightJump;

    public Human(int maxDistanceRun, int maxHeightJump) {
        this.maxDistanceRun = maxDistanceRun;
        this.maxHeightJump = maxHeightJump;
    }
    @Override
    public void run(int size) {
        if (size <= maxDistanceRun) {
            System.out.println("Человек пробежал кросс");
        } else {
            System.out.println("Человек не пробежал кросс и выходит из соревнования");
            state = false;
        }
    }

    @Override
    public void jump(int size) {
        if (size <= maxHeightJump) {
            System.out.println("Человек перепрыгнул стену");
        } else {
            System.out.println("Человек не перепрыгнул стену и выходит из соревнования");
            state = false;
        }
    }

    @Override
    public void doIt(Obstacle obstacle) {
        if (obstacle instanceof Cross) {
            this.run(obstacle.getSize());
        } else {
            this.jump(obstacle.getSize());
        }
    }

    @Override
    public boolean isState() {
        return state;
    }
}
