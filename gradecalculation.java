import java.util.*;
public class gradecalculation {
    public static void main(String[] args) {
      Scanner Sc =new Scanner (System.in);
       System.out.print("s1:");
      
       int s1= Sc.nextInt();
       System.out.print("s2:");
       int s2=Sc.nextInt();
       System.out.print("s3:");
       int s3=Sc.nextInt();
  
       int Total_marks=s1+s2+s3;
  System.out.println("Total Marks :"+Total_marks);
  int avg=Total_marks/3;
  System.out.println("Average:"+avg);
  if (avg>=80){
    System.out.println("Grade : A");

  }
  else if(avg>=50){
    System.out.println("Grade : B");
  }
  else if(avg < 50){
    System.out.println("Grade : C");
  }
  else
  {
    System.out.println("fail");
  }
  Sc.close();
    }
  
}
