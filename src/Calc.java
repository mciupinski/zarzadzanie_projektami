import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {
	public static void main(String[] args) {

		Integer[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// Tworzenie okna i kontrolek
		JFrame window = new JFrame();
		JLabel[] label = new JLabel[3];
		JTextField textfield = new JTextField("");
		JTextField textfield2 = new JTextField("");
		JTextField textfield3 = new JTextField("");
		JComboBox cb1 = new JComboBox(numbersArray);
		JComboBox cb2 = new JComboBox(generateRandomNumbers());
		label[0] = new JLabel("Liczba 1 :");
		label[1] = new JLabel("Liczba 2 :");
		label[2] = new JLabel("Wynik :");
		JButton button = new JButton("Sprawdz numer");

		textfield3.setEditable(false);

		cb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = (Integer) cb1.getSelectedItem();
				int b = (Integer) cb2.getSelectedItem();
				textfield3.setText(String.valueOf(a * b));
			}
		});

		// Ustawienia okna
		window.setMinimumSize(new Dimension(300, 200));
		window.setLayout(new GridLayout(0, 1));

		window.add(label[0]);
		window.add(cb1);
		window.add(label[1]);
		window.add(cb2);
		window.add(button);
		window.add(label[2]);
		window.add(textfield3);

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private static Integer[] generateRandomNumbers() {
		Integer tab[] = new Integer[20];
		Random randomNumber = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randomNumber.nextInt(100);
		}
		return tab;
	}
}
