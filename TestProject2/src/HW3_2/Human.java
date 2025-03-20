package HW3_2;

public class Human implements Action {

    public int maxDist;
    public int maxHeight;

    public Human (int maxDist, int maxHeight){
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;
    }
    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.dist <= maxDist) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height <= maxHeight) {
            return true;
        } else
            return false;
    }

}
