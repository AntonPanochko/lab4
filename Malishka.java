public final class Malishka extends Character {
    public Malishka(String name, Basket basket, Rope rope, Vegetable veg) {
        super(name, basket, rope, veg);
    }

    @Override
    public void isHappy(Basket basket) {
        if (basket.isFull()) {
            System.out.println(name + " и другие детки счастливы!");
        } else {
            System.out.println(name + " расстроилась: корзина неполная...");
        }
    }

    @Override
    public void go(Basket basket) {
        if (basket.isFull()) {
            System.out.println("Раз корзинка наполнена, " + name + " идёт домой. Ура!");
        } else {
            System.out.println(name + " зовёт Незнайку на помощь.");
        }
    }

    @Override
    public void dig(Vegetable veg) {
        if (veg.isRipe()) {
            System.out.println(name + " старательно копает и выкапывает " + veg.name + "!");
            addToBasket(veg);
        } else {
            System.out.println(veg.name + " ещё слишком мала для " + name);
        }
    }

    private void addToBasket(Vegetable veg) {
        try {
            basket.addVegetable(veg, Material.BAMBOO);
        } catch (IllegalArgumentException e) {
            System.out.println("Ой! " + e.getMessage() + " " + name + " расстроилась.");
        }
    }

    public void talk(Neznaika neznaika) {
        if (neznaika != null) {
            System.out.println("\n" + name + " кричит: \"Эй, " + neznaika.name + "! Иди сюда скорее!\"");
            if (neznaika.come()) {
                System.out.println(neznaika.name + " отвечает: \"Бегу!\"");
            }
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