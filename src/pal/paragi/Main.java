package pal.paragi;

public class Main {
    public static void main(String[] args) {

//        Printer printer = new Printer(33, 10, false);
//        System.out.println("Initial toner level = " + printer.getTonerLevel());
//        System.out.println("Initial number of printed pages = " + printer.getNumberOfPrintedPages());
//        System.out.println("Duplex? " + printer.isDuplex());
//        System.out.println();
//
//        printer.fillUpToner();
//        System.out.println("Toner level after filling up = " + printer.getTonerLevel());
//        System.out.println();
//
//        printer.printing();
//        System.out.println("Number of printed pages so far = " + printer.getNumberOfPrintedPages());
//        System.out.println("Toner level after printing = " + printer.getTonerLevel());
//
//        for (int i = 0; i < 10; i++) {
//            printer.printing();
//        }
//        System.out.println("Number of printed pages so far = " + printer.getNumberOfPrintedPages());
//        System.out.println("Toner level after printing = " + printer.getTonerLevel());
//        System.out.println();
//
//        System.out.println("Number of printed pages so far = " + printer.getNumberOfPrintedPages());
//        System.out.println("Toner level = " + printer.getTonerLevel());
//        System.out.println();
//
//        printer.fillUpToner();
//        System.out.println("Toner level after filling up = " + printer.getTonerLevel());
//        System.out.println("Number of printed pages so far = " + printer.getNumberOfPrintedPages());
//        System.out.println();

        EnhancedPrinter printer = new EnhancedPrinter(40, 22, false);
        System.out.println("Initial toner level = " + printer.getTonerLevel());
        System.out.println("Initial number of printed pages = " + printer.getNumberOfPrintedPages());
        System.out.println("Duplex? " + printer.isDuplex());
        System.out.println();

        printer.fillUpToner(22);
        System.out.println();

        printer.printing(2);
        System.out.println();

        System.out.println("current toner level = " + printer.getTonerLevel());
        System.out.println("number of printed pages = " + printer.getNumberOfPrintedPages());


    }
}
