public class Task5 {
    private int a;

    Task5() {
        setA();
    }
    Task5(int a) {
        setA(a);
    }
    public void setA(int a) {
        if (a <= 100) {
            this.a = a;
        }
        else {
            this.a = 100;
        }
    }
    public void setA() {
        this.a = 0;
    }

    public void validation() {
        if (this.a > 100) {
            System.out.println(a + "is invalid");
        }
        else {
            System.out.println(a + " is valid");
        }
    }

    public static void main(String[] args) {
        Task5 test = new Task5();
        Task5 test1 = new Task5(5);
        Task5 test2 = new Task5(120);

        test.validation();
        test1.validation();
        test2.validation();
    }

}
