import org.junit.Test;
import static org.junit.Assert.*;

public class ProductSalesTest {

    @Test
    //GetSalesOverLimit_ReturnsNumberOfSales
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        ProductSales ps = new ProductSales();
        // Over 500: 700, 600 => 2
        assertEquals(2, ps.GetSalesOverLimit());
    }

    @Test
    //GetSalesUnderLimit_ReturnsNumberOfSales
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        ProductSales ps = new ProductSales();
        // Under 500: 300,150,250,200 => 4
        assertEquals(4, ps.GetSalesUnderLimit());
    }
}