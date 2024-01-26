package chap01;

public class test01 {

  public static void main(String[] args) {

    
    String[] arr = {"03", "04"};
    int a = 2;
    String b = "";
    
    for(int i=0; i<arr.length; i++) {
      if(arr[i].equals("03")) {
        b = "원";
        
      } else {
        b = "%";      
      }
      System.out.println(b);
    }
    
    
  }

}
