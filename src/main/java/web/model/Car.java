package web.model;


public class Car {
    private String carModel;
    private String engine;
    private int productionYear;

    public Car() {
    }

    public Car(String carModel, String engine, int productionYear) {
        this.carModel = carModel;
        this.engine = engine;
        this.productionYear = productionYear;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", engine='" + engine + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
