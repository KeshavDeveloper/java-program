import java.util.Scanner;
class PairElement
{
     public static void main(String args[])
     {

       int arr[]={5,6,3,2,4,8,9,1,3};
        System.out.println("enter a elemnt you want");
        Scanner sc=new Scanner(System.in);
         int no=sc.nextInt();
         //System.out.println("the pair of elemnt are:-");
             displayPair(arr,no);



      }

static void displayPair(int[] arr,int x)
     {

for(int i=0;i<arr.length;i++)
     {
        for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==x)
                   {

                         System.out.println(arr[i]+  ","+arr[j]+"="+x);
                    }

             }

          }
     }
}