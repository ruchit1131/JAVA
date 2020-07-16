class Complex
{
 private float real, imag;
 Complex()
 { 
  System.out.println("Default Constructor...");
 }

 Complex(double n)
 {
  this(n,n);
  System.out.println("One arguement...");
 }

 Complex(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
  System.out.println("Two arguements...");
 }

 Complex(Complex c)
 {
  this(c.real,c.imag);
  System.out.println("Copy constructor..");
 }
}
class ConsDemo
{
 public static void main(String...arg)
 {
  System.out.println();
  new Complex();
  
  System.out.println();
  new Complex(-1);

  System.out.println();
  Complex c=new Complex(1.3,2.3);

  System.out.println();
  Complex d;
  d= new Complex(c);

  System.out.println();
 }
}