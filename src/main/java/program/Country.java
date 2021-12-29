package program;

import lombok.Data;

@Data
public class Country {
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private int phoneCod;

    public Country(String name,int phoneCod){
        this.name=name;
        this.phoneCod=phoneCod;
    }
}
