class SumOfDigitsOfaNumber
{
public static void main (String[]args)
{
int num = 4566, sum = 0;
while(num!=0){
sum += num % 10;
num = num / 10;
}     
System.out.println ("Sum of digits : " + sum);
}
}