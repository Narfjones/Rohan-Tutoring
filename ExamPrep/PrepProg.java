package ExamPrep;
import java.util.Scanner;

public class PrepProg {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        FlashCard flash = new FlashCard();

        System.out.println("What question would you like to write on the flash card?");
        String quest = obj.nextLine();

        System.out.println("What is the answer to that question?");
        String ans = obj.nextLine();

        flash.setQuestion(quest);
        flash.setAnswer(ans);

        flash.printQandA();

    }



}
