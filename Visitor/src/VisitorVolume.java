public class VisitorVolume implements Visitor {

    @Override
    public double visitorVolume(Parallelepiped parallelepiped) {
        double volume = parallelepiped.getHeight() * parallelepiped.getWidth() * parallelepiped.getLength();
        System.out.println("Volume paralelepípedo: " + volume);
        return volume;
    }

    @Override
    public double visitorVolume(Cylinder cylinder) {
        double volume = Math.PI * Math.pow(cylinder.getRadius(), 2) * cylinder.getHeight();
        System.out.println("Volume cilindro: " + volume);
        return volume;
    }
}
