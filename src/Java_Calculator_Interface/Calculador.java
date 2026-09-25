package Java_Calculator_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculador extends JFrame implements ActionListener {
    private JTextField txtNumero1, txtNumero2, txtResultado;
    private JButton btnSuma, btnResta, btnMultiplica, btnDivide;
    
    private Calculator calculator;

    public Calculador() {
        calculator = new Calculator();

        setTitle("Calculadora Básica");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("  Número 1:"));
        txtNumero1 = new JTextField();
        add(txtNumero1);

        add(new JLabel("  Número 2:"));
        txtNumero2 = new JTextField();
        add(txtNumero2);

        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplica = new JButton("*");
        btnDivide = new JButton("/");

        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplica.addActionListener(this);
        btnDivide.addActionListener(this);

        add(btnSuma);
        add(btnResta);
        add(btnMultiplica);
        add(btnDivide);

        add(new JLabel("  Resultado:"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        add(txtResultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(txtNumero1.getText());
            int num2 = Integer.parseInt(txtNumero2.getText());

            if (e.getSource() == btnSuma) {
                int res = calculator.add(num1, num2);
                txtResultado.setText(String.valueOf(res));
            } else if (e.getSource() == btnResta) {
                int res = calculator.subtract(num1, num2);
                txtResultado.setText(String.valueOf(res));
            } else if (e.getSource() == btnMultiplica) {
                int res = calculator.multiply(num1, num2);
                txtResultado.setText(String.valueOf(res));
            } else if (e.getSource() == btnDivide) {
                double res = calculator.divide(num1, num2);
                txtResultado.setText(String.valueOf(res));
            }
        } catch (NumberFormatException ex) {
            txtResultado.setText("Error: Entero inválido");
        } catch (ArithmeticException ex) {
            txtResultado.setText("Error: Div / 0");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculador().setVisible(true);
        });
    }
}