public class Car {
    private int total = 0;
    private boolean run = true;
    public Car(int total, boolean run){
        this.total = this.total;
        this.run = this.run;
    }
    public boolean multiply(){
        total ++;
        if(total%2==0){
            run = false;
        }
        return run;
    }
}
