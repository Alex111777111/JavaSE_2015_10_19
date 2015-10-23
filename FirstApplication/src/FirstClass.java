
public class FirstClass
{
    public static void main(String[] args) {
        int SIZE = 7;

        for (int k = 0; k < SIZE; k++) {
            for (int i = 0; i < SIZE; i++) {
                if (i < SIZE - k - 1 ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
