
public class BreakTest
{
    public static void main(String[] args) {

        l1:
        for (int i1 = 1; i1 < 5; i1++) {
            l2:
            for (int i2 = 1; i2 < 5; i2++) {
                l3:
                for (int i3 = 1; i3 < 5; i3++) {
                    if (i3 > 3) {
                        break l1;
                    }
                    System.out.println("" + i1 + i2 + i3);
                }
            }
        }
    }
}
