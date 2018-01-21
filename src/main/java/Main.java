import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	private static final Integer COMBO_BOX2_NUMBERS_QUANTITY = 20;

	public static void main(String[] args) {
		JFrame window = new JFrame();

		JLabel number1Label = new JLabel("Liczba 1:");
		JLabel number2Label = new JLabel("Liczba 2:");
		JLabel resultLabel = new JLabel("Wynik:");

		final JTextField resultTextField = new JTextField("");

		JButton okButton = new JButton("OK");

		final JComboBox number1ComboBox = new JComboBox(Calc.comboBox1NumbersArray);
		final JComboBox number2ComboBox = new JComboBox(Calc.generateRandomNumbers(COMBO_BOX2_NUMBERS_QUANTITY));

		resultTextField.setEditable(false);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer result = Calc.calculate((Integer) number1ComboBox.getSelectedItem(),
						(Integer) number2ComboBox.getSelectedItem());
				resultTextField.setText(String.valueOf(result));
			}
		});

		// Ustawienia okna
		window.setMinimumSize(new Dimension(300, 200));
		window.setLayout(new GridLayout(0, 1));

		window.add(number1Label);
		window.add(number1ComboBox);
		window.add(number2Label);
		window.add(number2ComboBox);
		window.add(okButton);
		window.add(resultLabel);
		window.add(resultTextField);

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
