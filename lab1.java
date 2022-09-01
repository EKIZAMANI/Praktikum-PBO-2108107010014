import java.util.Scanner;
public class lab1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        //Tampilan awal
        System.out.println("+---+--------------+-----------------+");
        System.out.println("|No | Nama Barang  |   Harga Barang  |");
        System.out.println("+---+--------------+-----------------+");
        System.out.println("| 1 | Celana       |    100          |");
        System.out.println("| 2 | Sweater      |    75           |");
        System.out.println("| 3 | Kemeja       |    80           |");
        System.out.println("| 4 | Sepatu       |    200          |");
        System.out.println("+---+--------------+-----------------+");

        //deklarasi variable 
        int Pilihan = 0;
        int Num = 0;
        int Harga = 0;

        //pengulangan jika user salah memasukkan inputan
        for(int i = 0; ((Num != 1)&&(Num != 2)&&(Num != 3)&&(Num != 4)); i++){
            System.out.print("Masukkan No Barang : ");
            Num = in.nextInt();
        
            switch (Num){
                case 1:
                    Pilihan = 1;
                    Harga = 100;
                    break;
                case 2:
                    Pilihan = 2;
                    Harga = 75;
                    break;
                case 3:
                    Pilihan = 3;
                    Harga = 80;
                    break;
                case 4:
                    Pilihan = 4;
                    Harga = 200;
                    break;
                default:
                    System.out.println("Pilihlah barang yang tersedia!!!");
            }
        }

        //input user jumlah barang
        System.out.print("Masukkan Jumlah barang : ");
        int jumlah = in.nextInt();
        
        //kalkulasi harga sebelum diskon
        int hasil = (Harga * jumlah);

        //kalkulasi harga setelah diskon
        int diskon = (hasil/100)*85;

        //output
        System.out.println(" JUMLAH BARANG = " + jumlah + "\n HARGA BARANG  = " + Harga + 
        "\n TOTAL HARGA   = " + hasil + "\n DISKON 15%    = " + diskon );
        System.out.println("Terima kasih sudah Berbelanja!!!");
    }
}