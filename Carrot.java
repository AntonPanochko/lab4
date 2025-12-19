public final class Carrot extends Vegetable {
    public Carrot(String name, byte height, byte undergroundH) {
        super(name, height, undergroundH);
    }
    @Override
    public boolean isRipe() {
        return height >= 15;
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
        return name;
    }
}
