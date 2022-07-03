package pal.paragi;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean isDuplex) {
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

    public void fillUpToner () {
        System.out.println("Fill up toner");
        tonerLevel=100;
    }

    public void printing () {
        System.out.println("Printing a page");
        numberOfPrintedPages++;
        tonerLevel--;
    }

}
