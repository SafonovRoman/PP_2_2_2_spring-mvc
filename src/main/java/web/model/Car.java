package web.model;

public class Car {
    private final String manufacturer;
    private final String model;
    private final int buildYear;

    public Car(String manufacturer, String model, int buildYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.buildYear = buildYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getBuildYear() {
        return buildYear;
    }
}
