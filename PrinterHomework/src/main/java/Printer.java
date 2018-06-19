public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;
    }

    public int print(int copy, int page) {
        toner -= copy * page;
        if(this.pages > copy * page){
            return this.pages -= copy * page;
        }else {
            return 0;
        }
    }

    public int refill() {
        if(this.pages < 100) {
            return this.pages = 100;
        }else return this.pages;
        }

    public int hasToner() {
        return this.toner;
    }
}

