import javax.swing.JOptionPane;

class javaGUI{
	public static void main(String[] args) {
		// showInputDialog takes all the inputs as Strings only
		String fn = JOptionPane.showInputDialog("Enter First Number: ");
		String sn = JOptionPane.showInputDialog("Enter Second Number: ");

		// Converts strings to int
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);

		int sum = num1+num2;
		/*
		To show message we use ShowMessgaeDialog
		it takes 4 parameters (null, "something", "title bar", JOptionPane.PLAIN_MESSAGE)
		*/
		JOptionPane.showMessageDialog(null, "Additin is "+sum, "Java GUI", JOptionPane.PLAIN_MESSAGE);
	}
}