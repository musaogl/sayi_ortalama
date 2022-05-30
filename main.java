import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n,toplam=0,sayacı=0;
        double avg;

        Scanner input=new Scanner(System.in);
        System.out.print("Kaça kadar hesaplamasını istersiniz :");
        n=input.nextInt();
        for (int i=0 ;i <= n ; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayacı++;
            }
        }
        avg=toplam/sayacı;
        System.out.println("Girdiğiniz sayına kadar 3 ve 4 tam bölnen sayıların Ortalaması :"+avg);
        }
    }

