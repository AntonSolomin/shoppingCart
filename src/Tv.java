
public class Tv {
    String brand;
    int channel = 1;
    int volume = 50;

    Tv(String brand) {
        this.brand = brand;

    }
    Tv(String brand, int channel, int volume) {
        this.brand = brand;
        reset();
    }
    public String toString () {
        return "Television " + brand + " on channel " + channel + ", at volume " + volume + ".";
    }
    public void increase (int amount) {
        if ((volume + amount) >= 100) {
            volume = 100;
        } else {
            volume += amount;
        }

    }
    public void decrease (int amount) {
        if ((volume - amount) <= 0) {
            volume = 0;
        } else {
            volume -= amount;
        }
    }
    public void setChannel(int number) {
        if (number <= 60) {
            channel = number;
        }

    }
    public void reset () {
        channel = 1;
        volume = 50;
    }
}
