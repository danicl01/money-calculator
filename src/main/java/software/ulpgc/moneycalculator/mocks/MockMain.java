package software.ulpgc.moneycalculator.mocks;

import software.ulpgc.moneycalculator.*;
import software.ulpgc.moneycalculator.command.Command;
import software.ulpgc.moneycalculator.command.ExchangeMoneyCommand;
import software.ulpgc.moneycalculator.model.Currency;

import java.util.List;

public class MockMain {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MoneyDialog moneyDialog = new MockMoneyDialog().define(currencies);
        CurrencyDialog currencyDialog = new MockCurrencyDialog().define(currencies);
        MoneyDisplay moneyDisplay = new MockMoneyDisplay();
        ExchangeRateLoader exchangeRateLoader = new MockExchangeRateLoader();
        Command command = new ExchangeMoneyCommand(moneyDialog, currencyDialog, exchangeRateLoader, moneyDisplay);
        command.execute();
    }
}
