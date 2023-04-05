public class DiskStorage implements Storage {
    @Override
    public void readData() {
        System.out.println("Lendo dados do disco");
    }

    @Override
    public void writeData() {
        System.out.println("Escrevendo dados no disco");
    }
}
