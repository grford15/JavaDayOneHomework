import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrinter {

    @Test
    public void printerCanPrint(){
        Printer printer = new Printer(100, 100);
        assertEquals(90, printer.print(5, 2));
    }

    @Test
    public void printerRefill(){
        Printer printer = new Printer(20, 100);
        assertEquals(100, printer.refill());
    }

    @Test
    public void printerUsesToner(){
        Printer printer = new Printer(100, 100);
        printer.print(5, 2);
        assertEquals(90, printer.hasToner());
    }
}
