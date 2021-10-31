import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculatorGrid {

  public static void main (String[] args) {

	// Створюємо панель

	  JPanel windowContent = new JPanel();

	// Задаємо менеджер розташування для цієї панелі

	  GridLayout gl = new GridLayout(4,2);
	  windowContent.setLayout(gl);

	// Створюємо компоненти в пам'яті

	  JLabel label1 = new JLabel("Number 1:");
	  JTextField field1 = new JTextField(10);
	  JLabel label2 = new JLabel("Number 2:");
	  JTextField field2 = new JTextField(10);
	  JLabel label3 = new JLabel("Sum:");
	  JTextField result = new JTextField(10);
	  JButton go = new JButton("Add");

	// Додаємо компоненти в панель

	  windowContent.add(label1);
	  windowContent.add(field1);
	  windowContent.add(label2);
	  windowContent.add(field2);
	  windowContent.add(label3);
	  windowContent.add(result);
	  windowContent.add(go);

	// Створюємо фрейм і задаємо панель для нього

	  JFrame frame = new JFrame("My First Calculator");
	  frame.setContentPane(windowContent);

	// Задаємо розмір і відображаємо вікно

	  frame.setSize(400,100);
	  frame.setVisible(true);
  }
}