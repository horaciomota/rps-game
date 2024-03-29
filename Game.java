import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // 1 - Criar o texto que vai pedir o input
        Scanner scan = new Scanner(System.in);
        int randomNumber = generateARandomNumber();

        System.out.println("Do you wanna play a game? Type: yes or no");
        String sayYes = scan.nextLine();

        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.print("Shoot!: ");
        String userChoice = scan.nextLine();
        System.out.println("You choose: " + userChoice);

        String computerChoice = computerChoice(randomNumber);
        System.out.println("Computer choice: " + computerChoice );

        String theWinnerIs = decideTheWinner(computerChoice, userChoice);
        System.out.println(theWinnerIs);

    }
        // Criar a escolha da maquina baseado em um numero aletorio criado pela funcao anterior
        public static String computerChoice(int randomNumber) {
            switch (randomNumber) {
                case 0: return "Rock";
                case 1: return "Paper";
                case 2: return "Scissors";
                default: return "Not a valid option";
            }     
        }

        // Criar aleatoriamente o input da maquina
        public static int generateARandomNumber() {
        return (int) (Math.random() * 3);
        } 

        // Criar as condicoes para decidir o vencedor

        public static String decideTheWinner(String computerChoice, String userChoice ) {
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                return "There is no winners today!";                
            } else if ((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
            (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
            (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) {
     return "You are the winner!";
            }
            else {
                return "You lost, try next time!";
            }
            }
}
