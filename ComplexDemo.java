class ComplexDemo
{
 public static void main(String...arg)
 {
  Complex x,y,z;

  x=new Complex();
  x.set(1.3,3.4);

  y=new Complex();
  y.set(3.2,2.2);

  z=Complex.add(x,y);

  System.out.println();
  x.print();
  y.print();
  z.print();
  System.out.println();
 }
}