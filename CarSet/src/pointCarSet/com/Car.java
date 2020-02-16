package pointCarSet.com;

import java.util.Objects;

public class Car {
    String names;
    String years;
    int radius;
    int diameterHelm;
    String typeShyn;
    String color;
    String body;
    boolean sWB;


    Car(String names, String years, int radius, int diamHelm, String ts, String color, String body, boolean sWB) {
        this.names = names;
        this.years = years;
        this.radius = radius;
        this.diameterHelm = diamHelm;
        this.typeShyn = ts;
        this.color = color;
        this.body = body;
        this.sWB = sWB;


    }

    Car(String names, String years, String body) {
        this.names = names;
        this.years = years;
        this.body = body;

    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public int getRadius() {
        return radius;
    }

    public int setRadius(int radius) {
        this.radius = radius;
        return radius;
    }

    public int getDiameterHelm() {
        return diameterHelm;
    }

    public void setDiameterHelm(int diameterHelm) {
        this.diameterHelm = diameterHelm;
    }

    public String getTypeShyn() {
        return typeShyn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean issWB() {
        return sWB;
    }

    public void setsWB(boolean sWB) {
        this.sWB = sWB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return radius == car.radius &&
                diameterHelm == car.diameterHelm &&
                sWB == car.sWB &&
                Objects.equals(names, car.names) &&
                Objects.equals(years, car.years) &&
                Objects.equals(color, car.color) &&
                Objects.equals(body, car.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names, years, radius, diameterHelm, color, body, sWB);
    }

    public void getsWm() {
    }
}


