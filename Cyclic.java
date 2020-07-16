class Sample
{
 int n;
 Sample s;
 
 Sample()
 {
  System.out.println("creating object");
  s=new Sample();
 }
}

class Cyclic
{
 public static void main(String...arg)
 {
  System.out.println();
  new Sample();
 }
}