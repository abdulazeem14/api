class Maxnum
{
public static void main(String args[]){
int max=0;
       int arr[]={5,3,4,2,1};
      for(int i=0; i<=arr.length-1;i++)
       {
           if(arr[i]<arr[i+1])
           {
               max = arr[i];
               i--;
           }
       }
       System.out.println(max);
}
}