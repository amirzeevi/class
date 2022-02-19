package exercises;

public class func5 {
    public static void meuian(int num, char ch) {
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
            }
            for (int k = i; k < num; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(ch);
            }
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        meuian(10,'$');
    }
}
