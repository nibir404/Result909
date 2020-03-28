import java.util.Scanner;

public class Result {

    //Taking number
    //Do sum of them
    //Then do the average

    public void result(){
        int num[] = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Taking result : ");
        for (int i=0;i<num.length;i++){
            num[i] = input.nextInt();
            sum = sum+num[i];
        }

        System.out.println("The Sum is : "+sum);
        System.out.println("The average number is : "+sum/5);

        //Find out the maximum
        //Find out the minimum

        int max = num[0];
        for (int i=1;i<num.length;i++){
            if (max<num[i]){
                max=num[i];
            }
        }

        int min = num[0];
        for (int i=1;i<num.length;i++){
            if (min>num[i]){
                min=num[i];
            }
        }

        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);

    }
}
