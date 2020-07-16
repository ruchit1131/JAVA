class Complex
{
 private float real;
 float imag;
 
 void set(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
  print();
 }

 void print()
 {
  System.out.println("["+real+","+imag+"i]");
 }
}

class ClassDemo
{
 public static void main(String...arg)
 {
  //real=1;
  //imag=2;
  //set(1,2);

  Complex x,y;
  x=new Complex();
  y=new Complex();
  //x.real=1;
  y.imag=2;
  x.set(10,20);
  y.set(1.2,3.3);
 }
}