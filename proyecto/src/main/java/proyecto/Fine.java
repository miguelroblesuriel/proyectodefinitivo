package proyecto;

public class Fine {
    private int amount;
    private int points;

    public Fine(int amount, int points) {
        this.amount = amount;
        this.points = points;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getPoints() {
        return this.points;
    }
}
