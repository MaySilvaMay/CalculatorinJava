package com.mayara;

import javax.swing.*;
import java.awt.*;

public class TelaCalculadora extends JFrame {
    Calculadora calculo = new Calculadora();

    Dimension dFrame = new Dimension(200, 220);
    Dimension dLabel = new Dimension(100, 40);
    Dimension dTextField = new Dimension(100, 10);
    Dimension dButton = new Dimension(10, 10);

    JButton cmdSomar = new JButton("+");
    JButton cmdSubtrair = new JButton("-");
    JButton cmdDividir = new JButton("/");
    JButton cmdMultiplicar = new JButton("*");

    JTextField txtV1 = new JTextField(16);
    JTextField txtV2 = new JTextField(16);
    JTextField txtResult = new JTextField(16);

    JLabel lblV1 = new JLabel("Valor 1:");
    JLabel lblV2 = new JLabel("Valor 2:");
    JLabel lblResult = new JLabel("Resultado:");

    public TelaCalculadora() {
        JPanel panel = new JPanel();

        txtV1.setSize(this.dTextField);
        txtV2.setSize(this.dTextField);
        txtResult.setSize(this.dTextField);

        lblV1.setSize(this.dLabel);
        lblV2.setSize(this.dLabel);
        lblResult.setSize(this.dLabel);

        cmdSomar.setSize(this.dButton);
        cmdSubtrair.setSize(this.dButton);
        cmdDividir.setSize(this.dButton);
        cmdMultiplicar.setSize(this.dButton);

        panel.setBackground(Color.pink);

        panel.add(this.lblV1);
        panel.add(this.txtV1);

        panel.add(this.lblV2);
        panel.add(this.txtV2);

        panel.add(this.cmdSomar);
        panel.add(this.cmdSubtrair);
        panel.add(this.cmdMultiplicar);
        panel.add(this.cmdDividir);

        panel.add(this.lblResult);
        panel.add(this.txtResult);

        cmdSomar.addActionListener(actionEvent -> {
            try {
                calculo.setVlr1(Double.valueOf(txtV1.getText()));
                calculo.setVlr2(Double.valueOf(txtV2.getText()));
                calculo.soma();
                txtResult.setText(String.valueOf(calculo.getResult()));
            } catch (NumberFormatException e) {
                txtResult.setText("Valores inválidos!");
            }
        });

        cmdSubtrair.addActionListener(actionEvent -> {
            try {
                calculo.setVlr1(Double.valueOf(txtV1.getText()));
                calculo.setVlr2(Double.valueOf(txtV2.getText()));
                calculo.subtracao();
                txtResult.setText(String.valueOf(calculo.getResult()));
            } catch (NumberFormatException e) {
                txtResult.setText("Valores inválidos!");
            }
        });

        cmdMultiplicar.addActionListener(actionEvent -> {
            try {
                calculo.setVlr1(Double.valueOf(txtV1.getText()));
                calculo.setVlr2(Double.valueOf(txtV2.getText()));
                calculo.multiplicacao();
                txtResult.setText(String.valueOf(calculo.getResult()));
            } catch (NumberFormatException e) {
                txtResult.setText("Valores inválidos!");
            }
        });

        cmdDividir.addActionListener(actionEvent -> {
            try {
                calculo.setVlr1(Double.valueOf(txtV1.getText()));
                calculo.setVlr2(Double.valueOf(txtV2.getText()));
                calculo.divisao();
                txtResult.setText(String.valueOf(calculo.getResult()));
            } catch (NumberFormatException e) {
                txtResult.setText("Valores inválidos!");
            } catch (DivisionByZeroException e) {
                txtResult.setText("Divisão por zero!");
            }
        });

        this.add(panel);
        this.setSize(this.dFrame);
        this.setResizable(false);
        this.setTitle("Calculadora");
        this.setVisible(true);
    }
}
