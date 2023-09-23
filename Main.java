import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fak=1;
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi=inp.nextInt();

        for(int i=1;i<=sayi;i++){
            fak*=i;

        }
        System.out.print(sayi + "! =" +fak );

        








    }
}
