public final class Neznaika extends Character {
    public Neznaika(String name, Basket basket, Rope rope, Vegetable veg) {
        super(name, basket, rope, veg);
    }

    @Override
    public void isHappy(Basket basket) {
        if (basket.isFull())
            System.out.println(name + " радуется полной корзине!");
        else
            System.out.println(name + " грустит: корзина не полная.");
    }

    @Override
    public void go(Basket basket) {
        if (basket.isFull())
            System.out.println(name + " идет домой с полной корзиной");
        else
            System.out.println(name + " остаётся помогать копать.");
    }

    @Override
    public void dig(Vegetable veg) {
        if (veg.isRipe()) {
            System.out.println(name + " помогает выкапывать " + veg.name + ".");
        } else {
            System.out.println(veg.name + " ещё не созрела для " + name);
        }
    }

    public boolean come() {
        return random.nextDouble() > 0.5;
    }

    public void help(Malishka malishka, Vegetable veg) {
        if (come()) {
            System.out.println("\n" + name + " пришёл помочь " + malishka.name + "!");
            dig(veg);
            malishka.dig(veg);
            basket.showContents();
        } else {
            throw new StoryEndException(name + " не пришёл на помощь. Никто не поможет выкопать урожай.");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
