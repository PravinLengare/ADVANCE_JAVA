package com.pravin.Enum;

enum Laptop{
    Macbook(2000),DEl,Hp(1899);

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {   // why private con works because the objects are created in the class itself.
        this.price = price;
    }
    Laptop() {
        price = 400;
    }

}
public class EnumAsClass {
    public static void main(String[] args) {
//        Laptop lp = Laptop.DEl;
//        System.out.println(lp.getPrice()+" "+lp);
//        System.out.println(lp);

        Laptop []lp = Laptop.values();

        for (Laptop l : lp){
            System.out.println(l + " "+ l.getPrice());
        }
    }
}
