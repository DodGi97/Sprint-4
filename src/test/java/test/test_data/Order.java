package test.test_data;

//тестовые данные для формирования закаказ (адрес, комментарий, телефон и тд. и тп.)
public class Order {
    public String address;
    public String numberPhone;
    public String deliveryDate;
    public String commentForOrder;

    public String setAddress(String address){
        return this.address = address;
    }

    public String setNumberPhone(String numberPhone){
        return this.numberPhone = numberPhone;
    }

    public String setDeliveryDate(String deliveryDate){
        return this.deliveryDate = deliveryDate;
    }

    public String setComment(String commentForOrder){
        return this.commentForOrder = commentForOrder;
    }

}
