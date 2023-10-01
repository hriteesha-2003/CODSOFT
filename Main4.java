import java.util.Random;
    import java.util.Scanner;
    
    public class Main4 {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            Random num = new Random();
            
            System.out.println("Welcome to the Number Game!\n   THANK YOU :)");
            boolean startPlaying = true;
            int totalTry = 0;
            int success = 0;
            
            while (startPlaying) {
                int lowerRange = 1;
                int upperRange = 100;
                int mystreyNumber = num.nextInt(upperRange - lowerRange + 1) + lowerRange;
                int attempts = 0;
                boolean correctGuess = false;
                
                System.out.println("I'm thinking of a number between " + lowerRange + " and " + upperRange + ".");
                
                int maxAttempts = 5; 
                
                while (attempts < maxAttempts) {
                    try {
                        System.out.print("Enter your guess: ");
                        int userGuess = scan.nextInt();
                        attempts++;
                        
                        if (userGuess == mystreyNumber) {
                            correctGuess = true;
                            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                            success++;
                            break;
                        } else if (userGuess < mystreyNumber) {
                            System.out.println("Too low. Try again.");
                        } else {
                            System.out.println("Too high. Try again.");
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scan.nextLine(); // Consume the invalid input.
                    }
                }
                
                if (!correctGuess) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + mystreyNumber + ".");
                }
                
                totalTry += attempts;
                
                System.out.print("Do you want to play again? (y/n): ");
                String playAgainInput = scan.next().toLowerCase();
                if (!playAgainInput.equals("y")) {
                    startPlaying = false;
                }
            }
            
            System.out.println("Game Over! You won " + success + " rounds and took a total of " + totalTry + " attempts.");
            scan.close();
        }
    }
    
    

