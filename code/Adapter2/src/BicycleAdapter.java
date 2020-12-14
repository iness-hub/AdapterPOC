//Adapter
public class BicycleAdapter extends Bicycle implements Vehicle {

    public BicycleAdapter() {
         }

    @Override
    public void accelerate() {
        pedal();
    }

    @Override
    public void pushBreak() {
        stop();
    }

    @Override
    public void soundHorn() {
        ringBell();
    }


}
