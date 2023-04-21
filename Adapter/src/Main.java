public class Main {
    public static void main(String[] args) {
        CSVConverter csvConverter = new CSVConverter();
        CSVParser csvParserAdapter = new CSVParserAdapter(csvConverter);
        csvParserAdapter.toCSV("arq.xml", "XML");
    }
}