class Complex
{
 private float real;
 private float imag;

 Complex(){}

 Complex(double real, double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 }

 Complex(Complex c)
 {
  real=c.real;
  imag=c.imag;
 }

 void set(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 }
 
 void print()
 {
  System.out.printf("[%.2f,%.2fi]\n",real,imag);
 }
 
 Complex add(Complex a)
 {
  Complex d=new Complex();
  d.real=a.real+real;
  d.imag=a.imag+imag;
  return d;
 }
 
 Complex subtract(Complex a)
 {
  Complex d=new Complex();
  d.real=real-a.real;
  d.imag=imag-a.imag;
  return d;
 }

 Complex multiply(Complex a)
 { 
  Complex d=new Complex();
  d.real=a.real*real-a.imag*imag;
  d.imag=a.real*imag+a.imag*real;
  return d;
 }

 Complex divide(Complex a)
 {
  Complex d=new Complex();
  float q=a.real*a.real+a.imag*a.imag;
  d.real=(real*a.real-imag*a.imag)/q;
  d.imag=(imag*a.real+real*a.imag)/q;
  return d;
 }

 static Complex add(Complex a,Complex b)
 {
  Complex d=new Complex();
  d.real=a.real+b.real;
  d.imag=a.imag+b.imag;
  return d;
 }
 
 static Complex subtract(Complex a,Complex b)
 {
  Complex d=new Complex();
  d.real=a.real-b.real;
  d.imag=a.imag-b.imag;
  return d;
 }

 static Complex multiply(Complex a,Complex b)
 { 
  Complex d=new Complex();
  d.real=a.real*b.real-a.imag*b.imag;
  d.imag=a.real*b.imag+a.imag*b.real;
  return d;
 }

 static Complex divide(Complex a,Complex b)
 {
  Complex d=new Complex();
  float q=b.real*b.real+b.imag*b.imag;
  d.real=(a.real*b.real-a.imag*b.imag)/q;
  d.imag=(a.imag*b.real+a.real*b.imag)/q;
  return d;
 }

 boolean equals(Complex a)
 {
  return real==a.real && imag==a.imag;
 }
}
