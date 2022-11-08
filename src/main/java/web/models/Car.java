package web.models;

public class Car {

    private String model;
    private int id;
    private long mileage;

    public Car(int id, String model, long mileage) {
        this.model = model;
        this.id = id;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", mileage=" + mileage +
                '}';
    }
}
