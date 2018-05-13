package lab10;
//********************************************************************
//  Entry.java
//
//********************************************************************

public class Entry
{
   protected String word;
   protected Integer count;

   //-----------------------------------------------------------------
   //  Constructor: Sets up entry
   //-----------------------------------------------------------------
   public Entry(String w, Integer c) {
   word = w;
   count = c;
   }
   
      
   public String getWord()
	{
		return word;
	}

   public int getCount()
   {
     return count;
   
   }
   //-----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Word: " + word + "\n";

      result += "count: " + count;

      return result;
   }

   //-----------------------------------------------------------------
   //-----------------------------------------------------------------

}
