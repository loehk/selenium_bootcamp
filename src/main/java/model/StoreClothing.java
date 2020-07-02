package model;

public class StoreClothing {

    private String itemName;
    private Integer itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

//    public void setItemPrice(String itemPrice){
//        String clearPrice = itemPrice.substring(1,itemPrice.length()-1);
//        this.itemPrice = Integer.valueOf(clearPrice);
//    }
}
