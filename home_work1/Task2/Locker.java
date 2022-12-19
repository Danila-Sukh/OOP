package home_work1.Task2;
public class Locker {
    private String status;

    public Locker(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Locker status = " + status;
    }
}
