package Homework_06.task01;

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Asus",1500,"AF223344");
        Monitor monitor = new Monitor("China", 310,"FM27 LC27F390FHIXRU",1920,1080);
        EthernetAdapter ethernetAdapter  = new EthernetAdapter("China",73,"ETH312234",1000,"Apple USB Ethernet Adapter 1223");

        Device deviceHome = new Device("Samsung","AB1234567CD");
        Monitor monitorHome = new Monitor("Samsung", 120,
                "AB1234567CD", 1280,1024);

        System.out.println("Device #1:");
        System.out.println(device.toString());
        System.out.println("Monitor #1:");
        System.out.println(monitor.toString());

        System.out.println("\nDevice #2:");
        System.out.println(deviceHome.toString());
        System.out.println("Monitor #2:");
        System.out.println(monitorHome.toString());

        System.out.println("\nEthernet adapter:");
        System.out.println(ethernetAdapter.toString());

        System.out.println("\nEquals check:");
        System.out.println("device1 = deviceHome: " + (device.equals(deviceHome) ? "yes":"no"));
        System.out.println("monitor = monitorHome: " + (monitor.equals(monitorHome) ? "yes":"no"));
        System.out.println("Monitor = the same Monitor: " + (monitor.equals(monitor) ? "yes":"no"));

        System.out.println("\nHash code check device & device Home:");
        System.out.println("device1 hashCode: " + device.hashCode());
        System.out.println("monitor1 hashCode: " + monitor.hashCode());
        System.out.println();
        System.out.println("deviceHome hashCode: " + deviceHome.hashCode());
        System.out.println("monitorHome hashCode: " + monitorHome.hashCode());
        System.out.println("ethernetAdapter1 hashCode: " + ethernetAdapter.hashCode());

    }
}
