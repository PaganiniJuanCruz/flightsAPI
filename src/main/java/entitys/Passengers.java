package entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passengers")
public class Passengers {
    @Id
    private Long passport;
    private String nameSurname;
    private Integer idPlane;
    private String origin;
    private String destiny;
    private String nationality;

    public Passengers() {
    }

    public Passengers(Long passport, String nameSurname, Integer idPlane, String origin, String destiny, String nationality) {
        this.passport = passport;
        this.nameSurname = nameSurname;
        this.idPlane = idPlane;
        this.origin = origin;
        this.destiny = destiny;
        this.nationality = nationality;
    }

    public Long getPassport() {
        return passport;
    }

    public void setPassport(Long passport) {
        this.passport = passport;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Integer getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Integer idPlane) {
        this.idPlane = idPlane;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passport = " + passport +
                ", nameSurname = '" + nameSurname + '\'' +
                ", idPlane= " + idPlane +
                ", origin = '" + origin + '\'' +
                ", destiny ='" + destiny + '\'' +
                ", nationality ='" + nationality + '\'' +
                '}';
    }
}