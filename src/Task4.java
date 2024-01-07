public class Task4 {
    private char ch;
    private int digit;

    Task4(char ch, int digit) {
        this.ch = ch;
        this.digit = digit;
    }
    Task4(double digit) {
        int decimal = (int) digit;
        this.ch = (char) digit;
        this.digit = (int) Math.floor((digit - decimal)*100);
    }

    public static void main(String[] args) {
        Task4 test = new Task4('a', 10);
        Task4 test2 = new Task4(65.127);
    }

}
