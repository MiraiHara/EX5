package EX5_2;
import java.util.Scanner;
public class Ex5_2 {
    public static void main(String[] args) {
        LiveScoreBean score = new  LiveScoreBean();
        Subscriber sub1_2 = new Subscriber();
        Subscriber sub2_2 = new Subscriber();
        
        score.addPropertyChangeListener(sub1_2);
        score.addPropertyChangeListener(sub2_2);
        
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score : ");
            String input = in.nextLine();
            score.setSomeline(input);
            if (input.isEmpty()) {
                break;
            }
        }
    }
    
}
