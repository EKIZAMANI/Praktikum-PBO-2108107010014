public class prak2Tugas3 {
    public static void main (String[] args){
        int luas = 10;
        int i,j;

        for(i=0; i<=luas; i++) {
            for(j=1; j<=luas-i; j++) {
              System.out.print(" *");
            }
            System.out.println();
        }
    }
}
