package adapter;

import objects.Printer;

import java.util.List;

public class PrinterAdapter implements PageListAdapter{
    private Printer printer = new Printer(); //Композиция.
    //
    //
    // Можно получить принтер, унаследовав его
//    private Printer printer;
//
//    public PrinterAdapter(Printer printer) {
//        this.printer = printer;
//    }

    @Override
    public void print(List<String> texts) {
        for (String text :
                texts) {
            printer.print(text);
        }
    }
}
