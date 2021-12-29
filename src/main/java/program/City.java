package program;
import lombok.Data;

@Data
public class City {
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    private String name;
    private  String region;
}
