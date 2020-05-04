package studios;

import java.util.Scanner;

class NumberOfChar {

    static void getOccuringChar(String str)
    {
        // Create an array of size 256
        int count[] = new int[256];

        int stringLength = str.length();

        // Initialize count array index
        for (int i = 0; i < stringLength; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < stringLength; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System. out. println("Enter a string");
        String str = in.nextLine();
        getOccuringChar(str);
    }
}