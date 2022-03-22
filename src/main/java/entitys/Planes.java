package entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLANES")
public class Planes {
    @Id
    private Integer id;
    private String clase;
    private String model;
    private Integer capacity;

    public Planes(Integer id, String clase, String model, Integer capacity) {
        this.id = id;
        this.clase = clase;
        this.model = model;
        this.capacity = capacity;
    }

    public Planes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", clase='" + clase + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}