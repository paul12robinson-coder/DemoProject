package Demo;

public class StringData 

{
	
		String titleName;


	    public StringData(String Name) 
	    {
	        titleName = Name;

	        String Title = "Thats the word";
	        String Author = "Paul Robinson";
	        String Show = "As the word turns";
	        
	        System.out.println("Title Name: " + titleName);
	        System.out.println("Title: " + Title);
	        System.out.println("Author: " + Author);
	        System.out.println("Show: " + Show);
	        
	    }
	    //public void printtitleName()
	    public static void main(String[] args) 
		{
			new StringData("Java basics");

		}

	
}
	

	    
	

		



