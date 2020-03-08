package pl.sda.mapy;

public class School {
    private String name;
    private String City;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public School() {
    }

    public School(String name, String city) {
        this.name = name;
        City = city;
    }
}
