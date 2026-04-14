package Demo;

public class Book 

{
	

		String titleName;


	    public Book(String Name) 
	    {
	        titleName = Name;

	        String Title = "Thats the word";
	        String Author = "Paul Robinson";

	        System.out.println("Title Name: " + titleName);
	        System.out.println("Title: " + Title);
	        System.out.println("Author: " + Author);
	    }

	    	
	
		public static void main(String[] args) 
		{
			new Book("Java basics");

		}


		//private void Book() {
			// TODO Auto-generated method stub

		}

