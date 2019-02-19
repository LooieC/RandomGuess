import javax.swing.JOptionPane;

public class RandomGuess
{
	public static void main(String[] args)
	{
		int ran_Num, dif;
		String user_Num;
		String ran;
		
		ran_Num = 1 + (int) (Math.random() * 100);
		System.out.println(ran_Num);
		
		user_Num = JOptionPane.showInputDialog(null,
	            "Please guess a number between 1 to 5." + " Input your number", "Guessing Game",
	            JOptionPane.INFORMATION_MESSAGE);
	
	    JOptionPane.showMessageDialog(null,
	            "The difference between my number and your number is "
	                    + (Integer.parseInt(user_Num) - ran_Num),
	            "Guessing Game", JOptionPane.INFORMATION_MESSAGE);  
	
	    boolean valid = (ran_Num == Integer.parseInt(user_Num));
	    JOptionPane.showMessageDialog(null, "Does your number and my number match?" + "\n" + valid, "Guessing Game",
	            JOptionPane.INFORMATION_MESSAGE);
	}
}