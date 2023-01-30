package ExamPrep;
import java.util.*;

public class ExamPrep {
    
    private String question;
    private String answer;

    ArrayList<String> questList = new ArrayList();
    ArrayList<String> ansList = new ArrayList();

    public String getQuestion(int x) {
        question = questList.get(x);
        return question;
    }

    public String getAnswer(int x) {
        answer = ansList.get(x);
        return answer;
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
