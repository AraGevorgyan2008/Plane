import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Plane {


    private int id;
    public static final int during_boarding = 15;
    public static final int  during_preparation = 15;
    private int teletramp;
    private String time ;
    private int day;
    private int mount;
    private int year;
    private boolean arriving_or_departing;
    private int proitet;

    public Plane(int id, int teletramp, String time, int day, int mount, int year, boolean arriving_or_departing, int proitet) {
        this.id = id;
        this.teletramp = teletramp;
        this.time = time;
        this.day = day;
        this.mount = mount;
        this.year = year;
        this.arriving_or_departing = arriving_or_departing;
        this.proitet = proitet;
    }

    public boolean isArriving_or_departing() {
        return arriving_or_departing;
    }

    public int getProitet() {
        return proitet;
    }

    public void setProitet(byte proitet) {
        this.proitet = proitet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getArriving_or_departing() {
        return arriving_or_departing;
    }

    public void setArriving_or_departing(boolean arriving_or_departing) {
        this.arriving_or_departing = arriving_or_departing;
    }

    public int getDuring_boarding() {
        return during_boarding;
    }

    public int getDuring_preparation() {
        return during_preparation;
    }

    public int getTeletramp() {
        return teletramp;
    }

    public void setTeletramp(int teletramp) {
        this.teletramp = teletramp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", teletramp=" + teletramp +
                ", time='" + time + '\'' +
                ", day=" + day +
                ", mount=" + mount +
                ", year=" + year +
                ", arriving_or_departing=" + arriving_or_departing +
                ", proitet=" + proitet +
                '}' + '\n';
    }


}
