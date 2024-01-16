import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,turk,kim,fiz,muz,sum=0,bol=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = sc.nextDouble();
        if((mat >= 0) && (mat <= 100)){
            sum+=mat;
            bol++;
        }

        System.out.println("Türkçe notunuzu giriniz :");
        turk = sc.nextDouble();
        if((turk >= 0) && (turk <= 100)){
            sum+=turk;
            bol++;
        }

        System.out.println("Kimya notunuzu giriniz :");
        kim = sc.nextDouble();
        if((kim >= 0) && (kim <= 100)){
            sum+=kim;
            bol++;
        }

        System.out.println("Fizik notunuzu giriniz :");
        fiz = sc.nextDouble();
        if((fiz >= 0) && (fiz <= 100)){
            sum+=fiz;
            bol++;
        }

        System.out.println("Müzik notunuzu giriniz :");
        muz = sc.nextDouble();
        if((muz >= 0) && (muz <= 100)){
            sum+=muz;
            bol++;
        }

        sum = sum/bol;

        if(sum > 55){
            System.out.println("Tebriker geçtiniz!");
        }else{
            System.out.println("Maalesef kadınız!");
        }
        System.out.println("Ortalamanız :" +sum);
    }
}