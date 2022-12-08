interface car{
    void startEngine();
    void speedUp(int newSpeed);
    void breakDown(int newSpeed);
    void shutDownEngine();
    boolean getEngineStatus();
    int getSpeed();
}

public class bmw implements car {
    private int speed=0;
    private boolean isOn = false;
    @Override
    public void startEngine() {
        System.out.println("engine started");
        isOn=true;
    }

    @Override
    public void speedUp(int newSpeed) {
        speed+=newSpeed;
        System.out.println("new speed is: "+speed);
    }

    @Override
    public void breakDown(int newSpeed) {
        speed-=newSpeed;
        System.out.println("new speed is: "+speed);
    }

    @Override
    public void shutDownEngine() {
        System.out.println("engine was shutdown. Goodbye");
        isOn=false;
        speed=0;
    }

    @Override
    public boolean getEngineStatus() {
        return isOn;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
