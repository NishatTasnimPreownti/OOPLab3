public class Test {
    NumWordPrinter printer = new NumWordPrinter();
    @Test
    public void testDivisibleBy2() {
        assertEquals("Even", printer.printWord(4, false));
    }



}
