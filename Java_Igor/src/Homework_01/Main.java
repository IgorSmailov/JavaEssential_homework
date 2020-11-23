package Homework_01;

public class Main {
    public static void main(String[] args) {
        Address newMyAddress = new Address();
        newMyAddress.setIndex(2002);
        newMyAddress.setCountry("Ukraine");
        newMyAddress.setCity("Kyiv");
        newMyAddress.setApartment(222);
        newMyAddress.setStreet("Nikolsko-Slobodskaya");

        System.out.println(" Index =" + newMyAddress.getIndex() + " Country =" +newMyAddress.getCountry()
                + " City =" +newMyAddress.getCity() + " Street =" +newMyAddress.getStreet() +" Appartment =" +newMyAddress.getApartment());
    }
}
