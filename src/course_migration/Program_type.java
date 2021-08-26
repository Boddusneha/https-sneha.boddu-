package course_migration;

public class Program_type extends Connecting_to_db{
	public void programtype() throws InterruptedException
	{
	 int number1 = Integer.parseInt(programtype);
	 System.out.println("program type is "+programtype);
	if(number1==1)
	{
		//program type as pt
		execute_cc pt=new execute_cc();
		pt.executeCodeChallenge();
		
	}
	System.out.println("executing cc programs");
	}

}
