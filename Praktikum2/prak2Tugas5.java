public class prak2Tugas5 {
    public static void main(String[] args){
        System.out.println("Bilangan Genap 1 - 20 dengan pengecualian\nkelipatan 6 adalah adalah : ");

        for(int i = 0; i <= 20 ; i++)
        if((i%2 == 0) && (i != 0) && (i%6 != 0)){
            System.out.print(i+ " ");
        }
    }
}
