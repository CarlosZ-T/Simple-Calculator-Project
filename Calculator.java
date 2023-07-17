import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton AC;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    // Define double variables for operations...
    double a, b, result;
    // Define a string variable
    String op;
    public Calculator() {
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the display...
                txtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 7...
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 4...
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 1...
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 00...
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a String variable for backspacing...
                String backspace = null;
                // If the display isn't blank...
                if (txtDisplay.getText().length() > 0) {
                    // Create a StringBuilder object...
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    // Backspace by 1...
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    // Set the backspace variable...
                    backspace = String.valueOf(strB);
                    // Show the backspace on the display...
                    txtDisplay.setText(backspace);
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add an 8...
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 5...
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 2...
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 0...
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());

            }
        });
        button16.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // A decimal is present...
                if(txtDisplay.getText().contains(".")) {
                    // Parse the value and set the double variable...
                    double pm = Double.parseDouble(txtDisplay.getText());
                    // Set the value to its opposite number...
                    pm = pm*-1;
                    // Display the value...
                    txtDisplay.setText(String.valueOf(pm));
                }
                // A decimal isn't present...
                else {
                    // Parse the value and set the long variable...
                    long PM = Long.parseLong(txtDisplay.getText());
                    // Set the value to its opposite number...
                    PM = PM*-1;
                    // Display the value...
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 9...
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 6...
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a 3...
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        button20.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                 //  Check if a decimal is already present...
                if (!txtDisplay.getText().contains(".")) {
                    // If not, add a decimal...
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse and Set the first value...
                a = Double.parseDouble(txtDisplay.getText());
                // Set the operator...
                op = "+";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse and Set the first value...
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse and Set the first value...
                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse and Set the first value...
                a = Double.parseDouble(txtDisplay.getText());
                // Set the operator symbol...
                op = "÷";
                // Clear the display so the second value can be entered...
                txtDisplay.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse the value and set the b variable...
                b = Double.parseDouble(txtDisplay.getText());
                // If user decided to add...
                if (op == "+") {
                    // Add both values...
                    result = a + b;
                    // Display the result...
                    txtDisplay.setText(String.valueOf(result));
                }
                // If they chose to subtract...
                else if (op == "-") {
                    // Subtract the values...
                    result = a - b;
                    // Display the result...
                    txtDisplay.setText(String.valueOf(result));
                }
                // If they chose to multiply...
                else if (op == "*") {
                    // Multiply the values...
                    result = a*b;
                    // Display the result...
                    txtDisplay.setText(String.valueOf(result));
                }
                // If they chose to divide...
                else if (op == "÷") {
                    // Divide the values...
                    result = a/b;
                    // Display the result...
                    txtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
