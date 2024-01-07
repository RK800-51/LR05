public class Task6 {
    private int max, min;

    Task6(int x) {
        setValues(x);
    }

    Task6(int x, int y) {
        setValues(x, y);
    }

    public void setValues(int x) {
        this.min = Math.min(this.min, x);
        this.max = Math.max(this.max, x);
    }

    public void setValues(int x, int y) {
        this.min = Math.min(x, y);
        this.max = Math.max(x, y);

    }

    public void printValues() {
        System.out.println(this.min + " - min " + this.max + " - max");
    }

    public static void main(String[] args) {
        Task6 test = new Task6(5);
        Task6 test1 = new Task6(10,20);
        test.printValues();
        test1.printValues();
    }


}
