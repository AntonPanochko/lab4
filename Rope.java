import java.util.Random;

public class Rope {
    private final boolean hasRope;
    private final Random random = new Random();

    public Rope() {
        this.hasRope = random.nextDouble() > 0.7;
    }

    public void actionWithRope(Vegetable veg) {
        if (!hasRope) {
            System.out.println("Верёвки нет. Придётся копать лопатой.");
            return;
        }
        
        System.out.print("Пытаемся вытянуть " + veg.name + " верёвкой: ");
        while (veg.undergroundH > 0) {
            System.out.print("Тянем-потянем! ");
            veg.undergroundH--;
            if (random.nextDouble() < 0.1) {
                throw new RopeBreakException("Верёвка оборвалась!");
            }
        }
        System.out.println("\nУра! Вытянули " + veg.name + "!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return hasRope == ((Rope) o).hasRope;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(hasRope);
    }

    @Override
    public String toString() {
        return "Верёвка";
    }
}