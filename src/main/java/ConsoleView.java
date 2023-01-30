import java.util.Scanner;

public class ConsoleView implements Drawable{
    public void draw(GameArea area) {
        char[] array = area.getArray();
        for(int i = 0; i < 9; i++) {
             if(array[i] == '0')
                 System.out.print(" ");
             else
                 System.out.print(array[i]);
             if(i % 3 == 2) {
                 System.out.println();
             }
        }
    }

    public int getNext() {
        System.out.println("Enter a position: ");
        return new Scanner(System.in).nextInt();
    }
}
