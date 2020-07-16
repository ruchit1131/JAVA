class main
{
 
 public static void main(String arg[])
 {
  System.out.println();
  System.out.println("Executable main");
 //how constructers are called.
  new main();
  main y= new main();
  main z= new main("sd");
  new main("s");
 }

 main()
 {
  System.out.println("Default constructor..");
 }

 main(String arg)
 {
  System.out.println("Parameterized constructor..");
 }
}