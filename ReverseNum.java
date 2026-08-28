import java.util.*;
class ReverseNum{
    public static void main(String args[]){
        Scanner db=new Scanner(System.in);
        int num=db.nextInt();
        int reverse=0;
        while(num!=0){
            int digit=num % 10;
            reverse=reverse*10 +digit;
            num=num/10;
        }
        System.out.println(reverse);
    }
}