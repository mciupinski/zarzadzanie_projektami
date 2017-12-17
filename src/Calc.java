import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
