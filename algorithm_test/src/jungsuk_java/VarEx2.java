package jungsuk_java;

public class VarEx2 {

  public static void main(String[] args) {

    int x = 4, y=2;
    int tmp;
    
    tmp = x;
    x = y;
    y = tmp;
    
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    
    System.out.printf("age:%d year:%d%n", 14, 2017);
    
    System.out.printf("%d%n",15);
    System.out.printf("%o%n",15);
    System.out.printf("%x%n",15);
    System.out.printf("%s%n",Integer.toBinaryString(15)); // 2 진수로 바꿔 줌
    
    // 문자 숫자 형변환.
    System.out.println(3+"0");
    System.out.println(3-'0');
    
    int a = 3;
    String b = 3 + "";
   // String c = "4";
    System.out.println(a+b);
  }

}
