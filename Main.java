import java.util.Scanner;
public class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
double[] p=new double[5];
  double c=0;
  System.out.println("введите суммы пяти последних покупок");
  for (int i=0; i<p.length; i++){
    System.out.println("покупка №"+(i+1)+": ");
    p[i]=sc.nextDouble();
  }
  double s=0;
  for (int i=0;i<p.length;i++){
    s=s+p[i];
  }
  if (s>5000){
    c=0.10;
  } else if (s>2000){
    c=0.05;
  } else {
    c=0.00;
  }
  double b=s*c;
  System.out.println("начислено бонусов с покупки: "+b);
  sc.close();
}
}
