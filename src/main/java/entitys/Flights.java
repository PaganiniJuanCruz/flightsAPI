package entitys;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flights {
    @Id
    private Integer id;
    private Integer numPassengers;
    private Date date;
    private String airline;
    private String origin;
    private String destiny;

    public Flights(Integer id, Integer numPassengers, Date date, String airline, String origin, String destiny) {
        this.id = id;
        this.numPassengers = numPassengers;
        this.date = date;
        this.airline = airline;
        this.origin = origin;
        this.destiny = destiny;
    }

    public Flights() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "numPassengers =" + numPassengers +
                ", date =" + date +
                ", airline ='" + airline + '\'' +
                ", origin ='" + origin + '\'' +
                ", destiny ='" + destiny + '\'' +
                '}';
    }
}