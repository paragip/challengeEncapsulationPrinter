package pal.paragi;

public class EnhancedPrinter {

    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex = false;

    public EnhancedPrinter(int tonerLevel, int numberOfPrintedPages, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        if (numberOfPrintedPages >= 0) {
            this.numberOfPrintedPages = numberOfPrintedPages;
        }

        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillUpToner (int amountOfFilling) { // itt hoztam be a mennyiséget, amennyit beletöltünk, tehát az előző verzióban csak max-ig töltöttük, itt megadhatjuk hogy mennyit töltünk bele
        System.out.println("Fill up toner");
        if(this.tonerLevel + amountOfFilling <= 100) {
            this.tonerLevel = this.tonerLevel + amountOfFilling;
            System.out.println("filling up was successful, the new toner level = " + this.tonerLevel);
        } else {
            System.out.println("error, filling up was not successful");
        }

    }

    public void printing (int printedPages) { // megadjuk a nyomtatott oldalak számát, itt ez a fejlesztés az előzőhöz képest
        System.out.println("Printing a page");
        if (this.tonerLevel - printedPages >= 0) {
            this.numberOfPrintedPages = numberOfPrintedPages + printedPages;
            this.tonerLevel = this.tonerLevel - printedPages;
            System.out.println("printed pages = " + this.numberOfPrintedPages);
            System.out.println("current toner level after printing = " + this.tonerLevel);
        } else {
            System.out.println("error, not enough level of toner for printing");
        }

    }

}
