import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Escolha o número da tabuada:");

        int number = Integer.parseInt(myObj.nextLine());
        System.out.println("Tabela de multiplicação de " + number);

        for (int cont = 1; cont < 11; cont++) {
            System.out.println(number + "x" + cont + " = " + cont * number);
        }
    }
}
