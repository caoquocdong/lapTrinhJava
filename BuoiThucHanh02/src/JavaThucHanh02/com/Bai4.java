package JavaThucHanh02.com;

public class Bai4 {

    // Class Invoice
    static class Invoice {

        // Thuộc tính
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double pricePerItem;

        // Constructor
        public Invoice(String partNumber, String partDescription,
                       int quantity, double pricePerItem) {

            this.partNumber = partNumber;
            this.partDescription = partDescription;

            // kiểm tra quantity
            if (quantity < 0) {
                this.quantity = 0;
            } else {
                this.quantity = quantity;
            }

            // kiểm tra price
            if (pricePerItem < 0) {
                this.pricePerItem = 0.0;
            } else {
                this.pricePerItem = pricePerItem;
            }
        }

        // Getter và Setter

        public String getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public String getPartDescription() {
            return partDescription;
        }

        public void setPartDescription(String partDescription) {
            this.partDescription = partDescription;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                this.quantity = 0;
            } else {
                this.quantity = quantity;
            }
        }

        public double getPricePerItem() {
            return pricePerItem;
        }

        public void setPricePerItem(double pricePerItem) {
            if (pricePerItem < 0) {
                this.pricePerItem = 0.0;
            } else {
                this.pricePerItem = pricePerItem;
            }
        }

        // Hàm tính tổng tiền
        public double getInvoiceAmount() {
            return quantity * pricePerItem;
        }
    }

    public static void main(String[] args) {

        Invoice hd = new Invoice(
                "MH01",
                "Ban phim co",
                3,
                500000
        );

        System.out.println("Ma hang: " + hd.getPartNumber());
        System.out.println("Mo ta: " + hd.getPartDescription());
        System.out.println("So luong: " + hd.getQuantity());
        System.out.println("Gia: " + hd.getPricePerItem());

        System.out.println("Tong tien: " + hd.getInvoiceAmount());
    }
}