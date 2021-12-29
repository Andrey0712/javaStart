package program;


import lombok.Data;

@Data
public class Car {

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    private String brand;
    private String model;
    private int year;
    private int power;

    public Car(String brand,String model,int year,int power){
        this.brand=brand;
        this.model=model;
        this.power=power;
        this.year=year;

    }
}
