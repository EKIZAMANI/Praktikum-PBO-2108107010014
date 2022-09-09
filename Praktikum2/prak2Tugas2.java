import java.util.Scanner;

public class prak2Tugas2 {
    public static void main(String[] args){

            //input nilai
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Nilai : ");
            int marks = in.nextInt();

            if(marks<41){
                System.out.println("Grade = E");
            }
            else if(marks>=41 && marks<51){
                System.out.println("Grade = D");
            }
            else if(marks<60 && marks>=51){
                System.out.println("Grade = C");
            }
            else if(marks >= 60 && marks <69){
                System.out.println("Grade = BC");
            }
            else if(marks >= 69 && marks <78){
                System.out.println("Grade = B");
            }
            else if(marks >= 78 && marks <87){
                System.out.println("Grade = AB");
            } 
            else if(marks >= 87 && marks <= 100){
                System.out.println("Grade = A");
            }
            else{
                System.out.println("MASUKKAN NILAI YANG VALID!");
            }
    }
}
