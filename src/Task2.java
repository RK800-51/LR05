public class Task2 {
    char ch = 'A';
    char ch1 = 'D';

    public void printResult() {
        for (char i = this.ch; i <= this.ch1; i++) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.printResult();
    }


}
