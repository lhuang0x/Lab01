import java.text.DecimalFormat;

/**
 * Lijie Huang
 * CS5004 Lab01
 * This class represents a stock. A stock has a symbol, name, a costBasis, and current price.
 */
public class Stock {
  private final String symbol;
  private final String name;
  private final double costBasis;
  private double currentPrice;

  /**
   * Construct a Stock object that has the provided a symbol, name, an original purchase price,
   * and current price.
   *
   * @param symbol  the symbol to be given to this stock
   * @param name the name to be given to this stock
   * @param costBasis  the purchase price to be assigned to this book
 */
  public Stock(String symbol, String name, double costBasis) {
    this.symbol = symbol;
    this.name = name;
    this.costBasis = costBasis;
  }
  /**
   * Get the symbol of this stock.
   *
   * @return the symbol of this stock
   */

  public String getSymbol() {
    return this.symbol;
  }
  /**
   * Get the name of this stock.
   *
   * @return the name of this stock
   */

  public String getName() {
    return this.name;
  }
  /**
   * Get the cost basis of this stock.
   *
   *@return the cost basis of this stock
   */

  public double getCostBasis() {
    return this.costBasis;
  }
  /**
   * Get the current price of this stock.
   *
   * @return the current price of this stock
   */

  public double getCurrentPrice() {
    return this.currentPrice;
  }
  /**
   * Set the cost basis of this stock.
   *
   * @return the cost basis of this stock
   */

  public double setCostBasis(double costBasis) {
    return this.currentPrice = costBasis;
  }
  /**
   * Set the current price of this stock.
   *
   * @return the current price of this stock
   */

  public double setCurrentPrice(double currentPrice) {
    return this.currentPrice = currentPrice;
  }
  /**
   * Calculate fractional change between the original cost basis and the current price.
   *
   * @return the fractional change between the original cost basis and the current price
   */

  public double getChangePercent() {
    return (this.currentPrice - this.costBasis) / this.costBasis;
  }
  /**
   * Print a String version of display of the Stock's info.
   *
   * @return display of the Stock's info
   */

  public String toString() {
    DecimalFormat money = new DecimalFormat("$ 0.00");
    DecimalFormat percent = new DecimalFormat("0.00%");
    return this.name + " Current Price:"
            + money.format(this.currentPrice) + "\n Gain/Loss: "
            + percent.format(this.getChangePercent());
  }
}





