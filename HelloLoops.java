public class HelloLoops
{
	public static void main(String [] args)
	{
		for (int i = 0, i<5, i++);
		{
			
			System.out.println(i + " " + a)

		}
		System.out.println();
		// if you wanted to print it boolean a ("System.out.println(a)"), a would be out of scope
		// it would be an error because boolean a wouldn't exist outside of the braces of the for loop

		int i = 0;
		while(i<5) //only the condition; while it is true, you keep doing it
		{
			System.out.println(i);
			i++; //make sure to update so that it doesn't run infinitely

			if (i == 5)
				continue; //go into next iteration

			if (i == 7)
				break; //break out of loop

			System.out.println(i);

		}
		i = 0;
		do //do while loop does not check condition first
		{
		System.out.println(i);
		i++;
		} while (i <5);
	}
}