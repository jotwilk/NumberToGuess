import java.util.Random;
import java.util.Scanner;

public class NumberToGuess {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        //int numberToGuess = 15;

        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");
        boolean isNumberGuessed = false; //zmienna przechowująca info czy liczba została zgadnięta
        int userGuess; //zmienna przechowująca wartość zaproponowaną przez użytkownika
        int numberOfTries = 5;

        while (isNumberGuessed == false & numberOfTries > 0) {

            userGuess = getNumberFromUser();

            if (userGuess == numberToGuess) {
                System.out.println("Zgadłeś!");
                isNumberGuessed = true;
            } else {
                numberOfTries--;
                System.out.println("Nie zgadłeś, zostało Ci " + numberOfTries + " prób");
            }

        }
        if (isNumberGuessed == false) {
            System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to " + numberToGuess);
        }


    }

    public static int getNumberFromUser() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int inputFromUser;
        inputFromUser = scanner.nextInt();

        if (inputFromUser > 100) {
            System.out.println("Podałeś za dużą liczbę");
        }

        if (inputFromUser < 0) {
            System.out.println("Podałeś za małą liczbę");
        }
        return inputFromUser;
    }

}
