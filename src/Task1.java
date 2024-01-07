public class Task1 {
    private char ch;

    public void setChar(char ch) {
        this.ch = ch;
    }

    public int getCharCode() {
        int code = ch;
        return code;
    }

    public void printChar() {
        System.out.println("Символ: " + ch + " Код: " + this.getCharCode());
    }

    public static void main(String[] args) {
        Task1 test = new Task1();
        test.setChar('a');
        test.printChar();
    }
}
