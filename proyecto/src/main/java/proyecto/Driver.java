package proyecto;

public class Driver {
    private String name;
    private int age;
    private String state;
    private String city;
    private int points;

    public Driver(String name, int age, String state, String city, int points) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.city = city;
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getState() {
        return this.state;
    }

    public String getCity() {
        return this.city;
    }

    public int getPoints() {
        return this.points;
    }

    public String toString() {
        return "Driver{name='" + this.name + "', age=" + this.age + ", state='" + this.state + "', city='" + this.city + "', points=" + this.points + "}";
    }
}
