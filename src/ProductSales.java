import java.util.Arrays;

public class ProductSales implements IProductSales {

    // Sales limit 
    public static final int SALES_LIMIT = 500;

//values given in paper     
    private final int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
    };

    @Override
    //getting sales
    public int[][] GetProductSakes() {
        return sales;
    }

    @Override
    //getting the total sales
    public int GetTotalSales() {
        int total = 0;
        for (int[] year : sales) {
            for (int q : year) total += q;
        }
        return total;
    }

    @Override
    //getting the average sales
    public double GetAverageSales() {
        int count = 0, total = 0;
        for (int[] year : sales) {
            for (int q : year) {
                total += q;
                count++;
            }
        }
        return count == 0 ? 0 : (double) total / count;
    }

    @Override
    // getting any sales over the limit
    public int GetSalesOverLimit() {
        int c = 0;
        for (int[] year : sales)
            for (int q : year)
                if (q > SALES_LIMIT) c++;
        return c;
    }

    @Override
    //geetting any salys under the limit
    public int GetSalesUnderLimit() {
        int c = 0;
        for (int[] year : sales)
            for (int q : year)
                if (q < SALES_LIMIT) c++;
        return c;
    }

    @Override
    public int GetProductsProcessed() {
        return sales.length; 
    }

    public int getMaxSale() {
        int max = Integer.MIN_VALUE;
        for (int[] year : sales)
            for (int q : year)
                max = Math.max(max, q);
        return max;
    }
    public int getMinSale() {
        int min = Integer.MAX_VALUE;
        for (int[] year : sales)
            for (int q : year)
                min = Math.min(min, q);
        return min;
    }
}
