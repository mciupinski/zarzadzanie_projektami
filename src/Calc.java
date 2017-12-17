
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {
	public static void main(String[] args) {	
			// Tworzenie okna i kontrolek
			JFrame window = new JFrame();
			JLabel[] label = new JLabel[3];
			JTextField textfield = new JTextField("");
			JTextField textfield2 = new JTextField("");
			JTextField textfield3 = new JTextField("");
			textfield3.setEditable(false);
			JButton button = new JButton("Sprawdz numer");
			
			// Ustawienia okna
			window.setMinimumSize(new Dimension(300, 200));
			window.setLayout(new GridLayout(0, 1));

			label[0] = new JLabel("Liczba 1 :");
			label[1] = new JLabel("Liczba 2 :");
			label[2] = new JLabel("Wynik :");
			window.add(label[0]);
			window.add(textfield);
			window.add(label[1]);
			window.add(textfield2);
			window.add(button);
			
			window.add(label[2]);
			window.add(textfield3);
			
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
			
					int a = Integer.parseInt(textfield.getText());
					int b = Integer.parseInt(textfield2.getText());
					textfield3.setText(String.valueOf(a * b));
				}
			});
			window.setVisible(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}

class Pesel
{
	static private String peselNrString = "00000000000";
	static int[] peselNrIntArray;
	
	Pesel(String pesel)
	{
		setPeselNr(pesel);
	}
	
	public String getPeselNr() {
		return peselNrString;
	}
	public void setPeselNr(String peselNr) {
		peselNrString = peselNr;	
	}
	static boolean isPeselValid(String pesel)
	{
		if (String.valueOf(pesel).length() == 11)
		{
			peselNrIntArray = new int [pesel.length()];
			for (int i=0; i < pesel.length(); i++)
			{
				try
				{
				peselNrIntArray[i] = Integer.parseInt(pesel.substring(i, i+1));
				}
				catch (NumberFormatException parsingExep)
				{
					return false;
				}
			}
			if(((9 * peselNrIntArray[0] +
				 7 * peselNrIntArray[1] +
				 3 * peselNrIntArray[2] +
				 1 * peselNrIntArray[3] +
				 9 * peselNrIntArray[4] +
				 7 * peselNrIntArray[5] +
				 3 * peselNrIntArray[6] +
				 1 * peselNrIntArray[7] +
				 9 * peselNrIntArray[8] +
				 7 * peselNrIntArray[9]) % 10) == peselNrIntArray[10])
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	static public String getBithDate(String pesel) {
		if ( (Integer.parseInt(pesel.substring(2,3)) == 2 || (Integer.parseInt(pesel.substring(2,3)) == 3)))
		{
			return ("20" + pesel.substring(0,2) + "-" + pesel.substring(2,4) + "-" + pesel.substring(4,6));
		}
		else
		{
			return ("19" + pesel.substring(0,2) + "-" + pesel.substring(2,4) + "-" + pesel.substring(4,6));	
		}
	}

	static public String getSex(String pesel)
	{
		if (( Integer.parseInt(pesel.substring(9, 10)) % 2) != 0)
		{
			return "Mezczyzna";
		}
		else
		{
			return "Kobieta";
		}
	}
}