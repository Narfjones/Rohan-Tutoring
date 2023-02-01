package ExamPrep;
import java.util.*;

public class ExamPrep {
    
    private String question;
    private String answer;

    ArrayList<String> questList = new ArrayList();
    ArrayList<String> ansList = new ArrayList();

    public ExamPrep(){
        
    }

    public String[] selectQuestion(int x) {
        question = questList.get(x);
        answer = ansList.get(x);
        String[] quest = {question, answer};
        return quest;
    }

    public void setQuestion(String q){
        questList.add(q);
    }

    public void setAnswer(String a) {
        ansList.add(a);
    }

    public void printQandA(){
        System.out.println(questList);
        System.out.println(ansList);
    }




}
