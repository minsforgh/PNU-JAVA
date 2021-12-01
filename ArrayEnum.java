import java.util.Locale;
import java.util.Scanner;

enum Command {QUIT, ADD, LIST, SUM, MIN, MAX, INVALID};

public class ArrayEnum {
    public static  void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int values[] = new int[100];
        int i = 0;
        while(true) {
            final Command command = getCommand(sc);

            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }

            if(command == Command.INVALID) {
                System.out.println("Invalid Command");
                continue;
            }

            switch(command) {
                case ADD :
                    final int newValue = getValue(sc);
                    values[i] = newValue;
                    i++;
                    break;
                case LIST:
                    printList(values, i);
                    break;
                case SUM :
                    System.out.println(getSum(values, i));
                    break;
                case MIN :
                    System.out.println(getMin(values, i));
                    break;

                case MAX :
                    System.out.println(getMax(values,i));
                    break;
            }
        }
        sc.close();
    }

    private static Command getCommand(Scanner sc) {
        Command cmd;
        String input = sc.next();
        try {
            cmd = Command.valueOf(input.toUpperCase(Locale.ROOT));
        }
        catch(IllegalArgumentException e) {cmd = Command.INVALID;}
        finally{}
        return cmd;
    }

    private static int getValue(Scanner sc) {
        int value = sc.nextInt();

        return value;
    }

    private static void printList(int[] values, int i) {
        for(int j = 0; j < i; j++) {
            System.out.print(values[j] + " ");
        }
        System.out.printf("\n");
    }

    private  static int getSum(int[] values, int i) {
        int sum = 0;
        for(int j = 0; j < i; j++) {
            sum+= values[j];
        }
        return sum;
    }

    private static int getMax(int[] values, int i) {
        int max = -1;
        for(int j = 0; j < i; j++) {
            if(values[j] > max)
                max = values[j];
        }
        return max;
    }

    private static int getMin(int[] values, int i) {
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < i; j++) {
            if(values[j] < min)
                min = values[j];
        }
        return min;
    }
}