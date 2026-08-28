import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner db=new Scanner(System.in);
        int num=db.nextInt();
        int realnum=num;
        int reverse=0;

        while(num!=0){
            int digit=num % 10;
            reverse=reverse * 10 +digit;
            num=num/10;
        }

        if(realnum == reverse){
            System.out.println("It is Palindrome " +reverse);
        }
        else{
            System.out.println("It is not Palindrome " +reverse);
        }
    }
}