class DefaultValues
{
 int n;
 char x;
 boolean b;
 Complex c;

 void show()
 {
  System.out.println();
  System.out.println("n : |"+n+"|");
  System.out.println("x : |"+x+"|");
  System.out.println("b : |"+b+"|");
  System.out.println("c : |"+c+"|");
  System.out.println();
 
  int y;
 
 // System.out.println("y : |"+y+"|");
  System.out.println();
 }
 public static void main(String...arg)
 {
  new DefaultValues().show();
  
  System.out.println();
 }
}