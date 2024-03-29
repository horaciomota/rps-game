import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // 1 - Criar o texto que vai pedir o input
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you wanna play a game? Type: yes or no");

        String userChoice = scan.nextLine();
        System.out.println("You choose: " + userChoice);
        String computerChoice = scan.nextLine();

        System.out.println("Computer choice: " + computerChoice);
        // 2 - Criar aleatoriamente o input da maquina
        // 3 - Comparar e ver quem ganhou 
    }
}
