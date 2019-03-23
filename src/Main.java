import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        System.out.println("total money?");

         double money = scanner.nextDouble();

        System.out.println("how many accounts do you have ? ");
        int accountnum =scanner.nextInt();
        double accountmoney[]= new double [accountnum];
        double accper[] =new double[accountnum];
        String accnames [] =new String[accountnum];
        int length= accper.length;


        System.out.println("total money:"+money );

        for(int i=0;i<length;i++){

            accper[i]= percentages( i );

           double a=money*accper[i] ;
           accountmoney[i]=a;

        }
        for(int i=0;i<accper.length;i++) {
            System.out.println("money in account " + (i + 1) + ": " + accountmoney[i]);
        }

    }
    public static double percentages(int length ){
        Scanner scanner = new Scanner(System.in );
        System.out.println("percentage saved for "+( length+1));
         double percent=0;
         percent= scanner.nextDouble();
         percent=percent*.01;
         return percent;
    }
}




