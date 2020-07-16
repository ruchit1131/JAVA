class Sample
{
 static
  {
   System.out.println("Static -1");
  }
 
 {
  System.out.println("initializer-1");
 }

 Sample()
 {
  System.out.println("constructor-default");
 }
 
 Sample(int n)
 {
  System.out.println("constructor parameterized");
 }

 static
 {
  System.out.println("Static -2");
 }

 {
  System.out.println("initializer -2");
 }
}

class InitializerDemo
{
 public static void main(String...arg)
 {
  System.out.println();
  new Sample(10);
  System.out.println();
  new Sample();
  System.out.println();
 }
}