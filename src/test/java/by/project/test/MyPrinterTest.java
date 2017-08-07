package by.project.test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyPrinterTest extends TestCase {
    private MyPrinter printer;

    public void setUp() throws Exception {
        printer = new MyPrinter();
    }

    public void testPrintText() throws Exception {
        String txt = "hello";

        String result = printer.printText(txt);
        Assert.assertEquals(txt, result);
    }

}