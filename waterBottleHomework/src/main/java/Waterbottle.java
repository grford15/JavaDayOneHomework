public class Waterbottle {
    private int vol;

    public Waterbottle(int vol){
        this.vol = vol;
    }

    public int volume() {
        return this.vol;
    }

    public int drink(int num1) {
        return this.vol - num1;
    }

    public void empty() {
        this.vol = 0;
    }

    public void refill() {
        this.vol = 100;
    }
}
