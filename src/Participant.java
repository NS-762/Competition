public interface Participant {

    void run(int size);
    void jump(int size);
    void doIt(Obstacle obstacle);

    boolean isState();

}
