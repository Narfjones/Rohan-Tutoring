package ExamPrep;

import java.util.Scanner;

public class FlashCard extends ExamPrep{

    public FlashCard(){
        super();
    }

    public void createCard(){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is the question you would like to add?");
        String q = ask.nextLine();

        System.out.println("What is the answer to that question?");
        String a = ask.nextLine();

        questList.add(q);
        ansList.add(a);

        System.out.println("New flash card create. Thank you");
    }

    public void askRandomQuestion() {
        Scanner wait = new Scanner(System.in);

        int ind = (int)(Math.random() * questList.size());

        if (ind == 0) {
            System.out.println("You haven't made any flash cards.");
        } else {
        String q = questList.get(ind);
        String a = ansList.get(ind);

        System.out.println("------------------------------------------------------------");
        System.out.print(" ");
        System.out.println(q);
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");

        String newln = wait.nextLine();

        System.out.println("------------------------------------------------------------");
        System.out.print(" ");
        System.out.println(a);
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        }

    }

}
