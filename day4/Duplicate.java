public class Duplicate
{  
public static void main(String[] args)
{  
int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
System.out.println("The original array is: ");
for (int i = 0; i < arr.length; i++)
System.out.print(arr[i] + " ");
  
System.out.println("\n\n Duplicate elements in given array: ");    
for(int i = 0; i < arr.length; i++)
{  
for(int j = i + 1; j < arr.length; j++)
{  
if(arr[i] == arr[j])  
System.out.println(arr[j]);  
}  
}  
}  
}  