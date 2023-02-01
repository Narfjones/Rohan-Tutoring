package ExamPrep;
import java.util.Scanner;

public class PrepProg {

    public static void main(String[] args){
        flash();
    }

    public static void flash(){
        Scanner obj = new Scanner(System.in);

        FlashCard flash = new FlashCard();

        System.out.println("Which would you like to do?");
        System.out.println("1: Study with existing flash cards.");
        System.out.println("2: Create a new flash card.");
        System.out.println("3: Quit studying.");
        int r = obj.nextInt();

        if (r == 1) {
            flash.askRandomQuestion();
            flash();
        } else if (r == 2) {
            flash.createCard();
            flash();
        } else {

        }
    }



}
