public class Task3 {
    private int a, b;

    Task3() {
        this.a = -1;
        this.b = -1;
    }
    Task3(int a) {
        this.a = a;
        this.b = -1;
    }
    Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {
        Task3 task = new Task3();
        Task3 task1 = new Task3(1);
        Task3 task2 = new Task3(1, 2);

    }

}
