import java.util.*;
class ReverseArray{
    public static void main(String[] args){
        Scanner db=new Scanner(System.in);
        
        //for loop approach
        //size
        int n=db.nextInt();
        int arr[]=new int[n];

        //fill
        for(int i=0;i<n;i++){
           arr[i]=db.nextInt();
        }
       
      
        //logic
        for(int i =n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}


 //two pointer method
      /* int left=0;
       int right=n-1;

       while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        left++;
        right--;
       }
       System.out.println(Arrays.toString(arr));
    

