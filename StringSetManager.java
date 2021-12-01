import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    public  static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String[] stringSet = new String[100];
        Integer index = 0;
        while(true) {
            final StringCommand command = getCommand(sc);
            if(command == StringCommand.QUIT) {
                System.out.println("BYE!"); break;
            }
            switch (command) {
                case ADD : {
                    boolean chk = true;
                    final String str = getString(sc);
                    for(int i = 0; i < index; i++)
                    {
                        if(stringSet[i].equals(str))
                            chk = false;
                    }
                    if(chk) {
                        add(stringSet, str, index);
                        index++;
                    }
                    break;
                }

                case REMOVE: {
                    final String str = getString(sc);
                    boolean chk = false;
                    for(int i =0; i < index; i++)
                    {
                        if(stringSet[i].equals(str))
                            chk = true;
                    }
                    if(chk) {
                        remove(stringSet, str, index);
                        index--;
                    }
                    break;
                }

                case CLEAN: {
                    clear(stringSet, index);
                    index = 0;
                    break;
                }
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet, index);
        }
    }
    private static StringCommand getCommand(Scanner sc) {
        StringCommand command;
        try {
            String input = sc.next();
            command = StringCommand.valueOf(input.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            command = StringCommand.INVALID;
        } finally {
        }

        return command;
    }

    private static String getString(Scanner sc) {
        String input =  sc.next();
        return input;
    }

    private  static  void add(String[] Set, String str, Integer index) {
        Set[index] = str;
    }

    private static void remove(String[] Set, String str, Integer index) {
            int i = Arrays.asList(Set).indexOf(str);
            for (int j = i; j < index - 1; j++) {
                Set[j] = Set[j + 1];
            }

    }

    private static void clear(String[] Set, Integer index) {
        Set = new String[100];
    }

    private static void print(String[] Set, Integer index) {
        System.out.printf("Element Size: %d, Values = ", index);
        if(index == 0)
        {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for(int i = 0; i < index; i++)
        {
            if(i == index-1)
                System.out.println(Set[i] + "]");
            else
                System.out.print(Set[i] + ", ");
        }
    }
}