import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField SecondNumber = new JTextField(10);
    private JTextField ThirdNumber = new JTextField(10);
    private JTextField calcSolution = new JTextField(10);

    CalculatorView() {

        JPanel calcPanel = new JPanel() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 100);

            calcPanel.add(firstNumber);
            calcPanel.add(additionLabel);
            calcPanel.add(secondNumber);
            calcPanel.add(calculateButton);
            calcPanel.add(calcSolution);

            this.add(calcPanel);

        }

        public int getFirstNumber() {
            return Integer.parseInt(firstNumber.getText());
        }
    }


}
