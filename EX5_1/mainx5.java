package EX5_1;
import java.util.Scanner;

public class mainx5 {
    public static void main(String[] args) {
        ScoreSource scsu= new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        scsu.addObserver(sub1);
        scsu.addObserver(sub2);
        
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score : ");
            String input = in.nextLine();
            scsu.setScoreLine(input);
            if (input.isEmpty()) {
                break;
            }
        }
    }
    
}
