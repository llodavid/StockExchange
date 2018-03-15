package be.llodavid.domain;

public enum StockCurrency {
    EUR ("Euro", "€"),
    USD ("Dollar" , "$"),
    GBP ("Pound", "£");

    String label, symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getLabel() {
        return label;
    }

    public String getSymbol() {
        return symbol;
    }
}
