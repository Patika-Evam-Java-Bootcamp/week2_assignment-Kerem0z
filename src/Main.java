import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
         ClientClass clientClass = new ClientClass();
        System.out.println("Bir değer giriniz");
        Scanner scanner = new Scanner(System.in);
        clientClass.processSwitch(scanner.nextInt());
    }
}