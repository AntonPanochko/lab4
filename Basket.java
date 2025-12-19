public class Basket {
    private Vegetable[] basket = new Vegetable[10];
    private int currentIndex = 0;

    public boolean isFull() {
        return currentIndex >= basket.length;
    }

    public void addVegetable(Vegetable veg, Material material) {
        
        basket[currentIndex] = veg;
        currentIndex++;
        System.out.println("В корзину добавлен " + veg.name + ".");
    }

    public void fillBasket(Material material) {

        int freeSpace = basket.length - currentIndex;
        
        System.out.println("Дополняем корзину до полного объёма (" + freeSpace + " мест):");

        for (int i = currentIndex; i < basket.length; i++) {
            if (material == Material.PAPER) {
                basket[i] = new Carrot("Морковка", (byte) 15, (byte) 2);
            } else {
                if (i % 2 == 0){
                    basket[i] = new Turnip("Репка", (byte) 25, (byte) 5); 
                } else
                    new Carrot("Морковка", (byte) 15, (byte) 2);
            }
        }
        currentIndex = basket.length;
        System.out.println("Корзина успешно дополнена!");
    }

    public void showContents() {
        System.out.print("\nСодержимое корзины: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(basket[i].name + " ");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
