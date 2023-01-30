import java.util.Scanner;

public class ConsoleView implements Drawable{
    public void draw(GameArea area) {
        char[] array = area.getArray();
        for(int i = 0; i < 3; i++) {
            System.out.print(array[i*3] + "|" + array[i*3 + 1] + "|" + array[i*3 + 2]);
            System.out.println();
            if(i == 2) {
                System.out.println();
                break;
            }
            for(int j = 0; j < 10; j++)
                System.out.print("-");
            System.out.println();
        }
    }

    public int getNext() {
        System.out.println("Enter a position: ");
        return new Scanner(System.in).nextInt();
    }
}
