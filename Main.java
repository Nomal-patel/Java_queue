
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Assingment_6.PrintQueue queue = new Assingment_6.PrintQueue();

        int pageid = 1;

        boolean stay =  true;

        while (stay){

            Scanner input = new Scanner(System.in);

            System.out.println("Input Command: Add, Print or Exit ");
            String command = input.nextLine();
            System.out.println();

            switch (command){
                case "Add":
                    System.out.println("How many pages would you like to add: ");
                    int page = input.nextInt();
                    Assingment_6.PrintJob job = new Assingment_6.PrintJob(pageid,page);
                    System.out.println();
                    queue.push(job);
                    pageid++;

                    break;

                case "Print"  :
                    queue.pop();

                    break;

                case  "Exit":
                    stay = false;
                    break;

                default:
                    System.out.println("INVALID COMMAND PLEASE TRY AGAIN");

            }
        }
    }
}











