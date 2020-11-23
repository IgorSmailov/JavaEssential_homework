package Homework_01;

public class Address {
        private String country;
        private String street;
        private String city;
        private int index;
        private int apartment;



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }




        public Address() {
            this.country = country;
            this.apartment = apartment;
            this.city = city;
            this.street = street;
            this.index = index;

        }
    }


