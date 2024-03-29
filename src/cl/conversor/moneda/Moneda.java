package cl.conversor.moneda;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

/**
 * Moneda currency representation `NAME (symbol, rate)`  
 */
public enum Moneda {
    MXN("\uf155", new BigDecimal("1")),
    CLP ("\uf155", new BigDecimal("51.24")),
    EUR ("\uf153", new BigDecimal("0.054")),
    USD ("\uf154", new BigDecimal("0.056")),
    JPY ("\uf157", new BigDecimal("8.45")),
    ARG ("\uf159", new BigDecimal("19.74")),
    GBP ("\uf159", new BigDecimal("0.047")),
    KRW ("\uf159", new BigDecimal("76.83"));
    private final String symbol;
    private final BigDecimal rate;

    Moneda (String symbol, BigDecimal rate){
        this.symbol = symbol;
        this.rate = rate;
    }

    /**
     * @return Currency symbol
     */
    public final String symbol() {
        return this.symbol;
    }
    
    /**
     * @return Currency rate
     */
    public final BigDecimal rate() {
        return this.rate;
    }
    
    /**
     * Converts to base currency (USD) at self.rate
     * @param monto amount to convert to base currency
     * @return BigDecimal base value
     */
    public final BigDecimal getBase(BigDecimal monto) {
        MathContext mc = new MathContext(20);
        return monto.divide(this.rate(),mc);
    }
    
    /**
     * Converts `monto` to `destino` currency
     * @param destino target conversion Currency 
     * @param monto amount
     * @return Double conversion
     */
    public final Double convert(Moneda destino, Double monto) {
        BigDecimal monto_orig = new BigDecimal(monto);
        monto_orig = getBase(monto_orig);
        return Double.valueOf(
                    monto_orig.multiply(
                            destino.rate(), new MathContext(20)).toString()
                );
    }
    
    /**
     * Check if `value` is part of enum Moneda
     * @param value String currency
     * @return true if value is an enum Moneda, otherwise returns false
     */
    public final static boolean esMoneda(String value) {
        for (Moneda e : Moneda.class.getEnumConstants()) {
            if(e.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns String representation of Double `monto`
     * @param monto Double amount for String representation
     * @return String representation of `monto`
     */
    public final static String monedaString(Double monto) {
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumFractionDigits(5);
        decFormat.setMinimumFractionDigits(0);
        return decFormat.format(monto);
    }
}
