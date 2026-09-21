import java.util.Scanner;

public class Cekdiskon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String statusMember;

        System.out.println("Masukkan status member: ");
        statusMember = sc.nextLine();

        if (statusMember.equalsIgnoreCase("gold")){
            System.out.println("Diskon 20%");
        }else if(statusMember.equalsIgnoreCase("silver")){
            System.out.println("Diskon 15%");
        }else if(statusMember.equalsIgnoreCase("bronze")){
            System.out.println("Diskon 10%");
        }else{
            System.out.println("Tidak ada diskon");
        }
    }
}