import adapter.PrinterAdapter;
import objects.Printer;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();

        texts.add("Text1");
        texts.add("Text2");
        texts.add("Text3");
        texts.add("Text4");
        texts.add("Text5");

        //Printer printer = new Printer();
        PrinterAdapter adapter = new PrinterAdapter();
        adapter.print(texts);
    }
}