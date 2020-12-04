package Homework_06.task01;

import java.util.Objects;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;



    @Override
    public String toString() {
        return "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + + getPrice() + " serialNumber = " + getSerialNumber() + " X = " + resolutionX + " Y = " + resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Monitor monitor = (Monitor) o;
            boolean resultManufacturer = monitor.getManufacturer().equals(this.getManufacturer());
            boolean resultPrice = monitor.getPrice() == this.getPrice();
            boolean resultSerialNumber = monitor.getSerialNumber() == (this.getSerialNumber());
            boolean resultResolutionX = monitor.resolutionX == this.resolutionX;
            boolean resultResolutionY = monitor.resolutionY == this.resolutionY;
            return resultManufacturer && resultPrice && resultSerialNumber && resultResolutionX && resultResolutionY;
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + getManufacturer().hashCode();
        result = 37 * result + (int) getPrice();
        result = 37 * result + getSerialNumber().hashCode();
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
}
}
