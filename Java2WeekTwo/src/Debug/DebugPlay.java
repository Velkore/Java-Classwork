package Debug;

public class DebugPlay
{
   protected String title;
   protected String author;

   DebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
         " by " + author);
   }
}