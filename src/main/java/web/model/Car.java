package web.model;

public class Car {
    private String model;
    private int series;
    private String vinNumber;

    public Car(String model, int series, String vinNumber) {
        this.model = model;
        this.series = series;
        this.vinNumber = vinNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
}
