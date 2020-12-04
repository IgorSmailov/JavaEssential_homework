package Homework_06.task01;

import java.util.Objects;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public Device(String manufacturer, String serialNumber) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Device device = (Device) o;
            boolean resultManufacturer = device.manufacturer.equals(this.manufacturer);
            boolean resultPrice = device.price == this.price;
            boolean resultSerialNumber = device.serialNumber == (this.serialNumber);
            return resultManufacturer && resultPrice && resultSerialNumber;
        }
        return false;

        }

        @Override
        public int hashCode (){
            int result = 37;
            result = 37 * result + manufacturer.hashCode();
            result = 37 * result + (int) price;
            result = 37 * result + serialNumber.hashCode();
            return result;
        }
    }

