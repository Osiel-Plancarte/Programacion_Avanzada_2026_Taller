package Java_Loops_Practice;

public class Java_Loop {
    public static void main(String[] args) {
        // Loop 1
        System.out.println("Loop 1:");
        int c = 4;
        int d = 5;
        for (int p = c + d; p > 1; p--)
        {
            System.out.println(p);
            if (p == 5)
                break;
            d = d + p;
        }
        System.out.println(d);

        // Loop 2
        System.out.println("\nLoop 2:");
        int x = 25;
        while (x < 50)
        {
            x++;
            if (x % 3 == 0)
                continue;
            System.out.println("bye!");
        }
        System.out.println(x);

        // Loop 3
        System.out.println("\nLoop 3:");
        int y = 5;
        do
        {
            y = y - 2;
            System.out.println("Hello");
        } while (y > -5);
        System.out.println(y);

        // Loop 4
        System.out.println("\nLoop 4:");
        int a= 12;
        while (a < 22)
        {
            System.out.println(a);
            a = a + 3;
        }
        System.out.println(a);
    }
}