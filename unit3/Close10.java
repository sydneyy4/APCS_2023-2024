public class Close10{
  public static int close10(int a, int b) {
    if (Math.abs(10-a) < (Math.abs(10-b))){
      return a;
    }
    if (Math.abs(10-b) < (Math.abs(10-a))){
      return b;
    }else{
      return 0;
    }
  }
  public static void testClose10 (int a, int b, int expected){
    int result = close10 (a,b);

    System.out.println("a:" + a + " b:" + b + " result:" + result);

    if (result == expected){
      System.out.println("Expected");
    }else{
      System.out.println("Unexpected");
    }
  }
  public static void main (String [] args){
    testClose10 (8, 13, 8);
    testClose10 (13, 8, 8);
    testClose10 (13, 7, 0);
  }
}