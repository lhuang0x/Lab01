import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A JUnit test class for the Stock class
 */
public class StockTest {

  @Test
  public void testGetSymbol() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    assertEquals("Expected", "AAPL", Apple.getSymbol());
  }

  @Test
  public void testGetName() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    assertEquals("Expected", "Apple", Apple.getName());
  }

  @Test
  public void testGetCostBasis() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    assertEquals("Expected", 100, Apple.getCostBasis(),0.001);
  }

  @Test
  public void testSetCostBasis() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    assertEquals("Expected", 120, Apple.setCostBasis(120),0.001);
  }

  @Test
  public void testSetCurrentPrice() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    assertEquals("Expected", 3000, Apple.setCurrentPrice(3000),0.001);
  }

  @Test
  public void testGetCurrentPrice() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    Apple.setCurrentPrice(3000);
    assertEquals("Expected", 3000, Apple.getCurrentPrice(),0.001);
  }

  @Test
  public void testGetChangePercent() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    Apple.setCurrentPrice(3000);
    assertEquals("Expected", 29, Apple.getChangePercent(),0.001);
  }

  @Test
  public void testToString() {
    Stock Apple = new Stock("AAPL", "Apple", 100);
    Apple.setCurrentPrice(3000);
    assertEquals("Apple Current Price:$ 3000.00\n Gain/Loss: 2900.00%",
            Apple.toString());
  }
}
