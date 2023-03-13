import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Invoker ivk = new Invoker();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Comando: ");
            String str = sc.nextLine();
            String [] arrStr = str.split(" ");
            System.out.println(Arrays.toString(arrStr));
            switch (arrStr.length) {
                case 5:
                    ivk.addCommand(arrStr[0], new UpdateClientCommand(
                            new Client(), Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[3]), arrStr[4])
                    );
                    ivk.invoker(arrStr[0]);
                    break;
                case 4:
                    ivk.addCommand(arrStr[0], new AddClientCommand(new Client(Integer.parseInt(arrStr[2]), arrStr[3])));
                    ivk.invoker(arrStr[0]);
                    break;
                case 3:
                    ivk.addCommand(arrStr[0], new RemoveClientCommand(new Client(), Integer.parseInt(arrStr[2])));
                    ivk.invoker(arrStr[0]);
                    break;
                case 2:
                    ivk.addCommand(arrStr[0], new AllClientsCommand(new Client()));
                    ivk.invoker(arrStr[0]);
                    break;
                case 1:
                    return;
                default:
                    System.out.println("Comando incorreto!!!");
            }
        }
    }
}