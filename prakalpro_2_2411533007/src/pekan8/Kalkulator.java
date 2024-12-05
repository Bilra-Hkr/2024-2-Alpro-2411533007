package pekan8;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {

    private JFrame frame;
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();
    private double firstOperand = 0;
    private String operator = "";
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Kalkulator window = new Kalkulator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
     * Create the application.
     */
    public Kalkulator() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        display = new JTextField();
        display.setFont(new Font("Tahoma", Font.BOLD, 20));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBounds(10, 10, 265, 50);
        display.setEditable(false);
        frame.getContentPane().add(display);

        // Create buttons
        JButton backspaceButton = new JButton("\u2190");
        JButton clearButton = new JButton("C");
        JButton doubleZeroButton = new JButton("00");
        JButton addButton = new JButton("+");

        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton subtractButton = new JButton("-");

        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton multiplyButton = new JButton("*");

        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton divideButton = new JButton("/");

        JButton zeroButton = new JButton("0");
        JButton dotButton = new JButton(".");
        JButton equalsButton = new JButton("=");
        JButton moduloButton = new JButton("%");

        // Letak Variabel
        int x = 10, y = 70, width = 60, height = 50;

        // Set up buttons
        backspaceButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        backspaceButton.setBounds(24, 92, width, height);
        backspaceButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(backspaceButton);

        x += width + 5; // move to the next position
        clearButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        clearButton.setBounds(83, 92, width, height);
        clearButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(clearButton);

        x += width + 5;
        doubleZeroButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        doubleZeroButton.setBounds(142, 92, width, height);
        doubleZeroButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(doubleZeroButton);

        x += width + 5;
        addButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        addButton.setBounds(200, 235, width, height);
        addButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(addButton);

        y += height + 5; // move to the next row
        x = 10; // reset x position

        sevenButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        sevenButton.setBounds(24, 140, width, height);
        sevenButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(sevenButton);

        x += width + 5;
        eightButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        eightButton.setBounds(83, 140, width, height);
        eightButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(eightButton);

        x += width + 5;
        nineButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        nineButton.setBounds(142, 140, width, height);
        nineButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(nineButton);

        x += width + 5;
        subtractButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        subtractButton.setBounds(200, 140, width, height);
        subtractButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(subtractButton);

        y += height + 5;
        x = 10;

        fourButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        fourButton.setBounds(24, 188, width, height);
        fourButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(fourButton);

        x += width + 5;
        fiveButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        fiveButton.setBounds(83, 188, width, height);
        fiveButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(fiveButton);

        x += width + 5;
        sixButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        sixButton.setBounds(142, 188, width, height);
        sixButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(sixButton);

        x += width + 5;
        multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        multiplyButton.setBounds(200, 188, width, height);
        multiplyButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(multiplyButton);

        y += height + 5;
        x = 10;

        oneButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        oneButton.setBounds(24, 235, width, height);
        oneButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(oneButton);

        x += width + 5;
        twoButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        twoButton.setBounds(83, 235, width, height);
        twoButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(twoButton);

        x += width + 5;
        threeButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        threeButton.setBounds(142, 235, width, height);
        threeButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(threeButton);

        x += width + 5;
        divideButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        divideButton.setBounds(200, 92, width, height);
        divideButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(divideButton);

        y += height + 5;
        x = 10;

        zeroButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        zeroButton.setBounds(24, 283, width, height); // Same size as other buttons
        zeroButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(zeroButton);

        x += width + 5;
        dotButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        dotButton.setBounds(83, 283, width, height);
        dotButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(dotButton);

        x += width + 5;
        equalsButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        equalsButton.setBounds(142, 283, width, height);
        equalsButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(equalsButton);

        y += height + 5;
        x = 10;

        // Correct placement for modulo button
        moduloButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        moduloButton.setBounds(200, 283, width, height);
        moduloButton.addActionListener(new ButtonClickListener());
        frame.getContentPane().add(moduloButton);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            switch (command) {
                case "C":
                    clear();
                    break;
                case "\u2190":
                    backspace();
                    break;
                case "=":
                    calculate();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                    setOperator(command);
                    break;
                case "00":
                    appendInput("00");
                    break;
                default:
                    appendInput(command);
                    break;
            }
        }
    }

    private void appendInput(String value) {
        currentInput.append(value);
        display.setText(currentInput.toString());
    }

    private void clear() {
        currentInput.setLength(0);
        firstOperand = 0;
        operator = "";
        display.setText("");
    }

    private void backspace() {
        if (currentInput.length() > 0) {
            currentInput.deleteCharAt(currentInput.length() - 1);
            display.setText(currentInput.toString());
        }
    }

    private void setOperator(String op) {
        if (currentInput.length() > 0) {
            firstOperand = Double.parseDouble(currentInput.toString());
            operator = op;
            currentInput.setLength(0);
            display.setText(op);
        }
    }

    private void calculate() {
        if (currentInput.length() > 0 && !operator.isEmpty()) {
            double secondOperand = Double.parseDouble(currentInput.toString());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result = firstOperand / secondOperand;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
                case "%":
                    result = firstOperand % secondOperand;
                    break;
            }

            display.setText(String.valueOf(result));
            currentInput.setLength(0);
            operator = "";
        }
    }
}
