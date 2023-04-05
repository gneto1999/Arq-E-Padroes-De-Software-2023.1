public class Main {
    public static void main(String[] args) {
        DiskStorage diskStorage = new DiskStorage();
        Storage diskStorageProxy = new DiskStorageProxy(diskStorage);
        diskStorageProxy.readData();
        diskStorageProxy.writeData();
    }
}