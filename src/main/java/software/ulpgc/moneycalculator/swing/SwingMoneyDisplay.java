package software.ulpgc.moneycalculator.swing;

import software.ulpgc.moneycalculator.MoneyDisplay;
import software.ulpgc.moneycalculator.model.Money;

import javax.swing.*;

public class SwingMoneyDisplay extends JLabel implements MoneyDisplay {
    @Override
    public void show(Money money) {
        this.setText(money.toString());
    }
}
