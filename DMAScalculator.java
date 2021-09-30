public class DMAScalculator
{
   public static void main(double a,double b)                                                                   
    { 
      System.out.println("Addition");
      System.out.println(a+b);
      System.out.println("Subtraction");
      System.out.println(a-b);
      System.out.println("Multiplication");
      System.out.println(a*b);
      System.out.println("Division:");
      System.out.println("quotient");
      System.out.println(a/b);
      System.out.println("remainder");
      System.out.println(a%b);
      if(a==0)
      System.out.println("1st number is zero,it is not valid in Multiplication and Division");
      else
      System.out.println("1st number is not zero");
      if(b==0)
      System.out.println("2nd number is zero, it is not valid in Multiplication and Division");
      else
      System.out.println("2nd number is not zero");
    }   
}