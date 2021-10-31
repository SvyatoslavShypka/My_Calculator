import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{

  Calculator parent; //посилання на вікно калькулятора

  char selectedAction = ' '; // +, -, /, або *
  double currentResult = 0;

//Конструктор зберігає посилання на вікно калькулятора
//у змінній екземпляра класу
  CalculatorEngine (Calculator parent) {
    this.parent = parent;
  }

  public void actionPerformed (ActionEvent e){

    //Отримати джерело дії
    JButton clickedButton = (JButton) e.getSource();
    String dispFieldText = parent.displayField.getText();
    double displayValue = 0;
  //Отримати число з дисплея калькулятора,
  //якщо він не порожній.
  //Знак оклику - це оператор заперечення
    if (!"".equals(dispFieldText)) {
      displayValue = Double.parseDouble(dispFieldText);
    }
    Object src = e.getSource();

  //Для кожної кнопки арифметичної дії
  //запам'ятати її:+,-,/, або *, зберегти поточне число
  //у змінній currentResult, і очистити дисплей
  //для введення нового числа
    if (src == parent.buttonPlus) {
		selectedAction = '+';
		currentResult = displayValue;
		parent.displayField.setText ("");
    } else if (src == parent.buttonMinus) {
		selectedAction = '-';
		currentResult = displayValue;
		parent.displayField.setText ("");
    } else if (src == parent.buttonDivide) {
		selectedAction = '/';
		currentResult = displayValue;
		parent.displayField.setText ("");
    } else if (src == parent.buttonMultiply) {
		selectedAction = '*';
		currentResult = displayValue;
		parent.displayField.setText ("");
    } else if (src == parent.buttonEqual) {

	//Здійснити арифметичну дію, залежно
	//від selectedAction, оновити змінну currentResult
	//і показати результат на дисплеї
      if (selectedAction == '+') {
		currentResult += displayValue;
	  //Конвертувати результат в рядок, додаючи його
	  //до порожнього рядку і показати його
		parent.displayField.setText(""+currentResult);
      } else if (selectedAction == '-') {
		currentResult -= displayValue;
		parent.displayField.setText(""+currentResult);
      } else if (selectedAction == '/') {
		currentResult /= displayValue;
		parent.displayField.setText(""+currentResult);
       } else if (selectedAction == '*') {
		currentResult *= displayValue;
		parent.displayField.setText(""+currentResult);
       }
    } else {

	//Для всіх цифрових кнопок приєднати напис на
	//кнопці до напису в дисплеї
      String clickedButtonLabel=clickedButton.getText();
      parent.displayField.setText(dispFieldText +
							clickedButtonLabel);
    }
  }
}