package InputOutput;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String model;

    public Car( String name, String model){
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
