public class DiskStorageProxy implements Storage {
    private DiskStorage diskStorage;

    public DiskStorageProxy(DiskStorage diskStorage) {
        this.diskStorage = diskStorage;
    }

    @Override
    public void readData() {
        System.out.println("Proxy executou para readData");
        diskStorage.readData();
    }

    @Override
    public void writeData() {
        System.out.println("Proxy executou para writeData");
        diskStorage.writeData();
    }
}
