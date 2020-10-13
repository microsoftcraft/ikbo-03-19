package task16.lab;

public class Address {
    private String cityName,streetName;
    private int zipCode, buildingNumber, apartmentNumber;
    private char buildingLetter;
    private Address EMPTY_Address;

    public String getCityName()
    {
        return cityName;
    }
    public int getZipCode()
    {
        return zipCode;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public int getBuildingNumber()
    {
        return buildingNumber;
    }
    public char getBuildingLetter()
    {
        return buildingLetter;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }
}
