package Pratik9;
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz:");
        heat=input.nextInt();

        if(heat<5) {
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }
            else if(5<=heat && heat<=15){
                if (heat<10){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
                else {
                    System.out.println("Pikniğe Gidebilirsiniz.");
                }
        }
            else if(15<=heat && heat<=25){
            System.out.println("Pikiniğe Gidebilirsiniz.");


        }
            else if(heat>25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }


    }
}
