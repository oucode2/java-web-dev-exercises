package exercises;
public class Array
{
    public static void main(String args[]) {
        int array[] = { 1, 1, 2, 3, 5, 8 };
        System.out.print("Odd Numbers are: ");
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


