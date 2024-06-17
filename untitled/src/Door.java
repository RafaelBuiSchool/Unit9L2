public class Door extends Car{
    private boolean doorClosed = true;
    public Door(int total,boolean run, boolean doorClosed){
        super(total,run);
        this.doorClosed = doorClosed;
    }

    public boolean isDoorClosed() {
        return doorClosed;
    }

    public void setDoorClosed(boolean doorClosed) {
        this.doorClosed = doorClosed;
    }
}
