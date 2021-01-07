package bookExample;

public class ArrayExample {
    public static void main(String[] args) {
        int numbers[]={10,20,3,56,1,4};

        System.out.println(numbers[0]);


//        int month_days[];
//               month_days = new int[12];
//               month_days[0]=31;
//               month_days[1]=28;
//               month_days[2]=31;
//               month_days[3]=30;
//               month_days[4]=31;
//               month_days[5]=30;
//               month_days[6]=31;
//               month_days[7]=31;
//               month_days[8]=30;
//               month_days[9]=31;
//               month_days[10]=30;
//               month_days[11]=31;
//        System.out.println("V aprele " + month_days[3]+ " dnei. ");

        System.out.println();

       int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("V aprele " + month_days[3] + " dnei. ");
        System.out.println();


        double nums [] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
        result = result + nums[i];
        {
            System.out.println("srednee znachenie ravno " + result / 5);
        }

    }
}
