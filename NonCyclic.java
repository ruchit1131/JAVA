class Sample
{
 int n;
 static Sample s=new Sample();

 Sample()
 {
  System.out.println("creating object");
 }
}

class NonCyclic
{
 public static void main(String...arg)
 {
  System.out.println();
  Sample x,y;
  System.out.println("\ncreating x");
  x=new Sample();
  System.out.println("\ncreating y");
  y=new Sample();
  x.n=1;
  y.n=2;
  x.s.n=20;
  y.s.n=29;
 }
}