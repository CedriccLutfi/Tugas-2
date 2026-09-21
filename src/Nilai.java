import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) throws Exception {
    
        int nilai;
        System.out.print("Masukkan Nilai Anda : ");
        Scanner input = new Scanner(System.in);
        nilai = input.nextInt();

        if (nilai >= 0 || nilai <= 100){
            if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai A");
        } else if (nilai >=70) {
            System.out.println("Nilai B");
        } else if (nilai >=55){
            System.out.println("Nilai C");
        } else if (nilai >=40){
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
        }
    }
}