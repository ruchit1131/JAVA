class Sample
{
 private int sno;
 
 Sample(){}

 Sample(int sno)
 {
  this.sno=sno;
  System.out.println("Constructing Object :" +sno);
 }

 protected void finalize()
 {
  System.out.println("Destroying object :" +sno);
 }
}

class FinalizeDemo
{
 public static void main(String arg[]) throws InterruptedException
 {
  System.out.println();
  
  Sample a,b,c;
  
  a=new Sample(1);
  new Sample(2);
  b=new Sample(3);
 
  int n=10;
  if(n>5)
  {
   c=new Sample(4);
   Sample d=new Sample(5);
  }
 
  a=new Sample(6);
  
  System.out.println();
  System.gc();
  Thread.sleep(10);//10 milliseconds

  System.out.println("End of code...");

  //a.Sample();
  a.finalize();
  a.finalize();
 
  System.out.println();
 }
}