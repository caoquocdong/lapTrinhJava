package JavaThucHanh02.com.bai4;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription,int quantity, double pricePerItem) 
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity < 0) 
        {
            this.quantity = 0;
        } 
        else 
        {
            this.quantity = quantity;
        }

        if (pricePerItem < 0) 
        {
            this.pricePerItem = 0.0;
        }
        else 
        {
            this.pricePerItem = pricePerItem;
        }
    }

    // Get Set
    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription) 
    {
        this.partDescription = partDescription;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        if (quantity < 0) 
        {
            this.quantity = 0;
        } 
        else 
        {
            this.quantity = quantity;
        }
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) 
    {
        if (pricePerItem < 0) 
        {
            this.pricePerItem = 0.0;
        } 
        else 
        {
            this.pricePerItem = pricePerItem;
        }
    }

    // Tính tổng tiền
    public double getInvoiceAmount()
    {
        return quantity * pricePerItem;
    }

    // Hiển thị
    public void hienThi()
    {

        System.out.println("Ma hang: " + partNumber);
        System.out.println("Mo ta: " + partDescription);
        System.out.println("So luong: " + quantity);
        System.out.println("Gia: " + pricePerItem);
        System.out.println("Tong tien: " + getInvoiceAmount());

        System.out.println("---------------------");
    }
}