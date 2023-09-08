public class Order implements Comparable<Order>{
    private Integer orderNumber;
    private Integer artNumber;

    public Integer getArtNumber() {
        return artNumber;

    }
    public Order(Integer orderNumber, Integer art) {
        this.orderNumber = orderNumber;
        this.artNumber = art;
    }

    public Order(Integer orderNumber) {
        this(orderNumber, null);
    }

    @Override
    public int compareTo(Order art) {
        return Integer.compare(this.artNumber, art.artNumber);
    }
}
