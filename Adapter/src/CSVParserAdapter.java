public class CSVParserAdapter implements CSVParser {
    private CSVConverter csvConverter;

    public CSVParserAdapter(CSVConverter csvConverter) {
        this.csvConverter = csvConverter;
    }

    @Override
    public void toCSV(String file, String type) {
        csvConverter.converter(type, file);
    }
}
