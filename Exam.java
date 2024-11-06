public class Exam {
    private String message;
    private String period;
    private String level;
    private double price;
    private boolean status;

    public Exam() {
        message = "Good luck";
    }

    public Exam(String period, String level) {
        this.period = period;
        this.level = level;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }

    public static class Midterm extends Exam {

        public Midterm() {
            super();
            System.out.println("Exam has started.");
        }

        public static class Essay extends Midterm {
        }
    }

    public static class Quiz {
    }

    public static class Essay extends Quiz {
    }

    public static void main(String[] args) {
        Midterm midterm = new Midterm();
    }
}