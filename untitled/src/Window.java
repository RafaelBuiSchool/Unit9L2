public class Window extends Car{
    private boolean windowDown = false;
    public Window(int total, boolean run,boolean windowDown){
        super(total,run);
        this.windowDown = windowDown;
    }
    public boolean isWindowDown() {
        return windowDown;
    }

    public void setWindowDown(boolean windowDown) {
        this.windowDown = windowDown;
    }
}
