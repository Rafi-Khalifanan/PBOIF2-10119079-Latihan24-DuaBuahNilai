package pboif2.pkg10119079.latihan24.duabuahnilai;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: membandingkan dua buah nilai
 *
 */
public class PBOIF210119079Latihan24DuaBuahNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b;
        String aktifitas;
        
        do{
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukan nilai Pertama : ");
            a = input.nextInt();
            System.out.print("Masukan nilai Kedua : ");
            b = input.nextInt();
            
            if(a > b)
                System.out.println("Hasil : "+a+" Lebih besar dari "+b);
            else if (b > a)
                System.out.println("Hasil : "+a+" Lebih besar dari "+b);
            else
                System.out.println("Hasil : "+a+" Sama dengan "+b);
            
            System.out.println();
            System.out.print("Ulangi aktifitas ? (Ya/Tidak) : ");
            aktifitas = input.next();
            System.out.println();
            
        } while(aktifitas.equals("Ya") ||  aktifitas.equals("YA"));
    }
}
