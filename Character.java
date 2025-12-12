import java.util.Random;

abstract class Character implements Behavior {
    protected String name;
    protected Basket basket;
    protected Rope rope;
    protected Vegetable veg;
    protected Random random = new Random();

    public Character(String name, Basket basket, Rope rope, Vegetable veg) {
        this.name = name;
        this.basket = basket;
        this.rope = rope;
        this.veg = veg;
    }
}