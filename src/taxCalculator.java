import java.util.Scanner;
public class taxCalculator {
    public static int c;
    private static Scanner input;
    public taxCalculator(){

    }

    public static void main (String args[])
    {
        taxCalculator taxCalculator=new taxCalculator();
        taxCalculator.input();

        if(c==1)
        {
            taxCalculator.paye(args);
            taxCalculator.input();
        }
        else
        {
            taxCalculator.contract(args);
            taxCalculator.input();
        }
    }

    public void input()
    {
        input = new Scanner(System.in);
        System.out.println("Enter 1 for PAYE or Enter 2 for Contract");
        c=input.nextInt();
    }

    public void paye (String args[])
    {
        double tc=137.50;
        //double tc=275;
        //double c=3483.34;
        double c=1983.34;
        //double c=2733.34;
        input = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        int bp=input.nextInt();
        System.out.println("Basic salary is ="+bp);
        // 20% of basic pay, here "C" is Cutoff point
        double twenty=0.2*c;
        System.out.println("20% is ="+twenty);
        //41% of basic pay
        double forty=0.41*(bp-c);
        System.out.println("41% is ="+forty);
        //total tax 20%+40%
        double tt=twenty+forty;
        // total tax-tax credits
        double paye=tt-tc;
        System.out.println("Toatl paye is ="+paye);
        // 2% is 836.34 per month
        double usc1=0.02*836.34;
        System.out.println("USC1 is ="+usc1);
        // 4 % is 498.34 per month
        double usc2=0.04*498.34;
        System.out.println("USC2 is ="+usc2);
        // 7% is remaining salary
        double usc3=0.07*(bp-1334.6666);
        //double usc3=0.07*(bp-2165.3333);
        System.out.println("USC3 is ="+usc3);
        double totalusc=usc1+usc2+usc3;
        System.out.println("Total USC is "+totalusc);

        // PRSI rate is 4%
        double prsi=0.04*bp;
        System.out.println("PRSI is "+prsi);
        double ded=paye+totalusc+prsi;
        double np=bp-ded;
        System.out.println("Total tax paid is="+ded);
        System.out.println("Nett pay is ="+np);



    }


    public  void contract (String args[])
    {
        //double tc=137.50;
        double tc=275;
        double c=3483.34;
        //double c=1983.34;
        //double c=2733.34;
        input = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        int bp=input.nextInt();
        System.out.println("Basic salary is ="+bp);
        // 20% of basic pay, here "C" is Cutoff point
        double twenty=0.2*c;
        System.out.println("20% is ="+twenty);
        //41% of basic pay
        double forty=0.41*(bp-c);
        System.out.println("41% is ="+forty);
        //total tax 20%+40%
        double tt=twenty+forty;
        // total tax-tax credits
        double paye=tt-tc;
        System.out.println("Toatl paye is ="+paye);
        // 2% is 836.34 per month
        double usc1=0.02*836.34;
        System.out.println("USC1 is ="+usc1);
        // 4 % is 498.34 per month
        double usc2=0.04*498.34;
        System.out.println("USC2 is ="+usc2);
        // 7% is remaining salary
        double usc3=0.07*(bp-1334.6666);
        //double usc3=0.07*(bp-2165.3333);
        System.out.println("USC3 is ="+usc3);
        double totalusc=usc1+usc2+usc3;
        System.out.println("Total USC is "+totalusc);

        // PRSI rate is 4%
        double prsi=0.04*bp;
        System.out.println("PRSI is "+prsi);
        double ded=paye+totalusc+prsi;
        double np=bp-ded;
        System.out.println("Total tax paid is="+ded);
        System.out.println("Nett pay is ="+np);


    }

}
