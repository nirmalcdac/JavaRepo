public class client
{
		public static void main(String [] args) throws Exception
		{
				Book b = new Book();
				Author a = new Author();
				a.setbook("programming java");
				b.setauthor("khalid mughal");
				System.out.println("author of \""+a.get_Name()+"\" is \"" + b.get_Title()+ "\"");
		}
}