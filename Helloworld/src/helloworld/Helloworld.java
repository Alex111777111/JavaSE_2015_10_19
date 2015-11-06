package helloworld;

public class Helloworld
{
    public static void main(String[] args) {
        int x = 20;
        for (int z = 0; z < x; z = z + 1) {
            for (int y = 0; y < x; y = y + 1) {
                if (z == 0 || z == x - 1 || y == 0 || y == x-1 || y%4 == 0 || z%2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
