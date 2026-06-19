import javax.print.Doc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentFactory df;

        df = new WordDocumentFactory();
        Document d1 = df.createDocument();
        d1.open();

        df = new ExcelDocumentFactory();
         d1 = df.createDocument();
        d1.open();

        df = new PdfDocumentFactory();
        d1 = df.createDocument();
        d1.open();

    }
}