class CmdLineArgs
{

 public static void main(String...a)
 {
  System.out.println();
  System.out.println("Count of Arguements:"+a.length);

  for(int i=0;i<a.length;i++)
  {
   System.out.printf("\nArguement #%d: %s",i+1,a[i]);
  }
  System.out.println();
 }
}
// You can also write the string in double quotes in the command line to include white spaces. White Spaces are the default string seperator.
/*D:\jprogs>java CmdLineArgs "Ruchit Karnawat" cs"7th"

Count of Arguements:2

Arguement #1: Ruchit Karnawat
Arguement #2: cs7th
*/